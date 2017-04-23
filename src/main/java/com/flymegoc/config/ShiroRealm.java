package com.flymegoc.config;

import com.flymegoc.model.SprUser;
import com.flymegoc.model.SprUserExample;
import com.flymegoc.model.SprUserRole;
import com.flymegoc.model.SprUserRoleExample;
import com.flymegoc.service.UserRoleService;
import com.flymegoc.service.UserService;
import com.flymegoc.utils.PasswordHash;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by flymegoc on 2017/4/21.
 */
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRoleService userRoleService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        //LoginUser user = (LoginUser) SecurityUtils.getSubject().getSession().getAttribute(AuthAppConfig.LOGIN_USER);
        String currentLoginName = (String) principalCollection.getPrimaryPrincipal();

        SprUserExample userExample = new SprUserExample();
        userExample.or().andSprUserNameEqualTo(currentLoginName);
        List<SprUser> user = userService.selectByExample(userExample);

        if (user != null) {
            // 当前用户角色编码集合
            //获取当前用户下所有ACL权限列表 待续。。。
            //获取当前用户下拥有的所有角色列表
            SprUserRoleExample userRoleExample = new SprUserRoleExample();
            userRoleExample.or().andSprUserIdEqualTo(user.get(0).getSprUserId());
            List<SprUserRole> roles = userRoleService.selectByExample(userRoleExample);
            List<String> roleIds = new ArrayList<>();
            for (SprUserRole role : roles) {
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
        //LoginUser user = userService.findByUsername(token.getUsername());
        SprUserExample userExample = new SprUserExample();
        userExample.or().andSprUserNameEqualTo(token.getUsername());
        List<SprUser> user = userService.selectByExample(userExample);

        try {
            if (user != null && user.size() == 1 && PasswordHash.validatePassword(token.getPassword(), user.get(0).getSprUserPassword())) {
                return new SimpleAuthenticationInfo(user.get(0).getSprUserName(), token.getPassword(), getName());
            } else {
                throw new AuthenticationException();
            }
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
            throw new AuthenticationException();
        }
//        String userPassword = user.get(0).getSprUserPassword();
//        return new SimpleAuthenticationInfo(token.getUsername(), userPassword, getName());
    }
}
