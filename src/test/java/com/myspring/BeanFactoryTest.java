package com.myspring;

import com.myspring.beans.BeanDefinition;
import com.myspring.beans.factory.AbstractBeanFactory;
import com.myspring.beans.factory.AutowireCapableBeanFactory;
import com.myspring.beans.factory.BeanFactory;
import com.myspring.beans.io.ResourceLoader;
import com.myspring.beans.xml.XmlBeanDefinitionReader;
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

        AbstractBeanFactory beanFactory = new AutowireCapableBeanFactory();
        for(Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()){
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }

        HiService hiService = (HiService)beanFactory.getBean("hiService");
        hiService.sayHi();
    }

    @Test
    public void testPreInstantiate() throws Exception{

        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("myioc.xml");

        AbstractBeanFactory beanFactory = new AutowireCapableBeanFactory();
        for(Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()){
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }

        beanFactory.preInstantiateSingletons();

        HiService hiService = (HiService)beanFactory.getBean("hiService");
        hiService.sayHi();
    }

}
