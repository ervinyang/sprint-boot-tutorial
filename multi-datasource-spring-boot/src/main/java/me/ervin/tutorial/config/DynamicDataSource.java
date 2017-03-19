package me.ervin.tutorial.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author zhiyingyang
 * @version 2017-03-18 15:52
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDataSource();
    }
}