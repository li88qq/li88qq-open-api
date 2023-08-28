package com.li88qq.api.service.impl;

import com.li88qq.api.dao.MenuMapper;
import com.li88qq.api.dao.UserMapper;
import com.li88qq.api.dto.UserToken;
import com.li88qq.api.dto.my.MyInfo;
import com.li88qq.api.dto.my.MyMenu;
import com.li88qq.api.entity.Menu;
import com.li88qq.api.entity.User;
import com.li88qq.api.service.MyService;
import com.li88qq.api.utils.SessionUtil;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 我的
 *
 * @author li88qq
 * @version 1.0 2023/8/27 17:30
 */
@Service
public class MyServiceImpl implements MyService {

    @Resource
    private UserMapper userMapper;
    @Resource
    private MenuMapper menuMapper;

    /**
     * 获取我的信息
     */
    @Override
    public MyInfo getInfo() {
        UserToken token = SessionUtil.getToken();
        User user = userMapper.findById(token.getId());
        MyInfo myInfo = new MyInfo();

        BeanUtils.copyProperties(user, myInfo);

        //个人主页
        String home = "/my/view";
        myInfo.setHome(home);
        return myInfo;
    }

    /**
     * 获取我的菜单
     */
    @Override
    public List<MyMenu> getMenu() {
        List<MyMenu> myMenus = new ArrayList<>();

        List<Menu> menus = menuMapper.findAll();
        menus.forEach(menu -> {
            MyMenu myMenu = new MyMenu();
            BeanUtils.copyProperties(menu, myMenu);
            myMenus.add(myMenu);
        });
        return myMenus;
    }
}
