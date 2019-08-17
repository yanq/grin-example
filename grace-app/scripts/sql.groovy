"""
create table author
(
    id        bigserial primary key,
    name      varchar(5) unique,
    create_at timestamp
)
"""