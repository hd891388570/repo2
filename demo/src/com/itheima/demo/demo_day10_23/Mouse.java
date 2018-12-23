package com.itheima.demo.demo_day10_23;

public class Mouse implements UsbInterface {
    @Override
    public void Open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void Close() {
        System.out.println("关闭鼠标");
    }
    public void Clik(){
        System.out.println("点击鼠标");
    }
}
