package com.itheima.demo.demo_day10;

public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();

        //调用默认方法，如果实现类当中没有，会向上找接口
        a.methodDefault();

        //调用抽象类，实际运行的是右侧实现类
        a.methodAbs();

        System.out.println("============");

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodDefault();
        b.methodAbs();
    }
}
