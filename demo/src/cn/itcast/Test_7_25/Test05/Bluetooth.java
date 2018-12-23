package cn.itcast.Test_7_25.Test05;

public interface Bluetooth {
    void btFunction();
    public default void connecting(){
        System.out.println("可以连接蓝牙");
    }
}
