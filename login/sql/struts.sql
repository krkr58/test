set names utf8;
set foreign_key_checks=0;
drop database if exists logindb_kakui;
create database logindb_kakui;
use logindb_kakui;

create table user(
id int,
user_name varchar(255),
password varchar(255)
);

insert into user values
(1,"taro","123"),
(2,"jiro","123"),
(3,"hanako","123"),
(4,"suburo","123");

