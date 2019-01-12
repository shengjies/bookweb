package com.code.book.entity;

public class UserEntity {
    private int id;
    private String user_login_name;//用户登录名称
    private String user_name; //用户名称
    private String password; //用户登录密码
    private String create_time; //注册时间
    private int role_entity_id; //角色id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_login_name() {
        return user_login_name;
    }

    public void setUser_login_name(String user_login_name) {
        this.user_login_name = user_login_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public int getRole_entity_id() {
        return role_entity_id;
    }

    public void setRole_entity_id(int role_entity_id) {
        this.role_entity_id = role_entity_id;
    }
}
