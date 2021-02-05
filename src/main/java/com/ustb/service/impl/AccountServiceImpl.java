package com.ustb.service.impl;

import com.ustb.dao.AccountDao;
import com.ustb.domain.Account;
import com.ustb.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户");
        List<Account> list = accountDao.findAll();
        return list;
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
        System.out.println("业务层：保存账户。。。");
    }
}
