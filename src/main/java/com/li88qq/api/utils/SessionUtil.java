package com.li88qq.api.utils;

import com.li88qq.api.dto.UserToken;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * session工具类
 *
 * @author li88qq
 * @version 1.0 2023/8/26 21:38
 */
public class SessionUtil {

    private static final String KEY_TOKEN = "token";

    /**
     * 获取request
     *
     * @return request
     */
    public static HttpServletRequest getRequest() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return requestAttributes.getRequest();
    }

    /**
     * 获取session
     *
     * @return session
     */
    public static HttpSession getSession(boolean flag) {
        HttpServletRequest request = getRequest();
        return request.getSession(flag);
    }

    /**
     * 设置token
     *
     * @param userToken token
     */
    public static void setToken(UserToken userToken) {
        HttpSession session = getSession(true);
        //有效期,单位秒
        session.setMaxInactiveInterval(5 * 60);
        session.setAttribute(KEY_TOKEN, userToken);
    }

    /**
     * 获取token
     *
     * @return token
     */
    public static UserToken getToken() {
        HttpSession session = getSession(false);
        if (session == null) {
            return null;
        }
        Object tokenValue = session.getAttribute(KEY_TOKEN);
        if (tokenValue != null) {
            return (UserToken) tokenValue;
        }
        return null;
    }

    /**
     * 移除token
     */
    public static void removeToken() {
        HttpSession session = getSession(false);
        if (session != null) {
            session.removeAttribute(KEY_TOKEN);
        }
    }
}
