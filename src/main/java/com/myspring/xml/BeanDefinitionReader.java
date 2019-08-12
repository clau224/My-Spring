package com.myspring.xml;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-11 12:21
 */
public interface BeanDefinitionReader {

    void loadBeanDefinitions(String location) throws Exception;
}
