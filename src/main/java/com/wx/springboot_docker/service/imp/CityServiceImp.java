package com.wx.springboot_docker.service.imp;

import com.wx.springboot_docker.dao.CityMapper;
import com.wx.springboot_docker.domain.City;
import com.wx.springboot_docker.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityServiceImp implements CityService {
    @Resource
    private CityMapper cityMapper;

    @Override
    public List<City> selectByCountryId(String id) {
        return cityMapper.selectByCountryId(id);
    }
}
