-- *********** department ***********
-- 删除department表相关数据
DROP TABLE IF EXISTS public.department;
DROP SEQUENCE IF EXISTS public.department_id_seq;
DROP INDEX IF EXISTS public.department_code_uindex;
DROP INDEX IF EXISTS public.department_name_uindex;

-- 创建department表
CREATE TABLE IF NOT EXISTS public."department"
(
    id             serial PRIMARY KEY,             -- id:主键、自增、非空
    flag           int8    NOT NULL DEFAULT 0,     -- 状态，0正常存在，-id已被删除
    code           varchar NOT NULL,               -- 唯一code
    name           varchar NOT NULL,               -- 显示名

    fullName       varchar,                        -- 部门全称
    parent_code    varchar NOT NULL default 0,     -- 父级部门code:0顶级部门
    location       varchar,                        -- 部门位置
    hierarchy      int2    NOT NULL,               -- 部门层级
    sort           int2    NOT NULL,               -- 同层级显示顺序

    origin_type    int2    NOT NULL default 0,     -- 数据来源
    info_level     int2    NOT NULL default 50,    -- 信息级别
    attribute_json varchar,                        -- 扩展属性
    comment        varchar,                        -- 描述信息
    create_time    timestamp        default now(), -- 创建时间
    update_time    timestamp,                      -- 更新时间
    creator        varchar,                        -- 创建者
    modifier       varchar,                        -- 修改者
    ext1           varchar,                        -- 扩展字段
    ext2           varchar,                        -- 扩展字段
    ext3           varchar,                        -- 扩展字段
    ext4           varchar,                        -- 扩展字段
    ext5           varchar                         -- 扩展字段
);


-- 创建自增序列
CREATE SEQUENCE IF NOT EXISTS public.department_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

-- 调整相关
alter table public.department
    alter column id set default nextval('department_id_seq');
CREATE UNIQUE INDEX IF NOT EXISTS department_code_uindex ON public."department" USING btree ("code","flag");
CREATE UNIQUE INDEX IF NOT EXISTS department_name_uindex ON public."department" USING btree ("parent_code", "name", "flag");


-- 注释
COMMENT ON SEQUENCE public.department_id_seq IS '部门id的自增序列';
COMMENT ON INDEX public.department_code_uindex IS '部门code的唯一索引';
COMMENT ON INDEX public.department_name_uindex IS '同层级部门名称不可重复';


COMMENT ON TABLE public."department" IS '部门信息表';

COMMENT ON COLUMN public."department".id IS 'id:主键、自增、非空';
COMMENT ON COLUMN public."department".flag IS '状态，0正常存在，-id已被删除';
COMMENT ON COLUMN public."department".code IS '唯一code:32位UUID';
COMMENT ON COLUMN public."department".name IS '显示名:（可重名）';
COMMENT ON COLUMN public."department".origin_type IS '数据来源:0自身,1其他';
COMMENT ON COLUMN public."department".info_level IS '信息级别';
COMMENT ON COLUMN public."department".attribute_json IS '额外属性参数';
COMMENT ON COLUMN public."department".comment IS '描述';
COMMENT ON COLUMN public."department".create_time IS '创建时间';
COMMENT ON COLUMN public."department".update_time IS '更新时间';
COMMENT ON COLUMN public."department".creator IS '创建者';
COMMENT ON COLUMN public."department".modifier IS '修改者';
COMMENT ON COLUMN public."department".ext1 IS '扩展字段1';
COMMENT ON COLUMN public."department".ext2 IS '扩展字段2';
COMMENT ON COLUMN public."department".ext3 IS '扩展字段3';
COMMENT ON COLUMN public."department".ext4 IS '扩展字段4';
COMMENT ON COLUMN public."department".ext5 IS '扩展字段5';

COMMENT ON COLUMN public."department".location IS '部门位置';
COMMENT ON COLUMN public."department".hierarchy IS '部门层级';
COMMENT ON COLUMN public."department"."sort" IS '同层级显示顺序';


-- *********** user ***********
-- 删除user表相关数据
DROP TABLE IF EXISTS public.user;
DROP SEQUENCE IF EXISTS public.user_id_seq;
DROP INDEX IF EXISTS public.user_code_uindex;
DROP INDEX IF EXISTS public.account_name_uindex;
DROP INDEX IF EXISTS public.phone_number_uindex;
DROP INDEX IF EXISTS public.identity_number_uindex;

-- 创建user表
CREATE TABLE IF NOT EXISTS public."user"
(
    id              serial PRIMARY KEY,             -- id:主键、自增、非空
    flag            int8    NOT NULL DEFAULT 0,     -- 状态，0正常存在，-id已被删除
    code            varchar NOT NULL,               -- 唯一code
    name            varchar NOT NULL,               -- 显示名

    "password"      varchar NOT NULL,               -- 用户密码
    phone_number    varchar NOT NULL,               -- 电话号码
    identity_number varchar NOT NULL,               -- 身份证号
    gender          varchar NOT NULL,               -- 性别

    origin_type     int2    NOT NULL default 0,     -- 数据来源
    info_level      int2    NOT NULL default 50,    -- 信息级别
    attribute_json  varchar,                        -- 扩展属性
    comment         varchar,                        -- 描述信息
    create_time     timestamp        default now(), -- 创建时间
    update_time     timestamp,                      -- 更新时间
    creator         varchar,                        -- 创建者
    modifier        varchar,                        -- 修改者
    ext1            varchar,                        -- 扩展字段
    ext2            varchar,                        -- 扩展字段
    ext3            varchar,                        -- 扩展字段
    ext4            varchar,                        -- 扩展字段
    ext5            varchar                         -- 扩展字段
);


-- 创建自增序列
CREATE SEQUENCE IF NOT EXISTS public.user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

-- 调整相关
alter table public.user
    alter column id set default nextval('user_id_seq');
CREATE UNIQUE INDEX IF NOT EXISTS user_code_uindex ON public."user" USING btree ("code","flag");
CREATE UNIQUE INDEX IF NOT EXISTS phone_number_uindex ON public."user" USING btree ("phone_number", flag);
CREATE UNIQUE INDEX IF NOT EXISTS identity_number_uindex ON public."user" USING btree ("identity_number", flag);


-- 注释
COMMENT ON SEQUENCE public.user_id_seq IS '用户id的自增序列';
COMMENT ON INDEX public.user_code_uindex IS '账户名的唯一索引';
COMMENT ON INDEX public.phone_number_uindex IS '电话号码的唯一索引';
COMMENT ON INDEX public.identity_number_uindex IS '身份证号的唯一索引';

COMMENT ON TABLE public."user" IS '用户信息表';

COMMENT ON COLUMN public."user".id IS 'id:主键、自增、非空';
COMMENT ON COLUMN public."user".flag IS '状态，0正常存在，-id已被删除';
COMMENT ON COLUMN public."user".code IS '唯一code:32位UUID';
COMMENT ON COLUMN public."user".name IS '显示名:（可重名）';
COMMENT ON COLUMN public."user".origin_type IS '数据来源:0自身,1其他';
COMMENT ON COLUMN public."user".info_level IS '信息级别';
COMMENT ON COLUMN public."user".attribute_json IS '额外属性参数';
COMMENT ON COLUMN public."user".comment IS '描述';
COMMENT ON COLUMN public."user".create_time IS '创建时间';
COMMENT ON COLUMN public."user".update_time IS '更新时间';
COMMENT ON COLUMN public."user".creator IS '创建者';
COMMENT ON COLUMN public."user".modifier IS '修改者';
COMMENT ON COLUMN public."user".ext1 IS '扩展字段1';
COMMENT ON COLUMN public."user".ext2 IS '扩展字段2';
COMMENT ON COLUMN public."user".ext3 IS '扩展字段3';
COMMENT ON COLUMN public."user".ext4 IS '扩展字段4';
COMMENT ON COLUMN public."user".ext5 IS '扩展字段5';


COMMENT ON COLUMN public."user"."password" IS '用户密码';
COMMENT ON COLUMN public."user".phone_number IS '电话号码';
COMMENT ON COLUMN public."user".identity_number IS '身份证号';
COMMENT ON COLUMN public."user".gender IS '性别';


-- *********** department_user_relation ***********
-- 删除department_user_relation表相关数据
DROP TABLE IF EXISTS public.department_user_relation;
DROP SEQUENCE IF EXISTS public.department_user_relation_id_seq;
DROP INDEX IF EXISTS public.department_user_code_uindex;

-- 创建department表
CREATE TABLE IF NOT EXISTS public."department_user_relation"
(
    id              serial PRIMARY KEY,             -- id:主键、自增、非空
    flag            int8    NOT NULL DEFAULT 0,     -- 状态，0正常存在，-id已被删除
    department_code varchar NOT NULL,               -- 唯一code
    user_code       varchar NOT NULL,               -- 显示名
    type            int2    not null default 0,     -- 类型:0普通挂载的用户,1部门主管
    create_time     timestamp        default now(), -- 创建时间
    update_time     timestamp,                      -- 更新时间
    creator         varchar,                        -- 创建者
    modifier        varchar                         -- 修改者
);

-- 创建自增序列
CREATE SEQUENCE IF NOT EXISTS public.department_user_relation_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

-- 调整相关
alter table public.department_user_relation
    alter column id set default nextval('department_user_relation_id_seq');
CREATE UNIQUE INDEX IF NOT EXISTS department_user_code_uindex ON
    public."department_user_relation" USING btree ("department_code", "user_code");

COMMENT ON TABLE public."department_user_relation" IS '部门用户关系表';

COMMENT ON COLUMN public."department_user_relation".id IS 'id:主键、自增、非空';
COMMENT ON COLUMN public."department_user_relation".flag IS '状态，0正常存在，-id已被删除';
COMMENT ON COLUMN public."department_user_relation".create_time IS '创建时间';
COMMENT ON COLUMN public."department_user_relation".update_time IS '更新时间';
COMMENT ON COLUMN public."department_user_relation".creator IS '创建者';
COMMENT ON COLUMN public."department_user_relation".modifier IS '修改者';

COMMENT ON COLUMN public."department_user_relation".department_code IS '部门code';
COMMENT ON COLUMN public."department_user_relation".user_code IS '用户code';