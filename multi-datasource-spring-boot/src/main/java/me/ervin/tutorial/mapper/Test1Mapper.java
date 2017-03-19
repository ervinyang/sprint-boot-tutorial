package me.ervin.tutorial.mapper;

import me.ervin.tutorial.config.DataSourceEnum;
import me.ervin.tutorial.config.DataSourceSelector;
import me.ervin.tutorial.pojo.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * @author zhiyingyang
 * @version 2017-03-18 14:56
 */
@Repository
@DataSourceSelector(select = DataSourceEnum.Test1)
public interface Test1Mapper {

    UserInfo selectRecentOne();

    boolean insert(UserInfo userInfo);
}
