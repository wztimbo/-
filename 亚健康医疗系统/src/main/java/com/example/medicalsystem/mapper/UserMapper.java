package com.example.medicalsystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.medicalsystem.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    // 定义一个UserMapper接口，继承BaseMapper接口，用于操作User实体类
}
