package com.metrix.service.impl;

import com.metrix.mapper.UserMapper;
import com.metrix.model.User;
import com.metrix.service.UserService;
import com.metrix.util.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService  {
    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultData findAllUsers() {
        List<User> list = userMapper.findAllUsers();
        if (list.size() >0 ){
            return ResultData.ok(list,list.size());
        }else {
            return ResultData.fail();
        }
    }
}
