package com.myspring;

import com.myspring.factory.AutowireCapableBeanFactory;
import com.myspring.factory.BeanFactory;
import com.myspring.io.ResourceLoader;
import com.myspring.xml.XmlBeanDefinitionReader;
import org.junit.Test;

import java.util.Map;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-10 12:23
 */
public class BeanFactoryTest {

    @Test
    public void testRegisterBean() throws Exception{

        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("myioc.xml");

        BeanFactory beanFactory = new AutowireCapableBeanFactory();
        for(Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()){
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }

        HiService hiService = (HiService)beanFactory.getBean("hiService");

    }

}
