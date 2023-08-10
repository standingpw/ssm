package com.metrix.mapper;

import com.metrix.model.User;

import java.util.List;

public interface UserMapper {
    List<User> findAllUsers();
}
