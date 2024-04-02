create table person
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birthdate timestamp,
	primary key(id)
);

INSERT INTO PERSON 
(ID, NAME, LOCATION, BIRTHDATE)
VALUES(10, 'shalini', 'blr','2018-01-01 11:11:11.123');

INSERT INTO PERSON 
(ID, NAME, LOCATION, BIRTHDATE)
VALUES(11, 'amit', 'blr','2018-01-01 11:11:11.123');

INSERT INTO PERSON 
(ID, NAME, LOCATION, BIRTHDATE)
VALUES(12, 'shalika', 'mum','2018-01-01 11:11:11.123');
