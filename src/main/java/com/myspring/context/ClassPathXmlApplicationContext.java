package com.myspring.context;

import com.myspring.beans.BeanDefinition;
import com.myspring.beans.factory.AbstractBeanFactory;
import com.myspring.beans.factory.AutowireCapableBeanFactory;
import com.myspring.beans.io.ResourceLoader;
import com.myspring.beans.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-09-01 11:40
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext{

    private String configLocation;

    public ClassPathXmlApplicationContext(String configLocation) throws Exception{
        this(configLocation, new AutowireCapableBeanFactory());
    }

    public ClassPathXmlApplicationContext(String configLocation, AbstractBeanFactory beanFactory) throws Exception{
        super(beanFactory);
        this.configLocation = configLocation;
        refresh();
    }

    @Override
    public void refresh() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions(configLocation);
        for(Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()){
            abstractBeanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }
    }
}
