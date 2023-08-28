CREATE TABLE `User`
(
    id         INT    NOT NULL AUTO_INCREMENT COMMENT '主键',
    username   VARCHAR(32) COMMENT '用户名',
    nickname   VARCHAR(32) COMMENT '昵称',
    `password` VARCHAR(32) COMMENT '密码',
    createDate BIGINT NOT NULL DEFAULT 0 COMMENT '创建时间',
    PRIMARY KEY (id),
    UNIQUE KEY (username)
) COMMENT '用户表';

CREATE table Menu
(
    id        INT NOT NULL AUTO_INCREMENT COMMENT '主键',
    `name`    varchar(32) comment '菜单名称',
    parentId  int not null default 0 comment '父节点id',
    parentIds varchar(255) comment '父节点id列表,逗号,隔开',
    href      varchar(255) comment '路径',
    icon      varchar(255) comment '图标',
    tabsHref  varchar(255) comment '标签页路径',
    sort      int not null default 0 comment '排序,升序',
    menuType  int not null default 0 comment '类型,如果是-1,则为默认授权',
    primary key (id)
) comment '菜单表';
