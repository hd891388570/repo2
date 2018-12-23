package cn.itcast.day09.Test03;

public class Demo03 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Person person = new Person("我",18);
        person.keepPet(dog,"骨头");
        person.keepPet(cat,"鱼");
    }
}
