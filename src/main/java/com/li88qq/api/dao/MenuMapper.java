package com.li88qq.api.dao;

import com.li88qq.api.entity.Menu;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 菜单
 *
 * @author li88qq
 * @version 1.0 2023/8/27 17:34
 */
public interface MenuMapper {

    /**
     * 查询全部
     */
    @Select("select * from Menu order by parentId asc,sort asc")
    List<Menu>findAll();
}
