create table user
(
    id           bigint auto_increment comment 'id'
        primary key,
    username     varchar(256)                                                                                         null comment '用户昵称',
    userAccount  varchar(256)                                                                                         null comment '账号',
    avatarUrl    varchar(1024) default 'https://gravatar.com/avatar/631aade200ee3144611c321eb56781e5?s=400&d=mp&r=x;' null comment '用户头像',
    gender       tinyint                                                                                              null comment '性别 1 - 男 0 - 女',
    userPassword varchar(512)                                                                                         not null comment '密码',
    phone        varchar(128)                                                                                         null comment '电话',
    email        varchar(512)                                                                                         null comment '邮箱',
    userStatus   int           default 0                                                                              null comment '状态',
    createTime   datetime      default CURRENT_TIMESTAMP                                                              null comment '创建时间',
    updateTime   datetime      default CURRENT_TIMESTAMP                                                              null on update CURRENT_TIMESTAMP comment '更新时间',
    isDelete     tinyint       default 0                                                                              null comment '是否删除',
    userRole     int           default 0                                                                              null comment '用户角色 0 - 普通用户 1 - 管理员
',
    netId        varchar(512)                                                                                         null comment '编号'
)
    comment '用户' engine = InnoDB;

