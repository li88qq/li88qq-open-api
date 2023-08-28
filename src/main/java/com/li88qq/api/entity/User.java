package com.li88qq.api.entity;

import com.li88qq.api.utils.DateUtil;
import com.li88qq.db.annotion.Id;

/**
 * 用户
 *
 * @author li88qq
 * @version 1.0 2023/8/26 18:13
 */
public class User {

    @Id
    private Integer id;//主键
    private String username;//用户名
    private String nickname;//昵称
    private String password;//密码
    private Long createDate = DateUtil.getTimestamp();//创建时间，时间戳

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }
}
