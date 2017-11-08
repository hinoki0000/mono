drop database if exists newecsite;

create database if not exists newecsite;
use newecsite;

drop table if exists user_info;


create table user_info(
id int not null primary key auto_increment,
user_id varchar(16),
login_pass varchar(16),
user_name varchar(16),
family_name varchar(16),
first_name varchar(16),
sex TINYINT DEFAULT 0,
email varchar(32),
status TINYINT DEFAULT 0,
logined TINYINT DEFAULT 0,
regist datetime,
update_time datetime
);


drop table if exists product_info;

create table product_info(

product_id int not null primary key auto_increment,
product_name varchar(100),
product_description varchar(255),
category_id int,
item_word varchar(255),
price int,
image_file_path varchar(100),
image_file_name varchar(50),
release_data datetime,
release_company varchar(50),


regist datetime,
update_time datetime
);

drop table if exists cart_info;

create table cart_info(
id int not null primary key auto_increment,
user_id varchar(16),
product_id int,
regist datetime,
update_time datetime
);

drop table if exists buy_info;

create table buy_info(
id int not null primary key auto_increment,
user_id varchar(16),
product_id int,
regist datetime,
update_time datetime
);

drop table if exists destination;

create table destination(
id int not null primary key auto_increment,
user_id varchar(16),
family_name varchar(16),
first_name varchar(16),
email varchar(32),
tel varchar(13),
user_address varchar(128),
regist datetime,
update_time datetime
);


drop table if exists master;

create table master(
id int not null primary key auto_increment,
category_id int,
category_name varchar(20),
category_description varchar(100),
regist datetime,
update_time datetime
);

drop table if exists ai;

create table ai(
id int not null primary key auto_increment,
item_name varchar(16),
item_word varchar(255)
);




INSERT INTO product_info(product_id,product_name,product_description,category_id,item_word,price,image_file_path,image_file_name,release_company)VALUES(1,'高級机','素材に意気込みをかけております',1,'机,木材,',2000,'images/desk.jpg','desk.jpg','internous');
INSERT INTO product_info(product_id,product_name,product_description,category_id,item_word,price,image_file_path,image_file_name,release_company)VALUES(2,'安物椅子','素材に意気込みをかけております',1,'椅子,木材,メンズ',800,'desk.jpg','desk.jpg','internous');
INSERT INTO product_info(product_id,product_name,product_description,category_id,item_word,price,image_file_path,image_file_name,release_company)VALUES(3,'スタンド','素材に意気込みをかけております',2,'スタンド,木材',400,'desk.jpg','desk.jpg','internous');
INSERT INTO ai(id,item_name,item_word)VALUES(1,'スウェット','服,冬物,メンズ');
INSERT INTO user_info(user_name,login_pass) values('a',1)