create sequence if not exists public.task_key_seq;

create table if not exists task(
task_key integer not null default nextval('public.task_key_seq'),
task_name varchar(100) not null,
task_description varchar(100) not null,
task_status varchar(100) not null,
task_end_date TIMESTAMP not null,
task_start_date TIMESTAMP default current_timestamp,
CONSTRAINT task_pk PRIMARY KEY (task_key)
);


INSERT into task(task_name, task_description, task_status, task_end_date) values('Task 1', 'Task 1 description', 'on_progress', '2020-12-31 00:00:00');