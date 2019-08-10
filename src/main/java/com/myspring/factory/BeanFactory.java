package com.myspring.factory;

import com.myspring.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-10 10:49
 */
public interface BeanFactory {

    Object getBean(String name);

    void registerBeanDefinition(String name, BeanDefinition beanDefinition);

}
