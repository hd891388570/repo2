package cn.itcast.day10.test02;

public class Maneger {
    public void run(Animal animal){
        animal.water();
        animal.eat();
        if (animal instanceof Dog){
            ((Dog) animal).swiMin();
        }
        if (animal instanceof Qing){
            ((Qing) animal).swiMin();
        }
    }
}
