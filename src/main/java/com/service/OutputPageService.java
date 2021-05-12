package com.service;

import com.alibaba.fastjson.JSONObject;
import com.dao.crud.CRUD;
import com.dao.entity.UserInfo;
import com.dao.entity.WordAndMeaning;
import com.dao.util.MySessionFactory;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class OutputPageService {
    UserInfo userInfo;
    List<WordAndMeaning> wordAndMeanings;

    public List<WordAndMeaning> getUserWordsAndMeaning(String username){
        try {
            Session session = MySessionFactory.getSessionFactory().openSession();
            String hql = "select u.id from UserInfo u where u.name = :name";
            Integer index = (Integer) session.createQuery(hql).setString("name",username).uniqueResult();
            userInfo = (UserInfo) session.get(UserInfo.class, index);

            System.out.println("***********************");
            System.out.println(index);
            System.out.println("username:" + username);
            System.out.println("***********************");

            wordAndMeanings = CRUD.QueryWordMeaning(userInfo);

        }catch (Exception e){
            e.printStackTrace();
        }
        return wordAndMeanings;
    }
}
