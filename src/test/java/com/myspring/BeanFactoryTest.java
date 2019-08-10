package com.myspring;

import com.myspring.Service.HiService;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-10 12:23
 */
public class BeanFactoryTest {

    @Test
    public void testRegisterBean(){

        BeanFactory beanFactory = new BeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(new HiService());

        beanFactory.registerBeanDefinition(beanDefinition.getObject().getClass().getName(), beanDefinition);

        HiService hiService = (HiService) beanFactory.getBean(HiService.class.getName());
        hiService.sayHi();
    }

}
