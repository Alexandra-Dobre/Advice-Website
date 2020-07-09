create table question(
                         questionId int unsigned auto_increment
                             primary key,
                         question varchar(1000) null,
                         questionDateTime datetime,
                         submitterId int unsigned null,
                         categoryId int unsigned null,
                         constraint question_fk_1
                             foreign key (submitterId) references user(userId),
                         constraint question_fk_2
                             foreign key (categoryId) references category(categoryId)
);

create index submitterId on question (submitterId);
create index categoryId on question (categoryId);