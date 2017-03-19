package me.ervin.tutorial.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


/**
 * @author zhiyingyang
 * @version 2017-03-18 16:10
 */
@Aspect
@Component
public class DataSourceAspect {

    @Before("execution(* me.ervin.tutorial.mapper.*.*(..))")
//    @Before("@within(me.ervin.tutorial.config.DataSourceSelector)")
    public void setDataSourceKey(JoinPoint point) {
        //连接点所属的类实例是ShopDao
        Class<?>[] interfaces = point.getTarget().getClass().getInterfaces();
        for(Class aClass : interfaces){
            DataSourceSelector annotation = (DataSourceSelector)aClass.getAnnotation(DataSourceSelector.class);
            if(annotation != null){
                DataSourceContextHolder.setDataSource(annotation.select());
                break;
            }
        }

    }
}