package com.itheima.demo.demo_day10;

public class MyInterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("B实现了抽象方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("B覆盖重写了默认方法");
    }
}
