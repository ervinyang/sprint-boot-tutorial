package me.ervin.tutorial.pojo;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @author zhiyingyang
 * @version 2017-03-18 14:37
 */
public class UserInfo {
    private long id;
    private String name;
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
