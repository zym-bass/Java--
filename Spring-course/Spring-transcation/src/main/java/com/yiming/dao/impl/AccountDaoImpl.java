package com.yiming.dao.impl;

import com.yiming.dao.AccountDao;
import com.yiming.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate ;


    @Override
    public void updateAccount(Account account) {
        String sql = "update account set money=? where id=?";
        Object[] args = {account.getMoney(),account.getId()};
        jdbcTemplate.update(sql,args);
    }
}
