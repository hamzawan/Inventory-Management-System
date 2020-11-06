create database IMSP
use IMSP
create table Logins
(
ID int identity(1,1) unique not null,
UserName varchar(50) not null, 
Passwords varchar(50) not null,
LoginAs varchar(20)
)

select * from Logins

create table Items
(
ID int identity(100,1) unique not null,
Item_Name varchar(50),
Category varchar(50),
Quantity int,
Price money,
sold int
)



create table status
(
ID int identity (100,1),
Item_name varchar(50),
Categoty varchar(50),
Price money,
Sold nvarchar,
stock nvarchar
) 


create table AddItemSUmmary
(
ID int,
ItemName varchar(50),
Category varchar(50),
Qty varchar(50)
)



insert into Items values ('Halwa','Chocolate',100,120,0);
insert into Items values ('Tuck Biscuit','Biscuit',100,25,0);
insert into Items values ('Skittles','Chocolate',100,50,0);
insert into Items values ('Starburst','Chocolate',100,50,0);
insert into Items values ('Mars Chocolate','Chocolate',100,60,0);
insert into Items values ('Pakola Juice','Cold And Beverages',100,135,0);
insert into Items values ('Mountain Dew','Cold And Beverages',100,110,0);
insert into Items values ('PineApple','Fruit',100,120,0);
insert into Items values ('Peanut Butter','Dairy Products',100,150,0);
insert into Items values ('KitKat','Chocolate',100,120,0);
insert into Items values ('Halwa','Chocolate',100,120,0);


select * from Items
Update Items
set Quantity = Quantity+1
where  ID  = 100;

select * from Logins where UserName='SP' and Passwords='123';



create table Invoice
(
Invoice_No int identity(1000,1),
ID int,
Item_Name varchar(50),
Category varchar(50),
Quantity int,
Total_Bill int,
)
select * from Invoice 

create table Returnx
(
ID int,
Item_Name varchar(50),
Category varchar(50),
Quantity int,
Amount money
)


create table InformToIM
(
ID int,
Item_Name varchar(50),
Item_Category varchar(50),
Quantity int,
)
