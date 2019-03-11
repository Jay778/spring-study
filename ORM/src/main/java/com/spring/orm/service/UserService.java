package com.spring.orm.service;

import com.spring.orm.entity.User;

import java.util.List;
/**
 * Created by 94921 on 2019/3/11.
 */
public interface UserService {
    List<User> selectUsers();
    int insertUser(User user);
    int deleteUser(long id);
    int updateUser(User user);
    User getUser(long id);

}
