package com.dao.crud;

import com.dao.entity.UserInfo;
import com.dao.entity.WordAndMeaning;
import com.dao.util.MySessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.*;

public class CRUD {
    private static Session session;

    private CRUD(){}


    public static boolean addUserInfo(UserInfo userInfo){
        session = MySessionFactory.getSessionFactory().openSession();
        session.beginTransaction().begin();
        try {
            session.save(userInfo);
            session.beginTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            session.beginTransaction().rollback();
            return false;
        }finally {
            session.close();
        }
        return true;
    }


    public static UserInfo getUserInfo(String username){
        UserInfo userInfo;
        session = MySessionFactory.getSessionFactory().openSession();
        String hql = "select u.id from UserInfo u where u.name = :name";
        try {
            Integer index = (Integer) session.createQuery(hql).setString("name",username).uniqueResult();
            userInfo = (UserInfo) session.get(UserInfo.class, index);
            return userInfo;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


    public static boolean addWordAndMeaning(UserInfo userInfo,WordAndMeaning wordAndMeaning){
        session = MySessionFactory.getSessionFactory().openSession();
        session.beginTransaction().begin();

        String userName = userInfo.getName();
        String hql = "select u.id from UserInfo u where u.name = :name";
        try {
            Integer index = (Integer) session.createQuery(hql).setString("name",userName).uniqueResult();
            UserInfo u = (UserInfo) session.get(UserInfo.class, index);
            wordAndMeaning.setUserInfo(u);
            u.getSet().add(wordAndMeaning);
            session.save(u);
            session.save(wordAndMeaning);
            session.beginTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            session.beginTransaction().rollback();
            return false;
        }
        return true;
    }

    public static boolean delWordAndMeaning(UserInfo userInfo){
        session = MySessionFactory.getSessionFactory().openSession();
        session.beginTransaction().begin();

        try {
            String hql = "select u.id from UserInfo u where u.name = :name";
            Integer userId = (Integer) session.createQuery(hql).setString("name", userInfo.getName()).uniqueResult();
            UserInfo user = (UserInfo) session.get(UserInfo.class, userId);
            Set<WordAndMeaning> set = user.getSet();
            for (WordAndMeaning w:set
                 ) {
                session.delete(w);
            }
//            String sql = "delete from word_and_meaning w where w.user_id = ?";
//
//            session.createSQLQuery(sql).setParameter(0,userId).executeUpdate();
            session.beginTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            session.beginTransaction().rollback();
            return false;
        }
        return true;
    }

    public static List<WordAndMeaning> QueryWordMeaning(UserInfo userInfo){
        session = MySessionFactory.getSessionFactory().openSession();
        session.beginTransaction().begin();

        String Username = userInfo.getName();
        String hql ="select u.id from UserInfo u where u.name = :name";
        Integer index = (Integer) session.createQuery(hql).setString("name", Username).uniqueResult();

        String hql2 = "select new WordAndMeaning(w.word,w.meaning) from WordAndMeaning w where w.userInfo = :uid";
        List list = session.createQuery(hql2).setString("uid", String.valueOf(index)).list();
        return list;
    }

    public static Map QueryUserAndPassword(){
        session = MySessionFactory.getSessionFactory().openSession();
        session.beginTransaction().begin();

        List<UserInfo> userInfoList = new ArrayList<>();
        String hql = "from UserInfo";
        userInfoList = session.createQuery(hql).list();
        List nameAndPassList = new ArrayList();
        Map userAndPassMap = new HashMap();
        for (UserInfo u:userInfoList
             ) {
            userAndPassMap.put(u.getName(),u.getPassword());
        }
        return userAndPassMap;
    }
}
