package org.example.entity;

/**
 * 用户实体类
 * 对应数据库 user 表
 */
public class User {
    private Integer id;        // 用户编号
    private String name;       // 用户名
    private String phone;      // 联系电话
    private String address;    // 地址

    // 无参构造
    public User() {}

    // 有参构造
    public User(Integer id, String name, String phone, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    // getter / setter
    public Integer getId()      { return id; }
    public void   setId(Integer id) { this.id = id; }
    public String getName()     { return name; }
    public void   setName(String name) { this.name = name; }
    public String getPhone()    { return phone; }
    public void   setPhone(String phone) { this.phone = phone; }
    public String getAddress()  { return address; }
    public void   setAddress(String address) { this.address = address; }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', phone='" + phone + "', address='" + address + "'}";
    }
}