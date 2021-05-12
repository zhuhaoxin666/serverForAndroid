package com.controller.login;

import com.alibaba.fastjson.JSONObject;
import com.bean.Restful;
import com.dao.crud.CRUD;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import java.util.Map;

@Controller
public class Login {
    @RequestMapping("/login")
    public ModelAndView test(ModelAndView modelAndView){
        modelAndView.setViewName("");
        return modelAndView;
    }

    @RequestMapping("/index")
    public ModelAndView test1(ModelAndView modelAndView){
        modelAndView.setViewName("index.jsp");

        return modelAndView;
    }

    @RequestMapping("/registerPage")
    public ModelAndView test2(ModelAndView modelAndView){
        modelAndView.setViewName("register.jsp");
        return modelAndView;
    }


    //根据数据库中的user信息验证登录
    @RequestMapping(value = "/existUser",method = RequestMethod.POST)
    @ResponseBody
    public String existUser( String username, String password){
        Map userAndPassword = CRUD.QueryUserAndPassword();

        Restful wrong = new Restful();
        wrong.setCode(400);
        wrong.setMessage("用户名或密码错误");
        JSONObject jsonObject2 = new JSONObject();
        String wrongStr = jsonObject2.toJSONString(wrong);

        for (Object name:userAndPassword.keySet()
             ) {
            if(username.equals(name)){
                Restful right = new Restful();
                right.setCode(200);
                right.setName((String) name);
                right.setMessage("验证成功");
                JSONObject jsonObject = new JSONObject();
                String rightStr = jsonObject.toJSONString(right);
                //判断密码是否正确
                if(password.equals(userAndPassword.get(username))){
                    return rightStr;
                }
            }
        }
        return wrongStr;
    }

    @RequestMapping(value = "/existUserPage",method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView existUserPage( String username, String password){
        Map userAndPassword = CRUD.QueryUserAndPassword();

        ModelAndView modelAndView = new ModelAndView();
        for (Object name:userAndPassword.keySet()
        ) {
            if(username.equals(name)){
                Restful right = new Restful();
                right.setCode(200);
                right.setName((String) name);
                right.setMessage("验证成功");
                JSONObject jsonObject = new JSONObject();
                String rightStr = jsonObject.toJSONString(right);
                //判断密码是否正确
                if(password.equals(userAndPassword.get(username))){
                    modelAndView.setViewName("basic.jsp");
                    modelAndView.addObject("username",username);
                    return modelAndView;
                }
            }
        }
        modelAndView.setViewName("error.jsp");
        return modelAndView;
    }
}
