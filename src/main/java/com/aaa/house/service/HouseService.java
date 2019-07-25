package com.aaa.house.service;

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
public interface HouseService {
    /**
     * 查询房间列表
     * @param
     * @return
     */
    List<Map> getList();

    /**
     * 根据id获取对象
     * @param id
     * @return
     */
    Map getById(int id);
}
