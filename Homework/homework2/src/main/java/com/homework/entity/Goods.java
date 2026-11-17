package com.homework.entity;

import java.math.BigDecimal;

/**
 * 商品实体类 —— 对应数据库 goods 表
 */
public class Goods {
    private Integer id;       // 编号
    private String  title;    // 商品标题
    private String  type;     // 类型
    private BigDecimal price; // 商品价格
    private Integer stock;    // 库存

    public Goods() {}

    public Goods(String title, String type, BigDecimal price, Integer stock) {
        this.title = title;
        this.type  = type;
        this.price = price;
        this.stock = stock;
    }

    // getter / setter
    public Integer getId()     { return id; }
    public void    setId(Integer id) { this.id = id; }

    public String  getTitle()  { return title; }
    public void    setTitle(String title) { this.title = title; }

    public String  getType()   { return type; }
    public void    setType(String type) { this.type = type; }

    public BigDecimal getPrice() { return price; }
    public void    setPrice(BigDecimal price) { this.price = price; }

    public Integer getStock()  { return stock; }
    public void    setStock(Integer stock) { this.stock = stock; }

    @Override
    public String toString() {
        return "Goods{" +
                "编号=" + id +
                ", 标题='" + title + '\'' +
                ", 类型='" + type + '\'' +
                ", 价格=" + price +
                ", 库存=" + stock +
                '}';
    }
}