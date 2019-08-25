package com.myspring;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-10 12:26
 */
public class HiService {

    private String message;

    private OutputService outputService;

    public void sayHi(){
        outputService.output(message);
    }

    public void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
