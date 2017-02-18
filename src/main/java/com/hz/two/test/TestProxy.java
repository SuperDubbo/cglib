package com.hz.two.test;

import com.hz.two.proxy.BookFacadeProxy;
import com.hz.two.service.BookFacade;
import com.hz.two.service.impl.BookFacadeImpl;

/**
 * JDK动态代理测试类
 *
 *@author zhu_huang
 *@date 2017/2/18
 *@since V1.0
 */
public class TestProxy {
    public static void main(String[] args) {
        BookFacadeProxy proxy=new BookFacadeProxy();
        BookFacade bookFroxy= (BookFacade) proxy.bind(new BookFacadeImpl());
        bookFroxy.addBook();
    }
}
