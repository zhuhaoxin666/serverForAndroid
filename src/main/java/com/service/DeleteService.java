package com.service;

import com.dao.crud.CRUD;
import com.dao.entity.UserInfo;
import com.dao.util.MySessionFactory;
import org.hibernate.Session;

public class DeleteService {
    UserInfo userInfo;

    public boolean deleteWords(String username){
        try {
            Session session = MySessionFactory.getSessionFactory().openSession();
            String hql = "select u.id from UserInfo u where u.name = :name";
            Integer index = (Integer) session.createQuery(hql).setString("name",username).uniqueResult();
            userInfo = (UserInfo) session.get(UserInfo.class, index);
            CRUD.delWordAndMeaning(userInfo);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
