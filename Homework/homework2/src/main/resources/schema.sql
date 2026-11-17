-- 创建商品表
CREATE DATABASE IF NOT EXISTS homework2_db DEFAULT CHARACTER SET utf8mb4;
USE homework2_db;

DROP TABLE IF EXISTS goods;

CREATE TABLE goods (
    id      INT PRIMARY KEY AUTO_INCREMENT COMMENT '编号',
    title   VARCHAR(100) NOT NULL COMMENT '商品标题',
    type    VARCHAR(50)  COMMENT '类型',
    price   DECIMAL(10,2) NOT NULL COMMENT '商品价格',
    stock   INT DEFAULT 0 COMMENT '库存'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 插入测试数据
INSERT INTO goods (title, type, price, stock) VALUES
('iPhone 15',   '数码', 5999.00, 50),
('MacBook Pro', '数码', 9999.00, 20),
('Java编程思想','书籍', 89.00,  100),
('T恤衫',       '服装', 59.90,  200),
('运动鞋',       '服装', 299.00, 80),
('MySQL实战',   '书籍', 69.00,  150);