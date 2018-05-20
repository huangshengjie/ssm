package com.punchnello.service.impl;

import com.punchnello.dao.UserDao;
import com.punchnello.pojo.User;
import com.punchnello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> selectUser(Map<String, Object> map) {
        return userDao.selectUser(map);
    }
}