package com.li88qq.api.dto.my;

/**
 * 获取我的菜单列表
 *
 * @author li88qq
 * @version 1.0 2023/8/27 17:27
 */
public class MyMenu {

    private Integer id;
    private Integer parentId;//父节点id
    private String name;//名称
    private String href;//路由
    private String icon;//图标
    private String tabsHref;//标签页路径

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
}
