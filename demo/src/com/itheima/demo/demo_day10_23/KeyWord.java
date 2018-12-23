package com.itheima.demo.demo_day10_23;

public class KeyWord implements UsbInterface {
    @Override
    public void Open() {
        System.out.println("打开键盘");
    }

    @Override
    public void Close() {
        System.out.println("关闭键盘");
    }
    public void Hipe(){
        System.out.println("敲击键盘");
    }
}
