package cn.itcast.day06.Day06Test_03;

//1.猫类Cat
//        属性:
//        毛的颜色color
//        品种breed
//        行为:
//        吃饭eat()
//        抓老鼠catchMouse()
//        2.狗类Dog
//        属性:
//        毛的颜色color
//        品种breed
//        行为:
//        吃饭()
//        看家lookHome()
//        要求:
//        1.按照以上要求定义Cat类和Dog类,属性要私有,生成空参、有参构造，setter和getter方法
//        2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
//        3.调用成员方法,打印格式如下:
//        花色的波斯猫正在吃鱼.....
//        花色的波斯猫正在逮老鼠....
//        黑色的藏獒正在啃骨头.....
//        黑色的藏獒正在看家.....

public class Test03 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.setColor("花色的");
        cat.setBreed("波斯猫");
        dog.setBreed("藏獒");
        dog.setColor("黑色的");
        System.out.print(cat.getColor() + cat.getBreed());
        cat.eat();
        System.out.print(cat.getColor() + cat.getBreed());
        cat.catchMouse();
        System.out.print(dog.getColor() + dog.getBreed());
        dog.eat();
        System.out.print(dog.getColor() + dog.getBreed());
        dog.lookHome();
        System.out.println("=====================");
        Cat cat2 = new Cat("肉色的", "无骨猫");
        Dog dog2 = new Dog("白色的", "博美");
        System.out.print(cat2.getColor() + cat2.getBreed());
        cat2.eat();
        System.out.print(cat2.getColor() + cat2.getBreed());
        cat2.catchMouse();
        System.out.print(dog2.getColor() + dog2.getBreed());
        dog2.eat();
        System.out.print(dog2.getColor() + dog2.getBreed());
        dog2.lookHome();
    }
}
