package com.homework.mapper;

import com.homework.entity.Goods;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 商品 Mapper 接口 —— 对应 GoodsMapper.xml
 */
public interface GoodsMapper {

    /** 插入一条商品 */
    int insert(Goods goods);

    /**
     * 动态条件查询 —— 使用 MyBatis 的 if 标签
     * 哪个参数不为 null，就拼接到 SQL 中
     */
    List<Goods> selectByCondition(@Param("title") String title,
        @Param("type")  String type,
        @Param("minPrice") Double minPrice,
        @Param("maxPrice") Double maxPrice
    );
}