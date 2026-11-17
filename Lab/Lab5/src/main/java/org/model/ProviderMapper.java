package org.model;

import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * Provider DAO 接口
 */
public interface ProviderMapper {

    /** ① 无参数查询所有供应商 */
    List<Provider> getAllProviders();

    /** ② 单参数 - 按 id 查询 */
    Provider getProviderById(@Param("id") Integer id);

    /** ③ 多参数 - 按名称模糊查询 + 分页（多参数示例） */
    List<Provider> getProvidersByNameAndPage(
        @Param("proName") String proName,
        @Param("startIndex") Integer startIndex,
        @Param("pageSize") Integer pageSize
    );

    /** 新增 */
    int addProvider(Provider provider);

    /** 修改 */
    int updateProvider(Provider provider);

    /** 删除 */
    int deleteProviderById(@Param("id") Integer id);
}