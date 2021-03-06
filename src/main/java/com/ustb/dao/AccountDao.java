package com.ustb.dao;

import com.ustb.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户dao
 */
@Repository
public interface AccountDao {

    //查询所有
    @Select("select * from account")
    List<Account> findAll();

    //保存账户
    @Insert("insert into account(name,money) values(#{name},#{money})")
    void saveAccount(Account account);
}
