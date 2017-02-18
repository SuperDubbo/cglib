package com.hz.three.service.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 使用cglib动态代理
 *
 *@author zhu_huang
 *@date 2017/2/18
 *@since V1.0
 */
public class BookFacadeCglib implements MethodInterceptor {
    private Object target;


    /**
     * 创建代理对象
     *
     * @param target
     * @return
     */
    public Object getInstance(Object target){
        this.target=target;
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        //回调方法
        enhancer.setCallback(this);
        //创建代理对象
        return enhancer.create();
    }


    /**
     * 回调方法
     *
     * @param obj
     * @param method
     * @param args
     * @param proxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        Object result=null;
        System.out.println("事务开始");
        result=proxy.invokeSuper(obj,args);
        System.out.println("事务结束");
        return result;
    }
}
