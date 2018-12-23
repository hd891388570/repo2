package com.itheima.demo.demo_day10;

public class MyInterfacePrivateAImpl implements MyInterfacePrivateA {
        public void methodAnother(){
            //直接访问到了接口中的默认方法，这样是错误的！
//            methodCommon();
        }
}
