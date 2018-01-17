package com.example.redisdemo.service.impl;

import com.example.redisdemo.dao.userDao;
import com.example.redisdemo.entity.User;
import com.example.redisdemo.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service(value="userService")
public class userServiceImpl implements userService {
    @Autowired
   private userDao userDao;

    @Override
    @Cacheable(value="users2", key = "#map.get('id')")
    public int getUserpCount(Map<String, Object> map) {
        System.out.println("成功2");
        return 1;
    }

    @Override
    @Cacheable(cacheNames = "product1", key = "#map.get('id')")
    public User getUserp(Map<String, Object> map) {
        System.out.println("成功");
        return userDao.getUserp(map);
    }
}
