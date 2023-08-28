package com.li88qq.api.controller;

import com.li88qq.api.dto.BaseResponse;
import com.li88qq.api.dto.login.LoginForm;
import com.li88qq.api.service.LoginService;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录
 *
 * @author li88qq
 * @version 1.0 2023/8/26 18:40
 */
@RestController
public class LoginController {

    @Resource
    private LoginService loginService;

    /**
     * 登录
     */
    @PostMapping("/login")
    public BaseResponse login(@Validated @RequestBody LoginForm form) {
        return loginService.login(form);
    }

    /**
     * 登出
     */
    @PostMapping("/logout")
    public BaseResponse logout() {
        return loginService.logout();
    }
}
