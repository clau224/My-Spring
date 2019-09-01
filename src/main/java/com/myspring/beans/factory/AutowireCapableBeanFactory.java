package com.myspring.beans.factory;

import com.myspring.beans.BeanDefinition;
import com.myspring.BeanReference;
import com.myspring.beans.PropertyValue;

import java.lang.reflect.Field;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-10 15:51
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
        Object object = beanDefinition.getObjectClass().newInstance();
        beanDefinition.setObject(object);
        applyPropertyValues(object, beanDefinition);
        return object;
    }

    protected void applyPropertyValues(Object object, BeanDefinition beanDefinition) throws Exception {
        for (PropertyValue propertyValue : beanDefinition.getPropertyValues().getPropertyValueList()) {
            Field field = object.getClass().getDeclaredField(propertyValue.getName());
            field.setAccessible(true);
            Object value = propertyValue.getValue();
            if(value instanceof BeanReference){
                BeanReference beanReference = (BeanReference) value;
                value = getBean(beanReference.getName());
            }
            field.set(object, value);
        }
    }
}
