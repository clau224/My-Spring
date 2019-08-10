package com.myspring;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-10 10:46
 */
public class BeanDefinition {

    private Object object;

    BeanDefinition(Object object){
        this.object = object;
    }

    public Object getObject() {
        return object;
    }
}
