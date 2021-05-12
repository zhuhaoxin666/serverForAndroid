package com.service;

import com.dao.crud.CRUD;
import com.dao.entity.UserInfo;
import com.dao.entity.WordAndMeaning;
import com.dao.util.MySessionFactory;
import org.hibernate.Session;

public class InputService {

     UserInfo userInfo;
     WordAndMeaning wordAndMeaning;

    public boolean addMeaning(String username,String word,String interpretation){
        wordAndMeaning = new WordAndMeaning();
        try {
            Session session = MySessionFactory.getSessionFactory().openSession();
            session.getTransaction().begin();
            String hql = "select u.id from UserInfo u where u.name = :name";
            Integer index = (Integer) session.createQuery(hql).setString("name",username).uniqueResult();
            System.out.println("***********************");
            System.out.println("username:" + username);
            System.out.println("word:" + word);
            System.out.println("interpretation:" + interpretation);
            System.out.println(index);
            System.out.println("***********************");

            userInfo = (UserInfo) session.get(UserInfo.class, index);

            wordAndMeaning.setWord(word);
            wordAndMeaning.setMeaning(interpretation);
            wordAndMeaning.setUserInfo(userInfo);
            CRUD.addWordAndMeaning(userInfo,wordAndMeaning);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
