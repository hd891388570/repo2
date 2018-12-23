package com.itheima.demo.demo_day10;

public class Demo03Interfaca {
    public static void main(String[] args) {
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

        //错误写法！
        //    impl.methodStatic();
        //直接接口名称调用镜头太方法
        MyInterfaceStatic.methodStatic();
    }
}
