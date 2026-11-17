package org.example.service;

import org.example.entity.Goods;
import java.util.List;

/**
 * 商品业务接口
 */
public interface GoodsService {
    /** 查询所有商品（带用户信息） */
    List<Goods> listAll();
}