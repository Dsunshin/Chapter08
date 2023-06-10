package cn.lzzy;


import cn.lzzy.controller.ChapterdController;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ChapterdTestApplication {


    @Autowired
     ChapterdController chapterdController;
    @Test
     public void unitTest(){
         String result = chapterdController.sayHello();
        System.out.println("单元测试返回"+result);
        System.out.println("--------------------------");
        System.out.println("spring");
     }
}
