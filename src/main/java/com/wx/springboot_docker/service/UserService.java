package com.wx.springboot_docker.service;

import com.wx.springboot_docker.domain.City;
import com.wx.springboot_docker.domain.User;

import java.util.List;

public interface UserService {
    List<User> selectById( );
}
