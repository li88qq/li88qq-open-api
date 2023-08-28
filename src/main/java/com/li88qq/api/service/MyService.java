package com.li88qq.api.service;

import com.li88qq.api.dto.my.MyInfo;
import com.li88qq.api.dto.my.MyMenu;

import java.util.List;

/**
 * 我的
 *
 * @author li88qq
 * @version 1.0 2023/8/27 17:29
 */
public interface MyService {

    /**
     * 获取我的信息
     */
    MyInfo getInfo();

    /**
     * 获取我的菜单
     */
    List<MyMenu> getMenu();
}
