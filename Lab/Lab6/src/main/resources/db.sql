-- =====================================================
-- 实验6：在作业2的 goods 表基础上，新增用户表并建立关联
-- =====================================================

USE homework2_db;

-- 如果已存在则删除（避免重复执行报错）
DROP TABLE IF EXISTS goods;
DROP TABLE IF EXISTS user;

-- 1. 创建用户表（新增）
CREATE TABLE user (
    id      INT PRIMARY KEY AUTO_INCREMENT COMMENT '用户编号',
    name    VARCHAR(50) NOT NULL COMMENT '用户名',
    phone   VARCHAR(20) COMMENT '联系电话',
    address VARCHAR(200) COMMENT '地址'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

-- 2. 插入用户测试数据
INSERT INTO user (name, phone, address) VALUES
('张三', '13800000001', '北京市海淀区'),
('李四', '13800000002', '上海市浦东新区'),
('王五', '13800000003', '广州市天河区');

-- 3. 创建商品表（增加 user_id 外键字段关联 user 表）
CREATE TABLE goods (
    id      INT PRIMARY KEY AUTO_INCREMENT COMMENT '编号',
    title   VARCHAR(100) NOT NULL COMMENT '商品标题',
    type    VARCHAR(50) COMMENT '类型',
    price   DECIMAL(10,2) NOT NULL COMMENT '商品价格',
    stock   INT DEFAULT 0 COMMENT '库存',
    user_id INT COMMENT '所属用户ID（外键）',
    CONSTRAINT fk_goods_user FOREIGN KEY (user_id) REFERENCES user(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='商品表';

-- 4. 插入商品数据，关联用户
INSERT INTO goods (title, type, price, stock, user_id) VALUES
('iPhone 15',      '数码', 5999.00, 50,  1),
('MacBook Pro',    '数码', 9999.00, 20,  1),
('Java编程思想',    '书籍',   89.00, 100, 2),
('T恤衫',          '服装',   59.90, 200, 3),
('运动鞋',         '服装',  299.00, 80,  2),
('MySQL实战',      '书籍',   69.00, 150, 3);