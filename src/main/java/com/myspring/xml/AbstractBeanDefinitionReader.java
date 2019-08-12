package com.myspring.xml;

import com.myspring.BeanDefinition;
import com.myspring.io.Resource;
import com.myspring.io.ResourceLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-11 12:22
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private Map<String, BeanDefinition> registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(ResourceLoader resourceLoader){
        this.registry = new HashMap<String, BeanDefinition>();
        this.resourceLoader = resourceLoader;
    }

    public Map<String, BeanDefinition> getRegistry() {
        return registry;
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
