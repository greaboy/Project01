package com.atguigu.java;

import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Method1();
    }

    public static void Method1()
    {
        ArrayList<String> list = new ArrayList<String> ();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for (String s : list) {
            System.out.println("s = " + s);
        }

    }
}
