package com.myspring;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-10 10:46
 */
public class BeanDefinition {

    private Object object;

    private Class objectClass;

    private String objectClassName;

    private PropertyValues propertyValues = new PropertyValues();

    public BeanDefinition() {
    }

    public Object getObject() {
        return object;
    }

    public Class getObjectClass() {
        return objectClass;
    }

    public String getObjectClassName() {
        return objectClassName;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public void setObjectClass(Class objectClass) {
        this.objectClass = objectClass;
    }

    public void setObjectClassName(String objectClassName) {
        this.objectClassName = objectClassName;
        try {
            this.objectClass = Class.forName(objectClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
