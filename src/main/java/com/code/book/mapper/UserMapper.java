package com.code.book.mapper;

import com.code.book.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     * 分页按条件查询
     * @param user_login_name 用户登录名称
     * @param page 页数大小
     * @param size 页面大小
     * @return
     */
    List<UserEntity> findPage(@Param("user_login_name")String user_login_name,
                              @Param("page")int page,
                              @Param("size")int size);

    /**
     * 按条件统计用户总数
     * @param user_login_name 用户登录名称
     * @return
     */
    Long countUser(@Param("user_login_name")String user_login_name);


}
