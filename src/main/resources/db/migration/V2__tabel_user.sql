create table user (
                      userId int unsigned auto_increment
                          primary key,
                      name varchar(100)  not null,
                      email varchar(50)  not null,
                      password varchar(50)  not null
);