package com.hz.one.test;

import com.hz.one.proxy.CountProxy;
import com.hz.one.service.impl.CountImpl;

/**
 * 测试Count类
 *
 *@author zhu_huang
 *@date 2017/2/18
 *@since V1.0
 */
public class TestCount {
    public static void main(String[] args) {
        CountImpl countImpl=new CountImpl();
        CountProxy countProxy=new CountProxy(countImpl);
        countProxy.updateCount();
        countProxy.queryCount();
    }
}
