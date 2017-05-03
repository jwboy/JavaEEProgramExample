create table member (
id int(3) unsigned NOT NULL auto_increment,
username varchar(20),
password varchar(20),
resume text,
photo blob,
createdDate date,
primary key(id)
);
