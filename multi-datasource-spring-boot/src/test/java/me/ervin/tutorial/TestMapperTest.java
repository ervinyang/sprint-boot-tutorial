package me.ervin.tutorial;

import me.ervin.tutorial.mapper.Test1Mapper;
import me.ervin.tutorial.mapper.Test2Mapper;
import me.ervin.tutorial.pojo.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author zhiyingyang
 * @version 2017-03-18 15:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMapperTest {

    @Autowired
    Test1Mapper test1Mapper;

    @Autowired
    Test2Mapper test2Mapper;

    @Test
    public void selectOne() throws Exception {
        assertThat(test1Mapper.selectRecentOne())
                .isNotNull()
                .hasFieldOrPropertyWithValue("name", "test");
        assertThat(test2Mapper.selectRecentOne())
                .isNotNull()
                .hasFieldOrPropertyWithValue("name", "test");
    }


    @Test
    public void insert() throws Exception {
        UserInfo userInfo = new UserInfo();
        userInfo.setName("test");
        userInfo.setPassword("test");

        assertThat(test1Mapper.insert(userInfo))
                .isTrue();
        assertThat(test2Mapper.insert(userInfo))
                .isTrue();
    }
}