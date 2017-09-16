CREATE DATABASE shop

USE shop

DROP INDEX idx_start_time ON SECKILL;
DROP INDEX idx_end_time ON SECKILL;
DROP INDEX idx_create_time ON SECKILL;
DROP INDEX idx_create_time ON SUCCESS_KILLED;

DROP TABLE SECKILL; 
DROP TABLE SUCCESS_KILLED;

CREATE TABLE SECKILL(
	`seckill_id`		BIGINT 					NOT NULL AUTO_INCREMENT COMMENT'stock id', 
	`pro_name`	VARCHAR(120) 	NOT NULL COMMENT'product name',
	`stock_num`	INT							NOT NULL COMMENT'stock number',
	`start_time`	TIMESTAMP			NOT NULL COMMENT'start time',
	`end_time`		TIMESTAMP			NOT NULL COMMENT'end time',
	`create_time`	TIMESTAMP			NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT'create time',	
	PRIMARY KEY(`seckill_id`),
	KEY idx_start_time(`start_time`),
	KEY idx_end_time(`end_time`),
	KEY idx_create_time(`create_time`)
)
ENGINE=INNODB  
AUTO_INCREMENT=100000 
DEFAULT CHARSET=utf8 
COMMENT 'second kill stock table';	

CREATE TABLE SUCCESS_KILLED(
	`seckill_id`		BIGINT 				NOT NULL AUTO_INCREMENT COMMENT 'stock id', 
	`user_id`			VARCHAR(20)	NOT NULL COMMENT 'user name',
	`status_flg`		TINYINT 				NOT NULL DEFAULT -1 COMMENT 'status flag==> -1: fail, 0: success, 1: paied, 2:sent, 3: recieved, 4: commented',
	`create_time`	TIMESTAMP		NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'create time',	
	PRIMARY KEY(`seckill_id`, `user_id`	),
	KEY idx_create_time(`create_time`)
)
ENGINE=INNODB  
DEFAULT CHARSET=utf8 
COMMENT'second kill success table';



INSERT INTO 
	SECKILL(pro_name, stock_num, start_time, end_time)
VALUES
	('30元秒杀 SKU1', 100, '2017-09-16 00:00:00', '2017-09-17 00:00:00'),
	('50元秒杀 SKU2', 200, '2017-09-16 00:00:00', '2017-09-17 00:00:00'),
	('80元秒杀 SKU3', 300, '2017-09-16 00:00:00', '2017-09-17 00:00:00');


COMMIT;