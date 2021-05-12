package com.controller.inputWords;

import com.alibaba.fastjson.JSONObject;
import com.bean.Restful;
import com.dao.crud.CRUD;
import com.dao.entity.WordAndMeaning;
import com.service.InputService;
import com.service.OutputService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InputWordsController {

    @RequestMapping(value = "/input",method = RequestMethod.POST)
    @ResponseBody
    public String test(String username,String word,String interpretation){
        Restful wrong = new Restful();
        wrong.setCode(400);
        wrong.setMessage("插入失败，有异常");
        JSONObject jsonObject2 = new JSONObject();
        String wrongStr = jsonObject2.toJSONString(wrong);

        InputService service = new InputService();
        boolean flag = service.addMeaning(username, word, interpretation);
        if(flag){
            Restful right = new Restful();
            right.setCode(200);
            right.setName((String) username);
            right.setMessage("插入成功");
            JSONObject jsonObject = new JSONObject();
            String rightStr = jsonObject.toJSONString(right);
            return rightStr;
        }
        return wrongStr;
    }

    @RequestMapping("/inputPage")
    public ModelAndView inputPage(String username){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addwords.jsp");
        modelAndView.addObject("username",username);
        return modelAndView;
    }

}
