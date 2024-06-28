package com.example.medicalsystem.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.medicalsystem.mapper.UserMapper;
import com.example.medicalsystem.pojo.User;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
