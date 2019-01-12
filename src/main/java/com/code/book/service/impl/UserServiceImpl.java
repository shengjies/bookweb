package com.code.book.service.impl;

import com.code.book.entity.UserEntity;
import com.code.book.mapper.UserMapper;
import com.code.book.service.IUserService;
import com.code.book.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public PageUtils findPage(String user_login_name, int page, int size) {
        List<UserEntity> list = userMapper.findPage(user_login_name,(page-1)*size,size);
        long count = userMapper.countUser(user_login_name);
        return new PageUtils(count,list);
    }
}
