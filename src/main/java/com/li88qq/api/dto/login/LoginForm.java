package com.li88qq.api.dto.login;

/**
 * 登录
 *
 * @author li88qq
 * @version 1.0 2023/8/26 21:26
 */
public class LoginForm {

    private String username;
    private String password;
    private String code;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
