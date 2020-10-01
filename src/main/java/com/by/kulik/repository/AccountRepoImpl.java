package com.by.kulik.repository;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepoImpl implements AccountRepo {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int getAccountsSum() {
        Query query = sessionFactory.getCurrentSession().createQuery("select sum(ac.account) from Account ac");
        return (Integer) query.uniqueResult();
    }
}
