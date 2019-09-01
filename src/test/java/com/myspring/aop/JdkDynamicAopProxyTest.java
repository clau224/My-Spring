package com.myspring.aop;

import com.myspring.HiService;
import com.myspring.context.ApplicationContext;
import com.myspring.context.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-09-01 23:40
 */
public class JdkDynamicAopProxyTest {

    @Test
    public void testInterceptor() throws Exception{

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myioc.xml");
        HiService hiService = (HiService) applicationContext.getBean("hiService");

        AdvisedSupport advisedSupport = new AdvisedSupport();
        TargetSource targetSource = new TargetSource(hiService, HiService.class);
        advisedSupport.setTargetSource(targetSource);

        TimerInterceptor timerInterceptor = new TimerInterceptor();
        advisedSupport.setMethodInterceptor(timerInterceptor);

        JdkDynamicAopProxy jdkDynamicAopProxy = new JdkDynamicAopProxy(advisedSupport);
        HiService hiServiceProxy = (HiService)jdkDynamicAopProxy.getProxy();

        hiServiceProxy.sayHi();
    }
}
