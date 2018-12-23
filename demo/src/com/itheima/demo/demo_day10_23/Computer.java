package com.itheima.demo.demo_day10_23;

public class Computer {
    public void powOn() {
        System.out.println("笔记本开机！");
    }

    public void powOff() {

        System.out.println("笔记本关机！");
    }

    public void useDevers(UsbInterface usb) {
        usb.Open();
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.Clik();
        }
        if (usb instanceof KeyWord){
            KeyWord keyword = (KeyWord) usb;
            keyword.Hipe();
        }
        usb.Close();
    }
}
