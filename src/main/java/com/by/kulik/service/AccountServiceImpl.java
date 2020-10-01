package com.by.kulik.service;

import com.by.kulik.repository.AccountRepo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    private final static Logger logger = Logger.getLogger(AccountServiceImpl.class);

    @Autowired
    private AccountRepo accountRepo;

    @Override
    public int getAccountsSum() {
        return accountRepo.getAccountsSum();
    }
}