package com.controller.delete;


import com.service.DeleteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class deletePageController {
    @RequestMapping("/deletePage")
    public ModelAndView test(String username){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("basic.jsp");
        modelAndView.addObject("username",username);
        DeleteService deleteService = new DeleteService();
        deleteService.deleteWords(username);

        return modelAndView;
    }
}
