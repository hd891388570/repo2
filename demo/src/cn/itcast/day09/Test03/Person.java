package cn.itcast.day09.Test03;

//4.定义Person类 //饲养动物  有一个方法可以传递东西
//        属性：
//        姓名，年龄
//        行为：
//        keepPet(Dog dog,String something)方法
//        功能：喂养宠物狗，something表示喂养的东西
//        行为：
//        keepPet(Cat cat,String something)方法
//        功能：喂养宠物猫，something表示喂养的东西
//        生成空参有参构造，set和get方法

public class Person {
    private String name;
    private  int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void keepPet(Dog dog , String something){
        System.out.println("喂养宠物狗，喂养的东西是:" + something);
        dog.eat(something);
    }

    public void keepPet(Cat cat , String something){
        System.out.println("喂养宠物猫，喂养的东西是：" +something);
        cat.eat(something);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
