package com.li88qq.api.dao;

import com.li88qq.api.dto.user.GetUserPageForm;
import com.li88qq.api.entity.User;
import com.li88qq.db.annotion.Condition;
import com.li88qq.db.annotion.PageId;
import com.li88qq.db.dto.page.Page;
import com.li88qq.db.dto.page.Pageable;
import com.li88qq.db.enums.Format;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 用户
 *
 * @author li88qq
 * @version 1.0 2023/8/26 18:20
 */
public interface UserMapper {

    /**
     * 分页查询
     */
    @Select("select * from User :where order by id desc")
    @Condition(value = "username like :form.username", f = Format.LIKE)
    @Condition(value = "nickname like :form.nickname", f = Format.LIKE)
    @Condition(value = "password like :form.password", f = Format.LIKE)
    @Condition(value = "createDate >= :form.beginDate", f = Format.TS_MIN)
    @Condition(value = "createDate <= :form.endDate", f = Format.TS_MAX)
    @PageId(countField = "id")
    Page<User> getPage(@Param("form") GetUserPageForm form, Pageable pageable);

    /**
     * 根据用户名查询用户
     */
    @Select("select * from User where username = #{username}")
    User findByUsername(@Param("username") String username);

    /**
     * 根据id查询
     */
    @Select("select * from User where id = #{id}")
    User findById(@Param("id") Integer id);
}
