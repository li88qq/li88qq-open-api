package com.li88qq.api.service.impl;

import com.li88qq.api.dao.UserMapper;
import com.li88qq.api.dto.BaseResponse;
import com.li88qq.api.dto.UserToken;
import com.li88qq.api.dto.login.LoginForm;
import com.li88qq.api.entity.User;
import com.li88qq.api.service.LoginService;
import com.li88qq.api.utils.ResponseUtil;
import com.li88qq.api.utils.SessionUtil;
import com.li88qq.api.utils.UuidUtil;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * 登录
 *
 * @author li88qq
 * @version 1.0 2023/8/26 21:28
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private UserMapper userMapper;

    /**
     * 登录
     */
    @Override
    public BaseResponse login(LoginForm form) {
        String username = form.getUsername();
        String password = form.getPassword();
        User user = userMapper.findByUsername(username);
        if (user == null) {
            return ResponseUtil.error("用户名或密码错误");
        }
        if (!password.equals(user.getPassword())) {
            return ResponseUtil.error("用户名或密码错误");
        }

        UserToken userToken = new UserToken();
        userToken.setId(user.getId());
        SessionUtil.setToken(userToken);

        return ResponseUtil.ok();
    }

    /**
     * 登出
     */
    @Override
    public BaseResponse logout() {
        SessionUtil.removeToken();
        return ResponseUtil.ok();
    }
}
