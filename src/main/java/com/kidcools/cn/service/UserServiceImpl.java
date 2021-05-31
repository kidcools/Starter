package com.kidcools.cn.service;

import com.kidcools.cn.Entity.User;
import com.kidcools.cn.dao.UserDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);

    }

    @Override
    public User findUserById(long id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> findUsers() {
        return userDao.getUsers();
    }
}
