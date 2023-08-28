package com.li88qq.api.service;

import com.li88qq.api.dto.BaseResponse;
import com.li88qq.api.dto.user.GetUserPageForm;
import com.li88qq.api.dto.user.SaveUserForm;
import com.li88qq.api.entity.User;
import com.li88qq.db.dto.page.TPage;

/**
 * 用户
 *
 * @author li88qq
 * @version 1.0 2023/8/26 18:21
 */
public interface UserService {

    /**
     * 新增
     */
    BaseResponse save(SaveUserForm form);

    /**
     * 分页查询
     */
    TPage<User> getPage(GetUserPageForm form);
}
