package com.mamezou.sample.weld_se.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Sample
public class SampleInterceptor {
    @AroundInvoke
    public Object around(InvocationContext ctx) throws Exception {
        System.out.println("invoke interceptor");
        return ctx.proceed();
    }
}
