package com.myspring.aop;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-09-01 19:16
 */
public class TargetSource {

    private Class targetClass;

    private Object target;

    public TargetSource(Object target, Class<?> targetClass) {
        this.target = target;
        this.targetClass = targetClass;
    }

    public Class getTargetClass() {
        return targetClass;
    }

    public Object getTarget() {
        return target;
    }

}
