create table Employees(--员工表
	EmployeeID char(6) primary key,--员工编号，主键
	Name char(10) not null,--姓名
	Birthday date not null,--出生日期
	Sex Number(1) not null,--性别
	Address char(20),--地址
	Zip char(6),--邮编
	PhotoNumber char(12),--电话号码
	DepartmentID char(3) references Department(DepartmentID)--员工部门号，外键
	);
	
create table Department(--员工部门表
	DepartmentID char(3) primary key,--部门编号，主键
	DepartmentName char(20) not null,--部门名
	Note Varchar2(100)--备注
	);