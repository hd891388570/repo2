package cn.itcast.Test_7_25.Test02;

public class Cat extends Animal {
    @Override
    public void sleep() {
        System.out.println("趴着睡");
    }
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
