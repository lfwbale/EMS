package com.example.dao;

import com.example.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDAO {

    void save(User user);

    //mybatis中传入多个参数要进行参数绑定
    User login(@Param("username") String username, @Param("password") String password);
}
