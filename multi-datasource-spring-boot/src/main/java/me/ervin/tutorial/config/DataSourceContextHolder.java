package me.ervin.tutorial.config;

/**
 * @author zhiyingyang
 * @version 2017-03-18 15:55
 */
public class DataSourceContextHolder {
    private static final InheritableThreadLocal<DataSourceEnum> contextHolder = new InheritableThreadLocal<DataSourceEnum>();

    public static void setDataSource(DataSourceEnum type) {
        contextHolder.set(type);
    }

    public static DataSourceEnum getDataSource() {
        return contextHolder.get();
    }
}
