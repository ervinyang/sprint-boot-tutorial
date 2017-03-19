package me.ervin.tutorial.mapper;

import me.ervin.tutorial.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhiyingyang
 * @version 2017-03-18 14:56
 */
@Mapper
public interface TestMapper {

    UserInfo selectRecentOne();

    boolean insert(UserInfo userInfo);
}
