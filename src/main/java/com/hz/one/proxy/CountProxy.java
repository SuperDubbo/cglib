package com.hz.one.proxy;

import com.hz.one.service.Count;
import com.hz.one.service.impl.CountImpl;

/**
 * 这是一个代理类(增强CountImpl实现类)
 *
 *@author zhu_huang
 *@date 2017/2/18
 *@since V1.0
 */
public class CountProxy implements Count{
    private CountImpl countImpl;

    /**
     * 覆盖默认构造器
     *
     * @param countImpl
     */
    public CountProxy(CountImpl countImpl) {
        this.countImpl = countImpl;
    }

    public void queryCount() {
        System.out.println("事务处理之前");
        //调用委托类的方法
        countImpl.queryCount();
        System.out.println("事务处理之后");
    }

    public void updateCount() {
        System.out.println("事务处理之前");
        countImpl.updateCount();
        System.out.println("事务处理之后");
    }
}
