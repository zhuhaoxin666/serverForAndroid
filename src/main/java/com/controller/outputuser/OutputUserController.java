package com.controller.outputuser;


import com.service.OutputUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OutputUserController {


    @RequestMapping(value = "/getUserInfo",method = RequestMethod.POST)
    @ResponseBody
    public String test(String username){
        OutputUserService outputUserService = new OutputUserService();
        String userInfo = outputUserService.getUserInfo(username);
        return userInfo;
    }

}
