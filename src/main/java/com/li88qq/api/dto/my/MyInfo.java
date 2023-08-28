package com.li88qq.api.dto.my;

/**
 * 我的信息
 *
 * @author li88qq
 * @version 1.0 2023/8/27 17:25
 */
public class MyInfo {

    private String username;
    private String nickname;
    private Long createDate;
    private String home;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
}
