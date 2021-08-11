-- 创建user表
DROP TABLE IF EXISTS public.user;
DROP SEQUENCE IF EXISTS public.user_user_id_seq;
DROP INDEX IF EXISTS public.user_account_name_uindex;
DROP INDEX IF EXISTS public.user_user_code_uindex;
DROP INDEX IF EXISTS public.user_user_id_uindex;

-- 创建
CREATE TABLE IF NOT EXISTS public."user"
(
    id          serial PRIMARY KEY,               -- 用户id、主键、自增、非空
    flag      int8      NOT NULL DEFAULT 0,     -- 用户状态，0正常存在，-id已被删除
    code        varchar   NOT NULL,               -- 用户code

    user_name        varchar   NOT NULL,               -- 用户名
    account_name     varchar   NOT NULL,               -- 用户唯一的账户名
    "password"       varchar   NOT NULL,               -- 用户密码

    create_user_code varchar   NULL,                   -- 创建该账户的账户code
    update_user_code varchar   NULL,                   -- 更新该账户的账户code

    create_time      timestamp          default now(), -- 用户创建时间
    update_time      timestamp NULL                    -- 用户最近的更新时间
);

-- 创建自增序列
CREATE SEQUENCE IF NOT EXISTS public.user_user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

-- 调整相关
alter table public.user
    alter column user_id set default nextval('user_user_id_seq');
CREATE UNIQUE INDEX IF NOT EXISTS user_id_uindex ON public."user" USING btree ("user_id", "delete_flag");
CREATE UNIQUE INDEX IF NOT EXISTS account_name_uindex ON public."user" USING btree ("account_name", "delete_flag");
CREATE UNIQUE INDEX IF NOT EXISTS user_code_uindex ON public."user" USING btree (user_code);


-- 注释
COMMENT ON SEQUENCE public.user_user_id_seq IS '用户id的自增序列';
COMMENT ON INDEX public.account_name_uindex IS '用户账户名的唯一索引';
COMMENT ON INDEX public.user_code_uindex IS '用户Code的唯一索引';
COMMENT ON INDEX public.user_id_uindex IS '用户id的唯一索引';

COMMENT ON TABLE public."user" IS '用户信息表';

COMMENT ON COLUMN public."user".user_id IS '用户id:主键、自增、非空';
COMMENT ON COLUMN public."user".delete_flag IS '用户状态，0正常存在，-id已被删除';
COMMENT ON COLUMN public."user".user_code IS '用户code:32位UUID';

COMMENT ON COLUMN public."user".user_name IS '用户名:类似姓名（可重名）';
COMMENT ON COLUMN public."user".account_name IS '用户唯一的账户名（登录名称，不可重名）';
COMMENT ON COLUMN public."user"."password" IS '用户密码';

COMMENT ON COLUMN public."user".create_user_code IS '创建该用户的账户code';
COMMENT ON COLUMN public."user".update_user_code IS '修改该用户的账户code';

COMMENT ON COLUMN public."user".create_time IS '用户创建时间';
COMMENT ON COLUMN public."user".update_time IS '用户最近的更新时间';


