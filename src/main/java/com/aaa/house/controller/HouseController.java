package com.aaa.house.controller;

import com.aaa.house.service.EmpService;
import com.aaa.house.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * fileName:HouseController
 * description:
 * author:guoxiaoxuan
 * createTime:2019/7/22 20:20
 * versoin:1.0.0
 */
@RestController
public class HouseController {
    @Autowired
    private HouseService houseService;

    @Autowired
    private EmpService empService;
    /**
     * 查询用户列表
     * @return
     */
    @RequestMapping("houseList")
    public Object list(){
        return houseService.getList();
    }

    /**
     * 根据ID获取对象
     * @param id
     * @return
     */
    @RequestMapping("houseById")
    public Object gethouse(Integer id){
        Map house = houseService.getById(id);
        house.put("empList",empService.getEmpList());
        return house;
    }

}
