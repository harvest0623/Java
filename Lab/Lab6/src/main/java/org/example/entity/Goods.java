package org.example.entity;

import java.math.BigDecimal;

/**
 * 商品实体类
 * 对应数据库 goods 表
 * 通过 association 关键字关联 User（一对一关联）
 */
public class Goods {
    private Integer id;           // 商品编号
    private String  title;        // 商品标题
    private String  type;         // 类型
    private BigDecimal price;     // 价格
    private Integer stock;        // 库存
    private Integer userId;       // 用户ID（数据库外键，普通字段）

    /**
     * 关联属性：该商品所属的用户信息
     * MyBatis 通过 association 元素将 user 表的数据映射到这里
     */
    private User user;

    public Goods() {}

    public Integer getId()      { return id; }
    public void   setId(Integer id) { this.id = id; }
    public String  getTitle()   { return title; }
    public void   setTitle(String title) { this.title = title; }
    public String  getType()    { return type; }
    public void   setType(String type) { this.type = type; }
    public BigDecimal getPrice(){ return price; }
    public void   setPrice(BigDecimal price) { this.price = price; }
    public Integer getStock()   { return stock; }
    public void   setStock(Integer stock) { this.stock = stock; }
    public Integer getUserId()  { return userId; }
    public void   setUserId(Integer userId) { this.userId = userId; }
    public User    getUser()    { return user; }
    public void   setUser(User user) { this.user = user; }

    @Override
    public String toString() {
        return "Goods{id=" + id + ", title='" + title + "', type='" + type
                + "', price=" + price + ", stock=" + stock
                + ", userId=" + userId + ", user=" + user + "}";
    }
}