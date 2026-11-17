-- 实验数据库：银行转账场景
CREATE DATABASE IF NOT EXISTS lab4_db DEFAULT CHARSET utf8mb4;
USE lab4_db;

-- 账户表
DROP TABLE IF EXISTS account;
CREATE TABLE account (
                         id    INT PRIMARY KEY AUTO_INCREMENT COMMENT '账户ID',
                         name  VARCHAR(50) NOT NULL COMMENT '账户名',
                         money DOUBLE NOT NULL DEFAULT 0 COMMENT '余额'
) COMMENT '账户表';

-- 初始化两条数据：张三 1000 元，李四 1000 元
INSERT INTO account(name, money) VALUES ('张三', 1000), ('李四', 1000);