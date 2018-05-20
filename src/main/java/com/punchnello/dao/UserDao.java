package com.punchnello.dao;


import com.punchnello.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<User> selectUser(Map<String, Object> map);
}