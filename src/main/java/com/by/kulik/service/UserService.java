package com.by.kulik.service;

import com.by.kulik.domain.User;

import java.util.List;

public interface UserService {
    User getUserByID(int id);
    List<User> getRichestUser();
}
