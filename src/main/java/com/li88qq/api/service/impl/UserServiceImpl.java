package com.li88qq.api.service.impl;

import com.li88qq.api.dao.BaseMapper;
import com.li88qq.api.dao.UserMapper;
import com.li88qq.api.dto.BaseResponse;
import com.li88qq.api.dto.user.GetUserPageForm;
import com.li88qq.api.dto.user.SaveUserForm;
import com.li88qq.api.entity.User;
import com.li88qq.api.service.UserService;
import com.li88qq.api.utils.ResponseUtil;
import com.li88qq.db.dto.page.Page;
import com.li88qq.db.dto.page.Pageable;
import com.li88qq.db.dto.page.TPage;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户
 *
 * @author li88qq
 * @version 1.0 2023/8/26 18:22
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private BaseMapper baseMapper;
    @Resource
    private UserMapper userMapper;

    /**
     * 新增
     */
    @Override
    @Transactional
    public BaseResponse save(SaveUserForm form) {
        User user = new User();

        BeanUtils.copyProperties(form, user);

        baseMapper.insertNoId(user);
        return ResponseUtil.ok();
    }

    /**
     * 分页查询
     */
    @Override
    public TPage<User> getPage(GetUserPageForm form) {
        Pageable pageable = new Pageable(form.getPage(), form.getPageSize());
        Page<User> userPage = userMapper.getPage(form, pageable);
        return userPage.build();
    }
}
