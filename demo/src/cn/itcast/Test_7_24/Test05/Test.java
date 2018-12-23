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

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Person p1 = new Person("李明",22,"游泳");
        Person p3 = new Person("赵玉",40,"跳舞");
        Person p2 = new Person("王红",30,"登山");
        list.add(p1);
        list.add(p2);
        list.add(p3);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge()>30)
                System.out.println(list.get(i).getName() + "," + list.get(i).getAge() + "," + list.get(i).getLike());
        }
    }
}
