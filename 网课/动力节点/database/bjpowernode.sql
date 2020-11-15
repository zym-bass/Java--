drop table if exists t_student;
drop table if exists t_class;

create table t_class(
  cno int primary key ,
  canem varchar(255)
);
create table t_student(
  sno int primary key  ,
  sname varchar(255),
  classno int ,
  foreign key(classno)  references t_class(cno)
); 

insert into t_class values(111,'xxxxxx');
insert into t_class values(222,'xxxxxx');
insert into t_student values(1,'zx',111);
insert into t_student values(2,'zl',222);
insert into t_student values(3,'zm',111); 

select *from t_class;
select *from t_student;