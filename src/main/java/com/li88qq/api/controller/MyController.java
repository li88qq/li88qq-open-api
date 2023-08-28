package com.li88qq.api.controller;

import com.li88qq.api.dto.my.MyInfo;
import com.li88qq.api.dto.my.MyMenu;
import com.li88qq.api.service.MyService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 我的
 *
 * @author li88qq
 * @version 1.0 2023/8/27 17:24
 */
@RestController
@RequestMapping({"/my"})
public class MyController {

    @Resource
    private MyService myService;

    /**
     * 获取我的信息
     */
    @GetMapping("/info")
    public MyInfo getInfo() {
        return myService.getInfo();
    }

    /**
     * 获取我的菜单
     */
    @GetMapping("/menu")
    public List<MyMenu> getMenu() {
        return myService.getMenu();
    }
}
