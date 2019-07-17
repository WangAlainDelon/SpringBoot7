package com.wx.springboot_docker.controller;

import com.google.gson.Gson;
import com.wx.springboot_docker.domain.City;
import com.wx.springboot_docker.domain.User;
import com.wx.springboot_docker.service.CityService;
import com.wx.springboot_docker.service.UserService;
import com.wx.springboot_docker.utils.RedisTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private RedisTools redisTools;
    @Autowired
    private CityService cityService;
    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    @ResponseBody
    public String index(Model model, String id) {
        redisTools.set("liu", "dehua", 50);
        System.out.println(id);
        //List<City> cities = cityService.selectByCountryId(id);
        List<User> users = userService.selectById();
        model.addAttribute("users", users);
        model.addAttribute("liu", redisTools.get("liu"));
        Gson gson = new Gson();
        String json = gson.toJson(users);
        System.out.println(json+redisTools.get("liu"));
        return json+redisTools.get("liu");
    }

}
