insert into User (id, username, nickname, password, createDate)
values (1, 'admin', '管理员', '123456', UNIX_TIMESTAMP(now()));

insert into Menu(id, name, parentId, parentIds, href, icon, tabsHref, sort, menuType)
values (1, '我的', 0, null, null, null, null, 1, -1),
       (2, '概览', 1, '1', '/my/view', null, null, 1, -1),
       (3, '工作台', 1, '1', '/my/workbench', null, null, 2, -1),
       (4, '设置', 1, '1', '/my/setting', null, null, 3, -1),
       (5, '记录', 1, '1', null, null, null, 4, -1),
       (6, '登录记录', 5, '1,5', '/my/loginlog', null, null, 1, -1),
       (7, '操作记录', 5, '1,5', '/my/actionlog', null, null, 2, -1);