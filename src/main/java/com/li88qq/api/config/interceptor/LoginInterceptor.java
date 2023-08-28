package com.li88qq.api.config.interceptor;

import com.li88qq.api.config.constant.ResponseCode;
import com.li88qq.api.dto.UserToken;
import com.li88qq.api.dto.exception.ResponseException;
import com.li88qq.api.utils.SessionUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * 登录拦截器
 *
 * @author li88qq
 * @version 1.0 2023/8/26 19:27
 */
@Configuration
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        UserToken token = SessionUtil.getToken();
        if (token != null) {
            return true;
        }
        throw new ResponseException(ResponseCode.NO_LOGIN);
    }
}
