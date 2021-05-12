package com.dao.crud;

import com.dao.entity.UserInfo;

import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        UserInfo info = CRUD.getUserInfo("朱彦林");
        System.out.println(info.getName()+"\t"+info.getPassword()+"\t"+info.getAge());
    }
}
