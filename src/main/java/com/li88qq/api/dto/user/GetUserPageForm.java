package com.li88qq.api.dto.user;

import com.li88qq.db.dto.page.PageForm;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * 分页查询
 *
 * @author li88qq
 * @version 1.0 2023/8/26 18:47
 */
public class GetUserPageForm extends PageForm {

    private String username;
    private String nickname;
    private String password;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate beginDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;

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

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
