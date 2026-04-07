package lab5;
import java.util.*;
public class NameDrawer {
    public static void main(String[] args) {
        String[] nameList = {
                "张三", "李四", "王五", "赵六", "钱七",
                "孙八", "周九", "吴十", "郑一", "王二",
                "刘一", "陈二", "杨三", "黄四", "赵五",
                "吴六", "周七", "徐八", "孙九", "马十"
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("===== 随机抽取名字程序 =====");
        System.out.print("请输入要抽取的名字个数n（1≤n≤20）：");
        int n = sc.nextInt();
        if (n < 1 || n > nameList.length) {
            System.out.println("输入错误！n必须在1到20之间");
            sc.close();
            return;
        }
        // 复制名单到List，方便移除已抽取名字（避免重复）
        List<String> nameCopy = new ArrayList<>(Arrays.asList(nameList));
        Random random = new Random();
        System.out.println("\n抽取的" + n + "个不重复名字为：");
        for (int i = 0; i < n; i++) {
            int randomIndex = random.nextInt(nameCopy.size());
            String selectedName = nameCopy.remove(randomIndex);
            System.out.print(selectedName + " ");
        }
    }
}
