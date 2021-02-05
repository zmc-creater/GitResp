package com.ustb.test;

import com.ustb.domain.Account;
import com.ustb.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringTest {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        AccountService service = context.getBean("accountService", AccountService.class);

        List<Account> accounts = service.findAll();

        System.out.println(accounts);

    }

}
