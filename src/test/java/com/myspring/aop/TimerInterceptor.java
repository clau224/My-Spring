package com.myspring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @auther liujiawen04@meituan.com
 * @date 2019-09-01 23:33
 */
public class TimerInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        long time = System.nanoTime();
        System.out.println("Invocation of method " + methodInvocation.getMethod().getName() + " start!");
        Object proceed = methodInvocation.proceed();
        System.out.println("Invocation of method " + methodInvocation.getMethod().getName() + " end!");
        System.out.println(" Takes " + (System.nanoTime() - time) + " nanoseconds.");
        return proceed;
    }
}
