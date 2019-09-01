package com.myspring.beans.factory;

import com.myspring.beans.BeanDefinition;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-10 10:49
 */
public interface BeanFactory {

    Object getBean(String name) throws Exception;
}
