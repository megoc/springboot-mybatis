package com.flymegoc.config;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.flymegoc.model.User;
import com.flymegoc.model.UserRole;
import com.flymegoc.service.IUserRoleService;
import com.flymegoc.service.IUserService;
import com.flymegoc.utils.PasswordHash;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.List;

/**登陆认证和权限认证
 * Created by flymegoc on 2017/4/21.
 */
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private IUserService userService;

    @Autowired
    private IUserRoleService userRoleService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        //LoginUser user = (LoginUser) SecurityUtils.getSubject().getSession().getAttribute(AuthAppConfig.LOGIN_USER);
        String currentLoginName = (String) principalCollection.getPrimaryPrincipal();

        User user = userService.selectByLoginName(currentLoginName);

        if (user != null) {
            // 当前用户角色编码集合
            //获取当前用户下所有ACL权限列表 待续。。。
            //获取当前用户下拥有的所有角色列表

            List<UserRole> roles = userRoleService.selectUserRoleListByUserId(user.getSprUserId());

            List<String> roleIds = new ArrayList<>();
            for (UserRole role : roles) {
                roleIds.add(String.valueOf(role.getSprRoleId()));
            }
            authorizationInfo.addRoles(roleIds);
            //TODO add permits
            //authorizationInfo.addStringPermissions(null);
        }
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        if (StringUtils.isEmpty(token.getUsername())) {
            throw new IncorrectCredentialsException("username is null!");
        } else if (StringUtils.isEmpty(token.getCredentials())) {
            throw new IncorrectCredentialsException("password is null!");
        }

        User user = userService.selectByLoginName(token.getUsername());

        try {
            if (user != null && PasswordHash.validatePassword(token.getPassword(), user.getSprUserPassword())) {
                return new SimpleAuthenticationInfo(user.getSprUserName(), token.getPassword(), getName());
            } else {
                throw new AuthenticationException();
            }
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
            throw new AuthenticationException();
        }
    }
}
