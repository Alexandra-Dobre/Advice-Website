create table answer(
                       answerId int unsigned auto_increment
                           primary key,
                       answer varchar(5000) not null,
                       answerDateTime datetime,
                       submitterId int unsigned null,
                       questionId int unsigned null,
                       constraint answer_fk_1
                           foreign key (submitterId) references user(userId),
                       constraint answer_fk_2
                           foreign key (questionId) references question (questionId)

);

create index submitterId on answer (submitterId);
create index questionId on answer (questionId);