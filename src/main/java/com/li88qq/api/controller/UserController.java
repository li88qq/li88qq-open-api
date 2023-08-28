package com.li88qq.api.controller;

import com.li88qq.api.dto.BaseResponse;
import com.li88qq.api.dto.user.GetUserPageForm;
import com.li88qq.api.dto.user.SaveUserForm;
import com.li88qq.api.entity.User;
import com.li88qq.api.service.UserService;
import com.li88qq.db.dto.page.TPage;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理
 *
 * @author li88qq
 * @version 1.0 2023/8/26 18:18
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 新增
     */
    @PostMapping("/save")
    public BaseResponse save(@Validated SaveUserForm form) {
        return userService.save(form);
    }

    /**
     * 分页查询
     */
    @GetMapping("/getPage")
    public TPage<User>getPage(GetUserPageForm form){
        return userService.getPage(form);
    }

}
