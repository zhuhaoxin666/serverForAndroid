import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dao.entity.UserInfo;
import com.dao.entity.WordAndMeaning;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class FastJsonTest {
    @Test
    public void strToMap() {
        String str = "{\"0\":\"zhangsan\",\"1\":\"lisi\",\"2\":\"wangwu\",\"3\":\"maliu\"}";
        JSONObject map = JSON.parseObject(str);
        for (Object o: map.keySet()) {
            System.out.println("key: " + o + " value: " + map.get(o));
        }
    }

    @Test
    public void test(){
        UserInfo u = new UserInfo();
        u.setName("朱浩鑫");
        u.setAge(20);
        u.setMotto("stay hungry,stay foolish");
        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(u);
        System.out.println(jsonObject);

        WordAndMeaning wordAndMeaning = new WordAndMeaning();
        wordAndMeaning.setWord("hello");
        wordAndMeaning.setMeaning("你好");
        JSONObject word = (JSONObject) JSONObject.toJSON(wordAndMeaning);
        System.out.println(word);
    }


    @Test
    public void mapToStr() {
        Map<String, String> map = new HashMap<>();
        map.put("n", "你好");
        map.put("v", "提取");
        map.put("adj", "垃圾的");
        String str = JSON.toJSONString(map);
        System.out.println("str=" + str);

        // str to map
        JSONObject map2 = JSON.parseObject(str);
        for (Object o: map2.keySet()) {
            System.out.println("key: " + o + " value: " + map.get(o));
        }
    }
}
