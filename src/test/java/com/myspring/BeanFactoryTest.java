package com.myspring;

import com.myspring.Service.HiService;
import com.myspring.factory.AutowireCapableBeanFactory;
import com.myspring.factory.BeanFactory;
import org.junit.Test;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-10 12:23
 */
public class BeanFactoryTest {

    @Test
    public void testRegisterBean() throws Exception{

        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setObjectClassName(HiService.class.getName());

        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("message", "Today is Saturday"));
        beanDefinition.setPropertyValues(propertyValues);

        beanFactory.registerBeanDefinition(HiService.class.getName(), beanDefinition);

        HiService hiService = (HiService) beanFactory.getBean(HiService.class.getName());
        hiService.sayHi();
    }

}
