select * from account


create table bottle (
	id int primary key,
	bottle_name varchar(255),
	price int
)

insert into bottle values (2,'Bottle 2', 4545)


select * from bottle




select * from bottle

create table bottle(
id int primary key,
	name varchar(255),
	price int
)


create table customer(
id int primary key,
	name  varchar(255),
	discount int
)


insert into customer values (1,'Mohit', 20)

create table invoice (
	id int primary key,
	amount int ,
	cust_id int references customer(id)
)
insert into invoice values (1,900, 1)

ACID


select * from bottle

create table bottle(
id int primary key,
	name varchar(255),
	price int
)


create table customer(
id int primary key,
	name  varchar(255),
	discount int
)


insert into customer values (1,'Mohit', 20)

create table invoice (
	id int primary key,
	amount int ,
	cust_id int references customer(id)
)
insert into invoice values (1,900, 1)

select * from invoice where id =1

-- find invoice of customer by name

select * from invoice i  inner join customer c on i.cust_id = c.id where c.name= 'Mohit'

select * from customer where name  = 'Mohit'

select * from invoice where cust_id in (
select id from customer where name  = 'Mohit'
)




-- Introduction

create table bank_acct(
acc_no int primary key,
acct_name varchar(255),
balance numeric(9,2)
)


insert into bank_acct values (5555,'Selvan',999.0)

insert into bank_acct values (7777,'Paul',100.0)

update bank_acct set balance = ? where acc_no = ?

select * from bank_acct

create table transaction (
id int primary key,
acct_no int  REFERENCES bank_acct(acc_no),
tran_type varchar(255),
amount numeric(9,2),
tran_date timestamp   

)

insert into transaction values (1,5555,'DEBIT',55.0,sysdate())

select * from transaction

delete from transaction

