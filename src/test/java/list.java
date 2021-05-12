import com.service.InputService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class list {

    @Test
    public void hiber(){
        String username = "朱彦林";
        String word = "software";
        String interpretation = ".n 软件";
        InputService inputService = new InputService();
        inputService.addMeaning(username,word,interpretation);
    }


    @Test
    public void test(){
        List list = new ArrayList();
        String str = "123456";
        Integer integer = 2;

//        Map<Map<Integer,String>,Map<Integer,String>>
        list.add(str);
        list.add(integer);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
