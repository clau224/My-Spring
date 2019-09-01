package com.myspring.context;

import com.myspring.beans.factory.AbstractBeanFactory;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-09-01 11:29
 */
public abstract class AbstractApplicationContext implements ApplicationContext {
    protected AbstractBeanFactory abstractBeanFactory;

    public AbstractApplicationContext(AbstractBeanFactory beanFactory){
        this.abstractBeanFactory = beanFactory;
    }

    public void refresh() throws Exception{

    }

    @Override
    public Object getBean(String name) throws Exception {
        return abstractBeanFactory.getBean(name);
    }
}
