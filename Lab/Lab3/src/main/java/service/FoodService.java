package service;

import org.springframework.stereotype.Service;

/**
 * 业务类 - 模拟烹饪服务
 */
@Service
public class FoodService {

    /**
     * 模拟获取食材数据库，正常运行时输出信息
     */
    public void getDb() {
        System.out.println("getDb运行");
        // 异常测试时取消下面这行的注释
        int i = 1 / 0;
    }

    /**
     * 模拟炒菜过程，需要被 AOP 通知增强
     */
    public void print() {
        getDb();
        System.out.println("西红柿炒鸡蛋做好了");
    }
}