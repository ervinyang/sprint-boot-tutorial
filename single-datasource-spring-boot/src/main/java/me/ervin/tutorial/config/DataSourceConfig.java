package me.ervin.tutorial.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * @author zhiyingyang
 * @version 2017-03-19 15:45
 */
//@EnableTransactionManagement(mode = AdviceMode.ASPECTJ)
//@EnableLoadTimeWeaving(aspectjWeaving = EnableLoadTimeWeaving.AspectJWeaving.ENABLED)
//@Configuration
public class DataSourceConfig {


    /*@Autowired
    private Environment env;

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
        fb.setDataSource(dataSource);// 指定数据源(这个必须有，否则报错)
        // 下边两句仅仅用于*.xml文件，如果整个持久层操作不需要使用到xml文件的话（只用注解就可以搞定），则不加
        fb.setTypeAliasesPackage(env.getProperty("mybatis.typeAliasesPackage"));// 指定基包
        fb.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources(env.getProperty("mybatis.mapper-locations")));//

        return fb.getObject();
    }

    *//**
     * 配置事务管理器
     *//*
    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource) throws Exception {
        return new DataSourceTransactionManager(dataSource);
    }*/

    //    @Bean
//    public InstrumentationLoadTimeWeaver loadTimeWeaver() {
//        return new InstrumentationLoadTimeWeaver();
//    }
}
