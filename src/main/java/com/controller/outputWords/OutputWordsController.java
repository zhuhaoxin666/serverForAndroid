package com.controller.outputWords;

import com.dao.entity.WordAndMeaning;
import com.service.OutputPageService;
import com.service.OutputService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class OutputWordsController {

    @RequestMapping(value = "output",method = RequestMethod.POST)
    @ResponseBody
    public List<String> test(String username){
        OutputService outputService = new OutputService();
        List<String> userWordsAndMeaning = outputService.getUserWordsAndMeaning(username);
        return userWordsAndMeaning;
    }

    @RequestMapping(value = "/outputPage",method = RequestMethod.POST)
    public ModelAndView test1(String username){

        ModelAndView modelAndView = new ModelAndView();
        OutputPageService outputPageService = new OutputPageService();
        List<WordAndMeaning> userWordsAndMeanings = outputPageService.getUserWordsAndMeaning(username);
        int i = 0;
        for (WordAndMeaning w:userWordsAndMeanings
             ) {
            modelAndView.addObject("word"+i,w.getWord());
            modelAndView.addObject("meaning"+i,w.getMeaning());
            i++;
        }
        modelAndView.setViewName("displaywords.jsp");
        modelAndView.addObject("lenth",i+1);
        modelAndView.addObject("username",username);
        return modelAndView;
    }

}
