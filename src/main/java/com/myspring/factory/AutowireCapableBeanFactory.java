package com.myspring.factory;

import com.myspring.BeanDefinition;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-10 15:51
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) {
        try {
            Object object = beanDefinition.getObjectClass().newInstance();
            return object;
        } catch (InstantiationException e){
            e.printStackTrace();
        } catch (IllegalAccessException e){
            e.printStackTrace();
        }

        return null;
    }
}
