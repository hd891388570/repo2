package cn.itcast.Test_7_25.Test02;

public class Duck extends Animal {
    @Override
    public void sleep() {
        System.out.println("漂着睡");
    }

    public void fly(fly f){
        f.flyInSky();
    }
}
