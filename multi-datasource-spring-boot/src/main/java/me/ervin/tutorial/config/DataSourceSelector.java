package me.ervin.tutorial.config;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author zhiyingyang
 * @version 2017-03-18 16:04
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface DataSourceSelector {
    DataSourceEnum select();
}
