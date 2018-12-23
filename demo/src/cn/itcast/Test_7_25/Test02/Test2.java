package cn.itcast.Test_7_25.Test02;

public class Test2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Duck duck = new Duck();
        Feeder f = new Feeder();
        f.feed(cat);
        f.feed(duck);
    }
}
