create table regions(region_id int(11) unsigned not null, 
			region_name varchar(30),
            primary key (region_id));

insert into regions values (1,'Europe'),
							(2,'Americas'),
                            (3,'Asia');

create table countries (country_id varchar(3)not null,
			country_name varchar(30),
			region_id int(11)unsigned not null,
			primary key (country_id));

insert into countries values ('EU','Europe',1),('IT','Italy',1),('JP','Japan',3),
                                ('US','United States of America',2),('CA','Canada',2),
                                ('IN','India',3);
            
create table locations (location_id int(11)unsigned not null auto_increment,
			street_address varchar(40),
			postal_code varchar(12),
			city varchar(30)not null,
			state_province varchar(25),
			country_id char(2)not null,
			primary key(location_id));
            
insert into locations values (1200,'2017 shinjuku-ku','1689','tokyo','tokyo prefecture','EU'),
								(2100,'1298 Vileparle (E)','490231','Bombay','Maharashtra','IN');
            
create table departments (department_id int (11) unsigned not null,
			department_name varchar(25) not null,
			manager_id int (11) unsigned,
			location_id int (11) unsigned,
			primary key (department_id));
            
insert into departments values (10,'administration',200,1200),
								(40,'Human Resources',203,2400),
								(20,'Marketing',201,1800),
								(50,'Shipping',121,1500),
								(30,'Purchasing',114,1700);

		
create table jobs (job_id varchar(10) not null,
			job_title varchar(30) not null,
			min_salary decimal(8, 0) unsigned,
			max_salary decimal(8, 0) unsigned,
			primary key (job_id));
            
insert into jobs values ('AD_VP','Administration Vice President',15000,30000),
							('AD_ASST','Administration Assistant',3000,6000),
							('AC_MGR','Accounts Manager',8200,16000),
							('FI_ACCOUNT','Accountant',4200,9000);

create table employees (employee_id int (11) unsigned not null,
			first_name varchar(20),
			last_name varchar(25) not null,
			email varchar(25) not null,
			phone_number varchar(20),
			hire_date date not null,
			job_id varchar(10) not null,
			salary decimal(8, 2) not null,
			commission_pct decimal(2, 2),
			manager_id int (11) unsigned,
			department_id int (11) unsigned,
			primary key (employee_id));
            
insert into employees values (200,'Steven','King','SKING','515.123.4567',STR_TO_DATE('17-JUN-1987', '%d-%M-%Y'),'AD_VP',24000,NULL,NULL,10),
								(101,'Ram','Kumar','Ramkumar','515.123.4568',STR_TO_DATE('21-SEP-1977', '%d-%M-%Y'),'AD_VC',17000,NULL,100,90),
								(102,'Xyz','Abc','Xyzabc','515.123.4569',STR_TO_DATE('13-JAN-1995', '%d-%M-%Y'),'AD_VS',17000,NULL,100,90),
								(103,'Torry','Harris','Torryharris','590.423.4567',STR_TO_DATE('03-JAN-1990', '%d-%M-%Y'),'IT_PROG',9000,NULL,102,60);
    
create table job_history (employee_id int (11) unsigned not null,
			start_date date not null,
			end_date date not null,
			job_id varchar(10) not null,
			department_id int (11) unsigned not null);
            
alter table job_history add constraint pk_job_history primary key(employee_id,start_date);
            
insert into job_history values (200,STR_TO_DATE('17-Sep-1987','%d-%M-%Y'),STR_TO_DATE('17-Jun-1993','%d-%M-%Y'),'AD_VP',10),
								(102,STR_TO_DATE('13-Jan-1983', '%d-%M-%Y'),STR_TO_DATE('24-Jul-1988', '%d-%M-%Y'),'IT',60),
								(101,STR_TO_DATE('21-Sep-1989', '%d-%M-%Y'),STR_TO_DATE('27-Oct-1993', '%d-%M-%Y'),'AC',110),
								(103,STR_TO_DATE('28-Oct-1993','%d-%M-%Y'),STR_TO_DATE('15-Mar-1997','%d-%M-%Y'),'GM',110),
								(104,STR_TO_DATE('27-Feb-1996','%d-%M-%Y'),STR_TO_DATE('19-Dec-1999','%d-%M-%Y'),'HR',20);

set foreign_key_checks=0;
alter table countries add foreign key (region_id) references regions(region_id);
alter table locations add foreign key (country_id) references countries(country_id);
alter table departments add foreign key (location_id) references locations(location_id);
alter table employees add foreign key (job_id) references jobs(job_id);
alter table employees add foreign key (department_id) references departments(department_id);
alter table employees add foreign key (manager_id) references employees (employee_id);
alter table departments add foreign key (manager_id) references employees (employee_id);
alter table job_history add foreign key (employee_id) references employees (employee_id);
alter table job_history add foreign key (job_id) references jobs(job_id);
alter table job_history add foreign key (department_id) references departments(department_id);
