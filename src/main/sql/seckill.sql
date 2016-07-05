-- 数据库初始化脚本 --
-- panchao-------
-- 2016.06.15---

-- 创建数据库
CREATE DATABASE seckill;
-- 使用数据库
use seckill;

-- 创建秒杀库存表
CREATE TABLE `seckill` (
	`seckill_id` bigint NOT NULL AUTO_INCREMENT COMMENT '秒杀商品id',
	`name` varchar(120) NOT NULL DEFAULT '' COMMENT '商品名称',
	`number` bigint NOT NULL DEFAULT 0 COMMENT '商品库存数量',
	`start_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '秒杀开始时间',
	`end_time` timestamp NOT NULL COMMENT '秒杀结束时间',
	`create_time` timestamp NOT NULL COMMENT '秒杀创建时间',
	PRIMARY KEY (`seckill_id`),
	KEY idx_start_time (`start_time`),
	KEY idx_end_time(`end_time`),
	KEY idx_create_time(`create_time`)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=UTF8 COMMENT='秒杀库存表';

-- 初始化数据
INSERT INTO 
	seckill(name,number,start_time,end_time)
VALUES 
	('1000元秒杀iphone6', 100, '2016-11-01 00:00:00', '2016-11-02 00:00:00'),
	('500元秒杀ipad2', 200, '2016-11-01 00:00:00', '2016-11-02 00:00:00'),
	('300元秒杀mi4', 300, '2016-11-01 00:00:00', '2016-11-02 00:00:00'),
	('200元秒杀红米note', 400, '2016-11-01 00:00:00', '2016-11-02 00:00:00');

-- 秒杀成功明细表
-- 用户登录信息表
CREATE TABLE success_killed(
	`seckill_id` bigint NOT NULL AUTO_INCREMENT COMMENT '秒杀商品id',
	`user_phone` bigint NOT NULL DEFAULT 0 COMMENT '用户手机号',
	`state` tinyint NOT NULL DEFAULT -1 COMMENT '状态表示：-1 无效 0 ：成功 1：已付款',
	`create_time` timestamp NOT NULL COMMENT '秒杀创建时间',
	PRIMARY KEY (seckill_id,user_phone), /*联合主键*/
	KEY idx_create_time(`create_time`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='秒杀成功明细表';