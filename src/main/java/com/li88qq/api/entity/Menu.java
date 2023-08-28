package com.li88qq.api.entity;

import com.li88qq.db.annotion.Id;

/**
 * 菜单
 *
 * @author li88qq
 * @version 1.0 2023/8/27 11:26
 */
public class Menu {

    @Id
    private Integer id;//主键id
    private Integer parentId = 0;//父节点id
    private String name;//名称
    private String parentIds;//父节点id列表,逗号,隔开
    private String href;//路由
    private String icon;//图标
    private String tabsHref;//标签页路径
    private Integer sort;//排序
    private Integer menuType = 0;//类型,如果是-1,则为默认授权

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTabsHref() {
        return tabsHref;
    }

    public void setTabsHref(String tabsHref) {
        this.tabsHref = tabsHref;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getMenuType() {
        return menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }
}
