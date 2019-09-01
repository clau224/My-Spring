package com.myspring.beans.io;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-11 13:30
 */
public class ResourceLoaderTest {

    @Test
    public void test() throws IOException{
        ResourceLoader resourceLoader = new ResourceLoader();
        Resource resource = resourceLoader.getResource("myioc.xml");
        System.out.println(resource);
        InputStream inputStream = resource.getInputStream();
        System.out.println(inputStream);
    }

}
