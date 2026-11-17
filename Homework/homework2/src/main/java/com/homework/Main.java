package com.homework;

import com.homework.entity.Goods;
import com.homework.mapper.GoodsMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

/**
 * 控制台主程序
 * 功能：1) 插入商品  2) 使用 MyBatis 动态 if 条件查询商品
 */
public class Main {

    private static SqlSessionFactory factory;

    /** 初始化 SqlSessionFactory（整个应用只需创建一次） */
    public static void init() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        factory = new SqlSessionFactoryBuilder().build(is);
    }

    public static void main(String[] args) throws Exception {
        init();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n========= 商品管理系统（MyBatis） ===========");
            System.out.println("  1. 插入商品");
            System.out.println("  2. 动态条件查询商品");
            System.out.println("  0. 退出");
            System.out.print("请选择功能：");

            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1": insertGoods(sc); break;
                case "2": queryGoods(sc); break;
                case "0": System.out.println("再见！"); return;
                default:  System.out.println("输入有误，请重试。");
            }
        }
    }

    /** 功能 1：插入商品 */
    private static void insertGoods(Scanner sc) {
        System.out.println("--- 插入商品 ---");
        System.out.print("商品标题：");
        String title = sc.nextLine().trim();
        System.out.print("商品类型：");
        String type = sc.nextLine().trim();
        System.out.print("商品价格：");
        BigDecimal price = new BigDecimal(sc.nextLine().trim());
        System.out.print("库存数量：");
        int stock = Integer.parseInt(sc.nextLine().trim());

        Goods goods = new Goods(title, type, price, stock);

        // 打开会话，获取 Mapper 代理，执行插入
        try (SqlSession session = factory.openSession()) {
            GoodsMapper mapper = session.getMapper(GoodsMapper.class);
            int rows = mapper.insert(goods);
            session.commit();   // 手动提交（JDBC 模式下必须 commit）
            System.out.println("插入成功！受影响行数：" + rows + "，生成的商品编号：" + goods.getId());
        }
    }

    /**
     * 功能 2：动态条件查询 —— 演示 MyBatis <if> 标签
     * 提示：不想按某个条件过滤，直接回车留空即可
     */
    private static void queryGoods(Scanner sc) {
        System.out.println("--- 动态条件查询（留空表示不限） ---");
        System.out.print("商品标题（模糊匹配）：");
        String title = sc.nextLine().trim();
        System.out.print("商品类型（精确匹配）：");
        String type  = sc.nextLine().trim();
        System.out.print("最低价格（回车不限）：");
        String minStr = sc.nextLine().trim();
        System.out.print("最高价格（回车不限）：");
        String maxStr = sc.nextLine().trim();

        // 空字符串转为 null，让 MyBatis <if> 跳过该条件
        String titleCond = title.isEmpty() ? null : title;
        String typeCond  = type.isEmpty()  ? null : type;
        Double minPrice  = minStr.isEmpty() ? null : Double.parseDouble(minStr);
        Double maxPrice  = maxStr.isEmpty() ? null : Double.parseDouble(maxStr);

        try (SqlSession session = factory.openSession()) {
            GoodsMapper mapper = session.getMapper(GoodsMapper.class);
            List<Goods> list = mapper.selectByCondition(titleCond, typeCond, minPrice, maxPrice);

            System.out.println("\n======= 查询结果（共 " + list.size() + " 条） =======");
            System.out.printf("%-6s %-16s %-8s %-10s %-6s%n",
                    "编号", "商品标题", "类型", "价格", "库存");
            for (Goods g : list) {
                System.out.printf("%-6s %-16s %-8s %-10s %-6s%n",
                        g.getId(), g.getTitle(), g.getType(), g.getPrice(), g.getStock());
            }
        }
    }
}