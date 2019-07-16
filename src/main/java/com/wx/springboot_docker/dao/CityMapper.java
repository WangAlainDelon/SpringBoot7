package com.wx.springboot_docker.dao;

import com.wx.springboot_docker.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CityMapper {

    List<City> selectByCountryId(@Param("id") String id);
}
