package cn.itcast.day10.test02;

public class Qing extends Animal implements Swimin {
    @Override
    public void eat(){
        System.out.println("青蛙吃小虫");
    }
    @Override
    public void swiMin() {
        System.out.println("青蛙会蛙泳");
    }
}
