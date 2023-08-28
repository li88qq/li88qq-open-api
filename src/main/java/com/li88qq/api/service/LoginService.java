package com.li88qq.api.service;

import com.li88qq.api.dto.BaseResponse;
import com.li88qq.api.dto.login.LoginForm;

/**
 * 登录
 *
 * @author li88qq
 * @version 1.0 2023/8/26 21:25
 */
public interface LoginService {

    /**
     * 登录
     */
    BaseResponse login(LoginForm form);

    /**
     * 登出
     */
    BaseResponse logout();
}
