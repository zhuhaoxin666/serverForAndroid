package com.service;

import com.alibaba.fastjson.JSONObject;
import com.dao.crud.CRUD;
import com.dao.entity.UserInfo;

public class OutputUserService {

    UserInfo userInfo;

    public String getUserInfo(String username){
        userInfo = CRUD.getUserInfo(username);

        class jsonUser{
            private String name;
            private Integer age;
            private String motto;

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

            public String getMotto() {
                return motto;
            }

            public void setMotto(String motto) {
                this.motto = motto;
            }
        }

        jsonUser jsonUser = new jsonUser();
        jsonUser.setName(userInfo.getName());
        jsonUser.setAge(userInfo.getAge());
        jsonUser.setMotto(userInfo.getMotto());

        JSONObject jsonObject = new JSONObject();
        String userinfoStr = jsonObject.toJSONString(jsonUser);
        return userinfoStr;
    }

}
