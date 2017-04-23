package com.flymegoc.controller;

import com.flymegoc.model.SprUser;
import com.flymegoc.model.SprUserExample;
import com.flymegoc.service.UserService;
import com.flymegoc.utils.BaseResult;
import com.flymegoc.utils.PasswordHash;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;

/**
 * Created by flymegoc on 2017/4/21.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;


    /**
     * 用户登出
     *
     * @return
     */
    @RequestMapping("/logout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "login";
    }

    /**
     * 用户注册
     */
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    protected BaseResult<SprUser> register(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("email") String email) throws InvalidKeySpecException, NoSuchAlgorithmException {

        BaseResult<SprUser> result = new BaseResult<>();

        if (!StringUtils.isEmpty(username) && !StringUtils.isEmpty(password)) {
            if (!StringUtils.isEmpty(email)) {
                SprUserExample userExample = new SprUserExample();
                userExample.or().andSprUserEmailEqualTo(email);
                List<SprUser> userList = userService.selectByExample(userExample);
                if (userList != null && userList.size() > 0) {
                    if (email.contains("@")) {
                        result.code = 1;
                        result.message = "邮箱已被注册";
                    }
                } else {
                    String passWordHash = PasswordHash.createHash(password);
                    SprUser user = new SprUser();
                    user.setSprUserName(username);
                    user.setSprUserPassword(passWordHash);
                    user.setSprUserEmail(email);
                    int i = userService.insert(user);
                    if (i >= 1) {
                        user.setSprUserPassword("");
                        result.code = 200;
                        result.message = "注册成功";
                        result.data = user;
                    } else {
                        result.code = 1;
                        result.message = "注册失败，发生异常";
                    }
                }
            }

        } else {
            result.code = 1;
            result.message = "参数填写不完整";
        }
        return result;
    }

    /**
     * 登录示例
     *
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public BaseResult login(@RequestParam("username") String userName, @RequestParam("password") String passWord) {
        logger.info("开始登录认证");
        BaseResult<SprUser> result = new BaseResult<>();

        UsernamePasswordToken token = new UsernamePasswordToken(userName, passWord);
        Subject currentUser = SecurityUtils.getSubject();

        try {
            if (!currentUser.isAuthenticated()) {
                token.setRememberMe(true);
                currentUser.login(token);
                //List<SprUser> users=userService.findUser(currentUser.getPrincipal().toString());
                SprUserExample userExample = new SprUserExample();
                userExample.or().andSprUserNameEqualTo(currentUser.getPrincipal().toString());
                List<SprUser> users = userService.selectByExample(userExample);
                if (users.size() != 0) {
                    result.data = users.get(0);
                }
                result.code = 200;
                result.message = "登录成功";
            }
        } catch (Exception e) {
            //e.printStackTrace();
            result.code = 1;
            result.message = "登录失败了,用户名或者密码错误";
        }
        return result;
    }
}
