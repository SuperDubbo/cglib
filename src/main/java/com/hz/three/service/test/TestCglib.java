package com.hz.three.service.test;

import com.hz.three.service.impl.BookFacadeImpl;
import com.hz.three.service.proxy.BookFacadeCglib;

/**
 * Created by Jack on 2017/2/18.
 */
public class TestCglib {
    public static void main(String[] args) {
        BookFacadeCglib cglib=new BookFacadeCglib();
        BookFacadeImpl bookCglib= (BookFacadeImpl) cglib.getInstance(new BookFacadeImpl());
        System.out.println(bookCglib.addBook());
    }
}
