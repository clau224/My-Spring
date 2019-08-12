package com.myspring.io;

import java.net.URL;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-11 10:21
 */
public class ResourceLoader{

    public Resource getResource(String location){
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new URLResource(resource);
    }
}
