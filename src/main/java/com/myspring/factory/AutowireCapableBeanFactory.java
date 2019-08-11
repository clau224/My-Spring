package com.myspring.factory;

import com.myspring.BeanDefinition;
import com.myspring.PropertyValue;

import java.lang.reflect.Field;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-10 15:51
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
        Object object = beanDefinition.getObjectClass().newInstance();
        applyPropertyValues(object, beanDefinition);
        return object;
    }

    protected void applyPropertyValues(Object object, BeanDefinition beanDefinition) throws Exception {
        for (PropertyValue propertyValue : beanDefinition.getPropertyValues().getPropertyValueList()) {
            Field field = object.getClass().getDeclaredField(propertyValue.getName());
            field.setAccessible(true);
            field.set(object, propertyValue.getValue());
        }
    }
}
