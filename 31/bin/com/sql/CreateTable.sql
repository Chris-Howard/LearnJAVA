create table Employees(--Ա����
	EmployeeID char(6) primary key,--Ա����ţ�����
	Name char(10) not null,--����
	Birthday date not null,--��������
	Sex Number(1) not null,--�Ա�
	Address char(20),--��ַ
	Zip char(6),--�ʱ�
	PhotoNumber char(12),--�绰����
	DepartmentID char(3) references Department(DepartmentID)--Ա�����źţ����
	);
	
create table Department(--Ա�����ű�
	DepartmentID char(3) primary key,--���ű�ţ�����
	DepartmentName char(20) not null,--������
	Note Varchar2(100)--��ע
	);