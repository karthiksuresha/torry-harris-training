create table student(redg_no varchar(10),s_name varchar(50),branch varchar(10));
insert into student values ("0001","Ram","CSE"),("0002","Hari","MECH"),
									("0003","Pradeep","EEE"),("0004","Deepak","ETC");

select redg_no from student where s_name="pradeep";
select s_name,branch from student;
select count(redg_no) from student;
alter table student add column address varchar(50);

select* from student;