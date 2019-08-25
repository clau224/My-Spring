package com.myspring;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-25 17:00
 */
public class BeanReference {

    private String name;

    private Object bean;

    public BeanReference(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

    public void setName(String name) {
        this.name = name;
    }
}
