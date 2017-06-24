create table stu
(stuID int primary key,
stuName varchar(8) not null,
sex varchar(4) default 'ÄĞ' check(sex in('ÄĞ','Å®')),
Brithday date,
errorTimes int
)
alter session set nls_date_format = 'yyyy-mm-dd';

insert into stu values(1,'ÕÅ·É','ÄĞ','1987-01-04',0);
insert into stu values(2,'Áõ±¸','ÄĞ','1987-03-24',0);
insert into stu values(3,'¹ØÓğ','ÄĞ','1988-11-21',3);

select * from stu;