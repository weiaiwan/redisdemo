package com.example.redisdemo.service;


import com.example.redisdemo.entity.User;


import java.util.Map;

public interface userService {
    public User getUserp(Map<String,Object> map);
    public int getUserpCount(Map<String, Object> map);
}
