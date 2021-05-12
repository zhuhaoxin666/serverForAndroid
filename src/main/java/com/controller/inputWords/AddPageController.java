package com.controller.inputWords;

import com.service.InputService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddPageController {
    @RequestMapping(value = "/addMeaning",method = RequestMethod.POST)
    public ModelAndView test(String username,String word,String meaning){
        ModelAndView modelAndView = new ModelAndView();
        InputService inputService = new InputService();
        inputService.addMeaning(username,word,meaning);
        modelAndView.setViewName("basic.jsp");
        modelAndView.addObject("username",username);
        return modelAndView;
    }

}
