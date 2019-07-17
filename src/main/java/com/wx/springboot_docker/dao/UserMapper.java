package com.wx.springboot_docker.dao;

import com.wx.springboot_docker.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> selectById( );
}
