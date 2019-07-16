package com.wx.springboot_docker.service;

import com.wx.springboot_docker.domain.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CityService {
    /**
     * 根据city的id查询所属的city
     * @param id
     * @return
     */
    List<City> selectByCountryId( String id);
}
