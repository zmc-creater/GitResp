package com.ustb.test;

import com.ustb.dao.AccountDao;
import com.ustb.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {
//
//    /**
//     * 测试查询
//     * @throws Exception
//     */
//    @Test
//    public void test1() throws Exception{
//        InputStream in = Resources.getResourceAsStream("sqlMapperConfig.xml");
//        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//        SqlSessionFactory factory = builder.build(in);
//        SqlSession sqlSession = factory.openSession();
//        AccountDao dao = sqlSession.getMapper(AccountDao.class);
//
//        List<Account> accounts = dao.findAll();
//
//        for (Account account :
//                accounts) {
//            System.out.println(account);
//        }
//
//        sqlSession.commit();
//        sqlSession.close();
//        in.close();
//    }
//
//    /**
//     * 测试保存
//     * @throws Exception
//     */
//    @Test
//    public void test2() throws Exception{
//        InputStream in = Resources.getResourceAsStream("sqlMapperConfig.xml");
//        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//        SqlSessionFactory factory = builder.build(in);
//        SqlSession sqlSession = factory.openSession();
//        AccountDao dao = sqlSession.getMapper(AccountDao.class);
//
//        Account account = new Account();
//        account.setName("王五");
//        account.setMoney(100.0);
//
//        dao.saveAccount(account);
//
//        sqlSession.commit();
//        sqlSession.close();
//        in.close();
//    }
}
