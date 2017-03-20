package me.ervin.tutorial.service;

import me.ervin.tutorial.mapper.TestMapper;
import me.ervin.tutorial.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

/**
 * @author zhiyingyang
 * @version 2017-03-19 14:00
 */
@Service
public class TestService {
    @Autowired
    private TestMapper testMapper;

    public UserInfo selectRecentOne(){
        return testMapper.selectRecentOne();
    }

    @Transactional(rollbackFor = Exception.class)
    public void insertTransactional() {
        boolean transactionActive = TransactionSynchronizationManager.isActualTransactionActive();
        System.out.println("transactionActive = " + transactionActive);

        UserInfo userInfo = new UserInfo();
        userInfo.setName("test");
        userInfo.setPassword("test");

        testMapper.insert(userInfo);

        throw new RuntimeException("roll back");
    }

    public void transactionalInnerCall() {

        boolean transactionActive = TransactionSynchronizationManager.isActualTransactionActive();
        System.out.println("transactionActive = " + transactionActive);

        insertTransactional();
    }
}
