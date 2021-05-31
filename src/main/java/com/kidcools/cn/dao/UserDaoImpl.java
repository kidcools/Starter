package com.kidcools.cn.dao;

import com.kidcools.cn.Entity.User;
import com.kidcools.cn.mapper.UserMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
@Repository
public class UserDaoImpl implements  UserDao{
    @Resource
        private UserMapper userMapper;
    @Override
    public void addUser(User user) {
            userMapper.insert(user);
    }

    @Override
    public User getUserById(long id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> getUsers() {
        return userMapper.selectUsers();
    }
}
