create table member01 (
id int(3)  NOT NULL ,
username varchar(20),
password varchar(20),
resume text,
photo blob,
createdDate date,
primary key(id)
);