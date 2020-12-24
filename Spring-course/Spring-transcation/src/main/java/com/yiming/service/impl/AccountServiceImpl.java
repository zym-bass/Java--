package com.yiming.service.impl;

import com.yiming.dao.AccountDao;
import com.yiming.entity.Account;
import com.yiming.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void transfer(Account account1, Account account2) {
        accountDao.updateAccount(account1);
        accountDao.updateAccount(account2);
    }
}
