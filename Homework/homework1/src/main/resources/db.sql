-- 创建数据库（如果不存在）
CREATE DATABASE IF NOT EXISTS homework1 DEFAULT CHARACTER SET utf8mb4;
USE homework1;

-- 创建用户表：用户名、密码、账号、角色、余额
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
   `id`       INT PRIMARY KEY AUTO_INCREMENT,
   `username` VARCHAR(50)  NOT NULL UNIQUE COMMENT '用户名',
   `password` VARCHAR(50)  NOT NULL COMMENT '密码',
   `account`  VARCHAR(50)  NOT NULL COMMENT '账号',
   `role`     VARCHAR(20)  NOT NULL COMMENT '角色：USER 一般用户 / MERCHANT 商家',
   `balance`  DOUBLE       NOT NULL DEFAULT 0 COMMENT '余额'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 插入测试数据：买家和商家
INSERT INTO `account` (`username`, `password`, `account`, `role`, `balance`) VALUES
('zhangsan', '123456', 'ACC001', 'USER',     1000.00),
('lisi',     '123456', 'ACC002', 'MERCHANT', 5000.00);

-- 验证
SELECT * FROM `account`;