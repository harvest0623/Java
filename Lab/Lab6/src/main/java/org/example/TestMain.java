package org.example;

import org.example.entity.Goods;
import org.example.mapper.GoodsMapper;
import org.example.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 实验6 主测试类
 * 直接在控制台打印多表关联查询结果
 *
 * 运行前请确保：
 *   1. 已执行 sql/init.sql 建库建表
 *   2. mybatis-config.xml 中数据库账号密码正确
 */
public class TestMain {

    public static void main(String[] args) {
        // 1. 获取 SqlSession
        SqlSession session = MyBatisUtil.getSqlSession();

        // 2. 获取 Mapper 代理对象
        GoodsMapper goodsMapper = session.getMapper(GoodsMapper.class);

        System.out.println("============================================================");
        System.out.println("  实验6 - MyBatis  Association 多表连接查询（控制台输出）");
        System.out.println("============================================================");

        // ---------- 测试1：查询所有商品（含关联用户） ----------
        System.out.println("\n【测试1】查询所有商品（LEFT JOIN user）");
        System.out.println("------------------------------------------------------------");
        List<Goods> goodsList = goodsMapper.findAllWithUser();

        // 控制台打印表格
        printTable(goodsList);

        // ---------- 测试2：根据ID查询单个商品（含关联用户） ----------
        System.out.println("\n【测试2】根据ID查询商品（id=1）");
        System.out.println("------------------------------------------------------------");
        Goods g1 = goodsMapper.findByIdWithUser(1);
        if (g1 != null) {
            System.out.println("商品ID : " + g1.getId());
            System.out.println("标题   : " + g1.getTitle());
            System.out.println("类型   : " + g1.getType());
            System.out.println("价格   : " + g1.getPrice());
            System.out.println("库存   : " + g1.getStock());
            System.out.println("所属用户ID : " + g1.getUserId());
            // ⭐ association 映射到的 User 对象
            System.out.println("→ 用户名   : " + g1.getUser().getName());
            System.out.println("→ 电话     : " + g1.getUser().getPhone());
            System.out.println("→ 地址     : " + g1.getUser().getAddress());
        }

        // ---------- 测试3：动态 SQL 条件查询 ----------
        System.out.println("\n【测试3】动态 SQL 条件查询（type='数码'）");
        System.out.println("------------------------------------------------------------");
        List<Goods> digitalList = goodsMapper.findByCondition("数码", null);
        printTable(digitalList);

        // ---------- 测试4：动态 SQL 模糊查询 ----------
        System.out.println("\n【测试4】动态 SQL 模糊查询（title 包含 'Java'）");
        System.out.println("------------------------------------------------------------");
        List<Goods> javaList = goodsMapper.findByCondition(null, "Java");
        printTable(javaList);

        // 3. 关闭 SqlSession
        session.close();
        System.out.println("\n========== 查询完毕，SqlSession 已关闭 ==========");
    }

    /**
     * 在控制台打印商品列表表格
     */
    private static void printTable(List<Goods> list) {
        // 表头
        System.out.printf("%-6s %-16s %-6s %-10s %-6s | %-6s %-10s %-14s %s%n",
                "编号", "商品标题", "类型", "价格", "库存",
                "用户ID", "用户名", "电话", "地址");
        System.out.println("----------------------------------------------------------------------------------------------------------");

        if (list == null || list.isEmpty()) {
            System.out.println("  （无数据）");
            return;
        }

        // 表体
        for (Goods g : list) {
            String userName = (g.getUser() != null) ? g.getUser().getName() : "(null)";
            String phone   = (g.getUser() != null) ? g.getUser().getPhone() : "(null)";
            String address = (g.getUser() != null) ? g.getUser().getAddress() : "(null)";

            System.out.printf("%-6d %-16s %-6s %-10s %-6s | %-6s %-10s %-14s %s%n",
                g.getId(),
                g.getTitle(),
                g.getType(),
                "¥" + g.getPrice(),
                g.getStock(),
                g.getUserId(),
                userName,
                phone,
                address
            );
        }
        System.out.println("共 " + list.size() + " 条记录\n");
    }
}