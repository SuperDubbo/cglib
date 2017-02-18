package com.hz.one.service.impl;

import com.hz.one.service.Count;

/**
 * 委托类(包含业务逻辑)
 *
 *@author zhu_huang
 *@date 2017/2/18
 *@since V1.0
 */
public class CountImpl implements Count{

    public void queryCount() {
        System.out.println("查看账户方法...");
    }

    public void updateCount() {
        System.out.println("修改账户方法...");
    }
}
