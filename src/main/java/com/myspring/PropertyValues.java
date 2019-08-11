package com.myspring;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-10 23:29
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public PropertyValues() {
    }

    public void addPropertyValue(PropertyValue propertyValue) {
        this.propertyValueList.add(propertyValue);
    }

    public List<PropertyValue> getPropertyValueList() {
        return this.propertyValueList;
    }
}
