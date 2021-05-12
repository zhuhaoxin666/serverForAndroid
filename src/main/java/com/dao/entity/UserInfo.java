package com.dao.entity;

import java.util.HashSet;
import java.util.Set;

public class UserInfo {
    private String name;
    private Integer age;
    private Integer userId;
    private String password;
    private String motto;
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //座右铭

    private Set<WordAndMeaning> set = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public Set<WordAndMeaning> getSet() {
        return set;
    }

    public void setSet(Set<WordAndMeaning> set) {
        this.set = set;
    }
}
