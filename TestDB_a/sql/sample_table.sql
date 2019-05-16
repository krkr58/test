drop database if exists sampledb;
create database sampledb;
use sampledb;

create table sample_table(
No int(11),
name varchar(50),
age int(11),
Mail varchar(50));

insert into sample_table value(1,"yamada",21,"xxx@yahoo.co.jp");
insert into sample_table value(2,"sato",39,"yyy@yahoo.co.jp");
insert into sample_table value(3,"harada",44,"zzz@yahoo.co.jp");