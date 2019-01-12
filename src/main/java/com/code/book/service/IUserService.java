package com.code.book.service;

import com.code.book.utils.PageUtils;

public interface IUserService {
    /**
     * 分页查询用户信息
     * @param user_login_name 用户登录名称
     * @param page 页数大小
     * @param size 页面大小
     * @return
     */
    PageUtils findPage(String user_login_name,int page,int size);
}
