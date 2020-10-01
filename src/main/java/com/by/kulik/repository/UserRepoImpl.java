package com.by.kulik.repository;

import com.by.kulik.domain.User;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepoImpl implements UserRepo {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User getUserByID(int id) {
        return null;
    }
    //where account = (select max(account) from User)
    @Override
    public List<User> getRichestUser() {
        Query from_user_ = sessionFactory.getCurrentSession().createQuery("select u from User u where u.account.account = (select max(u.account.account) from User u)");
        return from_user_.list();
    }
}
