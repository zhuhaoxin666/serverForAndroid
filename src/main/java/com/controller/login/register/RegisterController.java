package com.controller.login.register;

import com.dao.crud.CRUD;
import com.dao.entity.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class RegisterController {

    @RequestMapping("/registerRequest")
    public ModelAndView test(UserInfo userInfo){
        ModelAndView modelAndView = new ModelAndView();
        CRUD.addUserInfo(userInfo);

        modelAndView.setViewName("index.jsp");
        modelAndView.addObject("username",userInfo.getName());
        modelAndView.addObject("password",userInfo.getPassword());
        modelAndView.addObject("age",userInfo.getAge());
        modelAndView.addObject("motto",userInfo.getMotto());
        return modelAndView;
    }


    //根据得到的json将user存入数据库
    @RequestMapping(value = "/userRegister",method = RequestMethod.POST)
    @ResponseBody
    public boolean test2(UserInfo userInfo){
        if(CRUD.addUserInfo(userInfo)){
            return true;
        }
        return false;
    }

    @RequestMapping(value = "/android",method = RequestMethod.GET)
    @ResponseBody
    public String test3(){
        return "AndroidTest";
    }

}
