CREATE TABLE ids (
	table_name varchar(50) PRIMARY KEY,
	id_value int
);

CREATE TABLE universe (
	un_id BIGINT primary key,
	name varchar(100),
	description VARCHAR(1024),
	un_table varchar(100) NOT NULL
);

CREATE TABLE accounts (
	acc_id BIGINT PRIMARY KEY,
	first_name varchar(50) NOT NULL,
	last_name varchar(50) NOT NULL,
	birthday date NOT NULL,
	email varchar(100) NOT NULL,
	proffession varchar(50),
	hobbies VARCHAR(1024),
	avatar bytea,
	un_id int REFERENCES universe(un_id)
-- 	for HSQLDB
-- 	CONSTRAINT UNIVERSE_CONSTRAINT FOREIGN KEY (un_id) REFERENCES universe(un_id)
);

CREATE TABLE logins (
	login VARCHAR(100) PRIMARY KEY,
	password VARCHAR(100),
	acc_id BIGINT REFERENCES accounts(acc_id)
-- 	for HSQLDB
-- 	CONSTRAINT UNIVERSE_CONSTRAINT FOREIGN KEY (acc_id) REFERENCES accounts(acc_id)
);

CREATE TABLE friends (
	user_id BIGINT REFERENCES accounts(acc_id) NOT NULL,
	friends_ids BIGINT[] NOT NULL
);

CREATE TABLE messages (
	mess_id BIGINT PRIMARY KEY NOT NULL,
	from_user BIGINT REFERENCES accounts(acc_id) NOT NULL,
	to_user BIGINT REFERENCES accounts(acc_id) NOT NULL,
	text_message VARCHAR(2048) NOT NULL
);


