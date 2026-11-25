package com.example.entity;

import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.*;

/**
 * 用户实体类 —— 使用 Bean Validation 注解做服务器端数据验证
 */
public class User {

    private Integer id;  // 用户ID（主键，自增）

    @NotBlank(message = "用户名不能为空")
    @Length(min = 3, max = 20, message = "用户名长度必须在 3 到 20 之间")
    private String username;  // 用户名

    @NotBlank(message = "密码不能为空")
    @Length(min = 6, max = 20, message = "密码长度必须在 6 到 20 之间")
    private String password;  // 密码

    @NotNull(message = "年龄不能为空")
    @Min(value = 1, message = "年龄最小值为 1")
    @Max(value = 120, message = "年龄最大值为 120")
    private Integer age;  // 年龄

    @Email(message = "邮箱格式不正确")
    private String email;  // 邮箱

    private String fileName;  // 上传的文件名
    private String filePath;   // 上传的文件保存路径

    // ====== 构造方法 ======
    public User() {}
    public User(String username, String password, Integer age, String email) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.email = email;
    }

    // ====== Getter / Setter ======
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getFileName() { return fileName; }
    public void setFileName(String fileName) { this.fileName = fileName; }

    public String getFilePath() { return filePath; }
    public void setFilePath(String filePath) { this.filePath = filePath; }
}