package com.myspring.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-11 10:21
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}
