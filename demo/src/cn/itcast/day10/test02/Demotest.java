package cn.itcast.day10.test02;

public class Demotest {
    public static void main(String[] args) {
        Maneger m = new Maneger();
        Animal dog = new Dog();
        Animal yang = new Yang();
        Animal qing = new Qing();
        m.run(dog);
        System.out.println("======");
        m.run(qing);
        System.out.println("======");
        m.run(yang);
    }
}
