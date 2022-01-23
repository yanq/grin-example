"""
create table author
(
    id        bigserial primary key,
    name      varchar(5) unique,
    create_at timestamp
)

create table book
(
    id         bigserial primary key,
    author_id  bigint references author,
    title      varchar(100),
    type       varchar(10),
    price      decimal,
    publish_at timestamp
)

alter table book add list varchar(1000);
alter table book add map varchar(100);
"""