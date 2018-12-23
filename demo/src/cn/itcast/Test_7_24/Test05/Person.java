package cn.itcast.Test_7_24.Test05;

//定义一个Person类，包含满参构造方法和以下成员属性：
//        成员属性:
//        姓名（String）
//        年龄（int）
//        爱好（String）
//
//        a. 定义一个测试类Test，在Test类的main方法中利用满参构造创建三个Person对象
//        “李明”,22, "游泳";”王红”,30,"登山"; "赵玉",40,"跳舞 "。
//        b. 将这三个对象存入ArrayList<Person>集合中
//        c. 遍历集合，输出年龄在30岁以上的对象的所有属性

public class Person {
    private String name;
    private int age;
    private String like;

    public Person() {
    }

    public Person(String name, int age, String like) {
        this.name = name;
        this.age = age;
        this.like = like;
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

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}
