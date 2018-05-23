create table member (
num int not null auto_increment,
userID char(12) not null,
userPW varchar(255) not null,
userName varchar(10) not null,
addr varchar(100),
email varchar(30) not null,
primary key(num)
);
ALTER TABLE member convert to charset utf8;

insert into member values(null, "hong", "1234", "홍길동", "대구 달성군 구지면", "abc@gmail.com");

select * from member;

desc member;