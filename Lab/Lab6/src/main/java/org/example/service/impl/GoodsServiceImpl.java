package org.example.service.impl;

import org.example.entity.Goods;
import org.example.mapper.GoodsMapper;
import org.example.service.GoodsService;
import org.example.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 商品业务实现
 */
public class GoodsServiceImpl implements GoodsService {

    @Override
    public List<Goods> listAll() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.getSqlSession();
            GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);
            return mapper.findAllWithUser();   // 调用 Mapper 方法
        } finally {
            if (sqlSession != null) sqlSession.close();
        }
    }
}