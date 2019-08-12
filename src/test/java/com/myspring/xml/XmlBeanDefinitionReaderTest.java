package com.myspring.xml;

import com.myspring.BeanDefinition;
import com.myspring.io.ResourceLoader;
import org.junit.Test;

import java.util.Map;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-11 13:47
 */
public class XmlBeanDefinitionReaderTest {
    @Test
    public void test() throws Exception{
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("myioc.xml");
        Map<String, BeanDefinition> registry = xmlBeanDefinitionReader.getRegistry();
        System.out.println(registry.size());
    }
}
