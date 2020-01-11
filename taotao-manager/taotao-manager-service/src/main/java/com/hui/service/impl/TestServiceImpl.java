package com.hui.service.impl;

import com.hui.mapper.TestMapper;
import com.hui.service.TestService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;


@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public String queryDate() {

        System.out.println("执行了吗。。。");
        System.out.println(testMapper);
        System.out.println("日期为："+testMapper.queryDate());
        return testMapper.queryDate();
    }


//    @Test
//    public void testMapper() throws Exception {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
//        //通过接口获得代理对象
//        TestMapper mapper = ac.getBean(TestMapper.class);
//        System.out.println(mapper);
//        //通过id获得代理对象，由于通过自动扫描的方式获得，没有命名id，所以就不能通过这种方式获得mapper代理对象。
//        //UserMapper mapper = (UserMapper) ac.getBean("userMapper");
//        String s = mapper.queryDate();
//        System.out.println(s);
//    }
//    @Test
//    public  void TestMethod() {
//        String s = queryDate();
//        System.out.println(s);
//    }
}





