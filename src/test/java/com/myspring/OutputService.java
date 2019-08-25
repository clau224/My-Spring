package com.myspring;

import org.junit.Assert;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-25 16:27
 */
public class OutputService {

    private HiService hiService;

    public void output(String text){
        Assert.assertNotNull(hiService);
        System.out.println(text);
    }

    public void setHiService(HiService hiService){
        this.hiService = hiService;
    }
}
