package com.ygy.shard.mapper;

import com.ygy.shard.entity.Student;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 */
public interface StudentMapper {

    /**
     * 扣减商品库存
     * @Param: commodityCode 商品code  count扣减数量
     * @Return:
     */
    Student getById(@Param("id") Integer id);

    /**
     * 扣减商品库存
     * @Param: commodityCode 商品code  count扣减数量
     * @Return:
     */
    Long insert(Student student);
}
