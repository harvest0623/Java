-- 创建数据库
CREATE DATABASE IF NOT EXISTS lab5_provider DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

USE lab5_provider;

-- 创建供应商表 provider
CREATE TABLE IF NOT EXISTS provider (
    id INT(11) NOT NULL AUTO_INCREMENT COMMENT '供应商ID',
    proCode VARCHAR(20) NOT NULL COMMENT '供应商编码',
    proName VARCHAR(50) NOT NULL COMMENT '供应商名称',
    proContact VARCHAR(20) DEFAULT NULL COMMENT '联系人',
    proPhone VARCHAR(20) DEFAULT NULL COMMENT '联系电话',
    proAddress VARCHAR(100) DEFAULT NULL COMMENT '地址',
    proFax VARCHAR(20) DEFAULT NULL COMMENT '传真',
    createdBy VARCHAR(20) DEFAULT NULL COMMENT '创建者',
    creationDate DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='供应商表';

-- 插入几条测试数据
INSERT INTO provider (proCode, proName, proContact, proPhone, proAddress, proFax, createdBy) VALUES
('P001', '北京创华科技有限公司', '张三', '13800138001', '北京市朝阳区建国路88号', '010-88880001', 'admin'),
('P002', '上海精诚贸易有限公司', '李四', '13800138002', '上海市浦东新区陆家嘴路100号', '021-88880002', 'admin'),
('P003', '广州盛世电子有限公司', '王五', '13800138003', '广州市天河区体育西路188号', '020-88880003', 'admin'),
('P004', '深圳华兴实业有限公司', '赵六', '13800138004', '深圳市南山区科技园大道99号', '0755-88880004', 'admin');