package com.myspring.Service;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-10 12:26
 */
public class HiService {

    private String message;

    public void sayHi(){
        System.out.println("Hi~ALL!" + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
