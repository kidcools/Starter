package com.kidcools.cn.dao;

import com.kidcools.cn.Entity.User;

import java.util.List;

public interface UserDao {
    /**
     * 添加user
     * @param user
     */
    public void  addUser(User user);

    /**
     * 根據Id獲得User
     * @param id
     * @return
     */
    public User getUserById(long id);

    /**
     * 查询所有User
     * @return
     */
    public List<User> getUsers();
}
