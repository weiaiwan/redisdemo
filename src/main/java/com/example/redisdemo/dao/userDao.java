package com.example.redisdemo.dao;

import java.util.Map;

import com.example.redisdemo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface userDao {
    public User getUserp(Map<String,Object> map);
    public int getUserpCount(Map<String, Object> map);
}
