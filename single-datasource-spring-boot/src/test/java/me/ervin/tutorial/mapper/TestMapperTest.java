package me.ervin.tutorial.mapper;

import me.ervin.tutorial.pojo.UserInfo;
import me.ervin.tutorial.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

/**
 * @author zhiyingyang
 * @version 2017-03-19 10:41
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMapperTest {

    @Autowired
    TestMapper testMapper;

    @Autowired
    TestService testService;

    @Test
    public void selectRecentOne() throws Exception {
        assertThat(testMapper.selectRecentOne())
                .isNotNull()
                .hasFieldOrPropertyWithValue("name", "test");
    }

    @Test
    public void transactionalTest() {
        UserInfo userInfo = testMapper.selectRecentOne();
        try {
            testService.insertTransactional();
            throw new RuntimeException("should not execute this instruction...");
        } catch (Exception e) {
        }
        assertThat(testMapper.selectRecentOne().getId())
                .isEqualTo(userInfo.getId());
    }

    @Test
    public void transactionalInnerCallTest() {
        UserInfo userInfo = testMapper.selectRecentOne();
        try {
            testService.transactionalInnerCall();
            throw new RuntimeException("should not execute this instruction...");
        } catch (Exception e) {
        }
        assertThat(testMapper.selectRecentOne().getId())
                .isEqualTo(userInfo.getId());
    }
}