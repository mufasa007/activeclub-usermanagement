-- 创建user表
DROP TABLE IF EXISTS public.eventlog;
DROP SEQUENCE IF EXISTS public.eventlog_eventlog_id_seq;
DROP INDEX IF EXISTS public.eventlog_id_uindex;
DROP INDEX IF EXISTS public.eventlog_code_uindex;


CREATE TABLE IF NOT EXISTS public.eventlog
(
    "eventlog_id"            bigserial NOT NULL,           -- 主键ID
    "delete_flag"            int8      NULL     DEFAULT 0, -- 删除标识，0进行中，1已完成，-id事件已被删除
    "eventlog_code"          varchar   NOT NULL,           -- 唯一标识

    "eventlog_title"         varchar   NOT NULL,           -- 事件标题
    "eventlog_type"          varchar   NOT NULL,           -- 事件类型：0开发;1自测;2协助;3缺陷;
    "eventlog_dockers"       varchar   NOT NULL,           -- 事件对接人（多个或单个或无）
    "eventlog_content"       varchar   NOT NULL,           -- 事件内容
    "eventlog_reason"        varchar   NOT NULL,           -- 事件原因

    "create_user_code"       varchar   NULL,               -- 创建事件用户code
    "update_user_code"       varchar   NULL,               -- 更新用户code
    "create_time"            timestamp NULL,               -- 上传日期
    "update_time"            timestamp NULL,               -- 更新日期

    "eventlog_archive_codes" varchar   NOT NULL,           -- 事件附件code（多个或单个或无）
    "eventlog_read_num"      int8      NOT NULL DEFAULT 0, -- 事件阅读次数

    CONSTRAINT eventlog_pk PRIMARY KEY ("eventlog_id")
);

CREATE SEQUENCE IF NOT EXISTS public.eventlog_eventlog_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

alter table public.eventlog
    alter column eventlog_id set default nextval('eventlog_eventlog_id_seq');
CREATE UNIQUE INDEX IF NOT EXISTS eventlog_id_uindex ON public.eventlog USING btree ("eventlog_id", "delete_flag");
CREATE UNIQUE INDEX IF NOT EXISTS eventlog_code_uindex ON public.eventlog USING btree ("eventlog_code");

-- Column comments
COMMENT ON TABLE public.eventlog IS '事件信息表';

COMMENT ON COLUMN public.eventlog."eventlog_id" IS '主键ID';
COMMENT ON COLUMN public.eventlog."delete_flag" IS '删除标识，0正常，-id事件已被删除';
COMMENT ON COLUMN public.eventlog."eventlog_code" IS '事件唯一标识';

COMMENT ON COLUMN public.eventlog."eventlog_title" IS '事件标题';
COMMENT ON COLUMN public.eventlog."eventlog_type" IS '事件类型：0开发;1自测;2协助;3缺陷;';
COMMENT ON COLUMN public.eventlog."eventlog_dockers" IS '事件对接人（多个或单个或无）';
COMMENT ON COLUMN public.eventlog."eventlog_content" IS '事件内容';
COMMENT ON COLUMN public.eventlog."eventlog_reason" IS '事件原因';

COMMENT ON COLUMN public.eventlog."create_user_code" IS '上传者名称';
COMMENT ON COLUMN public.eventlog."update_user_code" IS '更新者名称';
COMMENT ON COLUMN public.eventlog."create_time" IS '上传日期';
COMMENT ON COLUMN public.eventlog."update_time" IS '更新日期';

COMMENT ON COLUMN public.eventlog."eventlog_archive_codes" IS '事件附件code';
COMMENT ON COLUMN public.eventlog."eventlog_read_num" IS '事件阅读次数';