package com.myspring.beans.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-08-11 12:03
 */
public class URLResource implements Resource {

    private final URL url;

    public URLResource(URL url){
        this.url = url;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        return urlConnection.getInputStream();
    }

}
