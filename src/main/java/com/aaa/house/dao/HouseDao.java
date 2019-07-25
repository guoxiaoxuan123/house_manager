package com.aaa.house.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * fileName:HouseDao
 * description:
 * author:guoxiaoxuan
 * createTime:2019/7/22 20:10
 * versoin:1.0.0
 */
@Repository
public interface HouseDao {
    /**
     * 查询房间列表
     * @param
     * @return
     */
    @Select("select * from house")
    List<Map> getList();

    /**
     * 根据id获取对象
     * @param id
     * @return
     */
    @Select("select * from house where id=#{id}")
    List<Map> getById(int id);
}
