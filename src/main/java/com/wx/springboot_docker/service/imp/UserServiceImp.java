package com.wx.springboot_docker.service.imp;

import com.wx.springboot_docker.dao.UserMapper;
import com.wx.springboot_docker.domain.User;
import com.wx.springboot_docker.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImp implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> selectById() {
        return userMapper.selectById();
    }
}
