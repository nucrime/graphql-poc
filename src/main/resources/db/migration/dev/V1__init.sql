create table if not exists author
(
    id   serial      not null,
    name varchar(20) not null
);

create table if not exists post
(
    id          serial      not null,
    title       varchar(50) not null,
    description text        not null,
    tags        text        not null default '#sport',
    author_id   bigint      not null,
    created     date        not null default now()
);
