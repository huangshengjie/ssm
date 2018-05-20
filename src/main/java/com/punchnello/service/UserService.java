package com.punchnello.service;

import com.punchnello.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> selectUser(Map<String,Object> map);
}