package org.example.mapper;

import org.example.entity.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品表 Mapper 接口
 * 实验核心：使用 association 实现多表连接查询
 */
public interface GoodsMapper {

    /**
     * 查询所有商品（包含关联的用户信息）
     * 关键：一条 SQL 完成 goods + user 的 JOIN 查询
     */
    List<Goods> findAllWithUser();

    /**
     * 根据商品ID查询（包含关联用户）
     */
    Goods findByIdWithUser(@Param("id") Integer id);

    /**
     * 动态条件查询（演示动态 SQL 的 where/if 标签）
     * 根据 type 和 title 模糊查询商品（含用户）
     */
    List<Goods> findByCondition(
        @Param("type")  String type,
        @Param("title") String title
    );
}