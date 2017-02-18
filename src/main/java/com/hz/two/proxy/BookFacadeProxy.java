package com.hz.two.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Jack on 2017/2/18.
 */
public class BookFacadeProxy implements InvocationHandler{
    private Object target;

    /**
     * 绑定委托对象并返回一个代理类
     *
     * @param target
     * @return
     */
    public Object bind(Object target) {
        this.target = target;
        //取得代理对象
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);//要绑定接口(这是一个缺陷,cglib弥补了这一缺陷)
    }

    /**
     * 调用方法
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=null;
        System.out.println("事务开始");
        //执行方法
        result=method.invoke(target,args);
        System.out.println("事务结束");
        return result;
    }
}






