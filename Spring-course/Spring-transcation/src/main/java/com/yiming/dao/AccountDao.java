package com.yiming.dao;

import com.yiming.entity.Account;
import org.springframework.stereotype.Repository;


public interface AccountDao {
    void updateAccount(Account account);
}
