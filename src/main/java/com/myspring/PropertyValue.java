package com.myspring;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-10 23:24
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

}
