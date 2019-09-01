package com.myspring.context;

import com.myspring.HiService;
import org.junit.Test;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-09-01 14:23
 */
public class ApplicationContextTest {

    @Test
    public void test() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myioc.xml");
        HiService hiService = (HiService)applicationContext.getBean("hiService");
        hiService.sayHi();
    }
}
