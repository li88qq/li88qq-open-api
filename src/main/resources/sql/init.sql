insert into User (id, username, nickname, password, createDate)
values (1, 'admin', '管理员', '123456', UNIX_TIMESTAMP(now()));

insert into Menu(id, name, parentId, parentIds, href, icon, tabsHref, sort, menuType)
values (1, '我的', 0, null, null, null, null, 1, -1),
       (2, '概览', 1, '1', '/my/view', null, null, 1, -1),
       (3, '工作台', 1, '1', '/my/workbench', null, null, 2, -1),
       (4, '设置', 1, '1', '/my/setting', null, null, 3, -1),
       (5, '记录', 1, '1', null, null, null, 4, -1),
       (6, '登录记录', 5, '1,5', '/log/login', null, null, 1, -1),
       (7, '操作记录', 5, '1,5', '/log/action', null, null, 2, -1),
       (8, '系统管理', 0, NULL, NULL, '', NULL, 2, 0),
       (9, '用户管理', 8, '8', '/system/user', '', NULL, 1, 0),
       (10, '菜单管理', 8, '8', '/system/menu', '', NULL, 2, 0)