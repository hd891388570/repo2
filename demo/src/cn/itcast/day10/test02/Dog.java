package cn.itcast.day10.test02;

public class Dog extends Animal implements Swimin {
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void swiMin() {
        System.out.println("狗会狗刨游泳");
    }
}
