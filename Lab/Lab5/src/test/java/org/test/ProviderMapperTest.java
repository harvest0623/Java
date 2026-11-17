package org.test;

import org.model.Provider;
import org.model.ProviderMapper;
import org.apache.ibatis.session.SqlSession;
import org.utils.MybatisUtil;
import org.junit.Test;

import java.util.List;

public class ProviderMapperTest {

    // ① 无参数查询
    @Test
    public void testGetAllProviders() {
        try (SqlSession session = MybatisUtil.getSession()) {
            ProviderMapper mapper = session.getMapper(ProviderMapper.class);
            List<Provider> list = mapper.getAllProviders();
            System.out.println("===== 无参数查询所有供应商 =====");
            for (Provider p : list) {
                System.out.println(p);
            }
        }
    }

    // ② 单参数查询
    @Test
    public void testGetProviderById() {
        try (SqlSession session = MybatisUtil.getSession()) {
            ProviderMapper mapper = session.getMapper(ProviderMapper.class);
            Provider p = mapper.getProviderById(1);
            System.out.println("===== 单参数查询 id=1 =====");
            System.out.println(p);
        }
    }

    // ③ 多参数查询（模糊名称 + 分页）
    @Test
    public void testGetProvidersByNameAndPage() {
        try (SqlSession session = MybatisUtil.getSession()) {
            ProviderMapper mapper = session.getMapper(ProviderMapper.class);
            // 查询名称包含"京"的，从第0条开始取2条
            List<Provider> list = mapper.getProvidersByNameAndPage("京", 0, 2);
            System.out.println("===== 多参数查询(名称含'京', 每页2条) =====");
            for (Provider p : list) {
                System.out.println(p);
            }
        }
    }

    // 新增
    @Test
    public void testAddProvider() {
        try (SqlSession session = MybatisUtil.getSession()) {
            ProviderMapper mapper = session.getMapper(ProviderMapper.class);
            Provider p = new Provider();
            p.setProCode("P005");
            p.setProName("杭州云端网络有限公司");
            p.setProContact("孙七");
            p.setProPhone("13900139001");
            p.setProAddress("杭州市西湖区文三路999号");
            p.setProFax("0571-88880005");
            p.setCreatedBy("admin");

            int rows = mapper.addProvider(p);
            session.commit();
            System.out.println("===== 新增，受影响行数=" + rows + ", 自增id=" + p.getId());
        }
    }

    // 修改
    @Test
    public void testUpdateProvider() {
        try (SqlSession session = MybatisUtil.getSession()) {
            ProviderMapper mapper = session.getMapper(ProviderMapper.class);
            Provider p = new Provider();
            p.setId(1);
            p.setProName("北京创华科技有限公司【已修改】");
            p.setProPhone("13800000000");

            int rows = mapper.updateProvider(p);
            session.commit();
            System.out.println("===== 修改 id=1，受影响行数=" + rows);

            // 重新查询验证
            System.out.println(mapper.getProviderById(1));
        }
    }

    // 删除
    @Test
    public void testDeleteProviderById() {
        try (SqlSession session = MybatisUtil.getSession()) {
            ProviderMapper mapper = session.getMapper(ProviderMapper.class);
            int rows = mapper.deleteProviderById(3);
            session.commit();
            System.out.println("===== 删除 id=5，受影响行数=" + rows);
        }
    }
}