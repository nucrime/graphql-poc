CREATE TABLE IF NOT EXISTS author
(
    id   bigint      not null,
    name varchar(20) not null
);

CREATE TABLE IF NOT EXISTS post
(
    id          bigint      not null,
    title       varchar(50) not null,
    description text        not null,
    tags        text        not null default '#sport',
    authorId    bigint      not null,
    created     date        not null default now()
);
