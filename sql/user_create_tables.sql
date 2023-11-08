-- auto-generated definition
create table user
(
    id           bigint auto_increment
        primary key,
    username     varchar(256)                        null comment '用户名
',
    userAccount  varchar(256)                        null,
    avatarUrl    varchar(1024)                       null comment '用户头像
',
    gender       tinyint                             null comment '性别',
    userPassword varchar(512)                        not null,
    phone        varchar(128)                        null comment '电话',
    email        varchar(512)                        null comment '邮箱
',
    userStatus   int       default 0                 null comment '状态
0 - 正常',
    createTime   timestamp default CURRENT_TIMESTAMP null,
    updateTime   timestamp default CURRENT_TIMESTAMP not null,
    isDelete     tinyint   default 0                 not null,
    userRole     int       default 0                 not null comment '0 - 普通用户
1 - 管理员',
    planetCode   varchar(512)                        null comment '星球编号'
)
    comment '用户';

