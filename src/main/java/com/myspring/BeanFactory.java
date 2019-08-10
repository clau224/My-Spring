package com.myspring;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-10 10:49
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getObject();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
