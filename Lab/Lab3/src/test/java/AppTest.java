import config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.FoodService;

/**
 * 测试类 - 验证 Spring AOP 功能
 */
public class AppTest {

    /**
     * 测试正常情况：无异常
     * 预期输出：
     *   先有鸡
     *   getDb运行
     *   后有蛋
     *   西红柿炒鸡蛋做好了
     */
    @Test
    public void testNormal() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        FoodService foodService = context.getBean(FoodService.class);
        foodService.print();
        context.close();
    }

    /**
     * 测试异常情况：在 getDb 方法中触发异常
     * 首先需要在 FoodService.getDb() 中取消注释 // int i = 1 / 0;
     * 预期输出：
     *   先有鸡
     *   鸡蛋碎了
     *   西红柿炒鸡蛋做好了
     *   java.lang.ArithmeticException: / by zero
     */
    @Test
    public void testException() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        FoodService foodService = context.getBean(FoodService.class);
        try {
            foodService.print();
        } catch (Exception e) {
            System.out.println(e);
        }
        context.close();
    }
}