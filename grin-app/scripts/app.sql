create table author
(
    id        bigserial
        constraint author_pkey primary key,
    name      varchar(5)
        constraint author_name_key unique,
    create_at timestamp
);

create table if not exists book
(
    id         bigserial
        constraint book_pkey primary key,
    author_id  bigint
        constraint book_author_id_fkey references author,
    title      varchar(100),
    type       varchar(10),
    price      numeric,
    publish_at timestamp,
    list       varchar(1000),
    map        varchar(100)
);