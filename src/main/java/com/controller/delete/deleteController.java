package com.controller.delete;


import com.alibaba.fastjson.JSONObject;
import com.bean.Restful;
import com.service.DeleteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class deleteController {
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ResponseBody
    public String test(String username){

        Restful wrong = new Restful();
        wrong.setCode(400);
        wrong.setMessage("删除失败,该用户可能未注册或出现其他DAO异常");
        JSONObject jsonObject2 = new JSONObject();
        String wrongStr = jsonObject2.toJSONString(wrong);

        Restful right = new Restful();
        right.setCode(200);
        right.setName((String) username);
        right.setMessage("删除成功");
        JSONObject jsonObject = new JSONObject();
        String rightStr = jsonObject.toJSONString(right);

        DeleteService deleteService = new DeleteService();
        boolean flag = deleteService.deleteWords(username);
        if(flag){
            return rightStr;
        }
        return wrongStr;
    }
}
