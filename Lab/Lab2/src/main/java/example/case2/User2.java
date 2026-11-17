package example.case2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 用户类 - 使用 @Component 注解注册为 Bean
 * 属性值通过 @Value 注解注入
 */
@Component("user2")
public class User2 {

    @Value("1001")
    private int id;

    @Value("李四")
    private String name;

    @Value("lisi@example.com")
    private String email;

    @Value("13700137000")
    private String phone;

    @Value("VIP会员")
    private String level;

    // Getter & Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }

    /** 用户注册信息打印 */
    public void printRegisterInfo() {
        System.out.println("【用户注册信息】");
        System.out.println("  用户ID:   " + id);
        System.out.println("  用户名称: " + name);
        System.out.println("  邮箱:     " + email);
        System.out.println("  手机号:   " + phone);
        System.out.println("  会员等级: " + level);
    }
}