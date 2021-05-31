package com.kidcools.cn.service;

import com.kidcools.cn.Entity.User;

import java.util.List;

public interface UserService {
     void addUser(User user);
     User findUserById(long id);
     List<User> findUsers();
}
