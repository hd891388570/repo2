package com.itheima.demo.demo_day10_23;

public class Main {
    public static void main(String[] args) {
        Computer cm = new Computer();
        cm.powOn();
        UsbInterface usbmouse = new Mouse();
        UsbInterface usbkeyword = new KeyWord();
        cm.useDevers(usbmouse);
        cm.useDevers(usbkeyword);
        cm.powOff();
    }
}
