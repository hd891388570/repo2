package com.itheima.demo.demo_day10;

public interface MyInterfaceDefault {
    //抽象方法
    public abstract void methodAbs();
    //新添加一个抽象方法，那么其他所有实现这个接口的类，都必须一个个重写
//    此方法，较为麻烦
//    public abstract void methodAbs2();

    //新添加的方法，改成默认方法
    public  default void methodDefault(){
        System.out.println("这是新添加的默认方法。");
    }
}
