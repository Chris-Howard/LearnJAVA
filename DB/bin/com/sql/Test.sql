create table stu
(stuID int primary key,
stuName varchar(8) not null,
sex varchar(4) default '��' check(sex in('��','Ů')),
Brithday date,
errorTimes int
)
alter session set nls_date_format = 'yyyy-mm-dd';

insert into stu values(1,'�ŷ�','��','1987-01-04',0);
insert into stu values(2,'����','��','1987-03-24',0);
insert into stu values(3,'����','��','1988-11-21',3);

select * from stu;