package com.wx.springboot_docker.controller;

import com.wx.springboot_docker.domain.City;
import com.wx.springboot_docker.service.CityService;
import com.wx.springboot_docker.utils.RedisTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private RedisTools redisTools;
    @Autowired
    private CityService cityService;

    @RequestMapping("/index")
    public String index(Model model, String id) {
        redisTools.set("liu", "dehua", 50);
        System.out.println(id);
        List<City> cities = cityService.selectByCountryId(id);
        model.addAttribute("cities", cities);
        model.addAttribute("liu", redisTools.get("liu"));
        return "index";
    }

}
