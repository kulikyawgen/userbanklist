package com.by.kulik.repository;

import com.by.kulik.domain.User;

import java.util.List;

public interface UserRepo {
    User getUserByID(int id);
    List<User> getRichestUser();
}
