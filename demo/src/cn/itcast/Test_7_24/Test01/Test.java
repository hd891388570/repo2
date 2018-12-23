package cn.itcast.Test_7_24.Test01;

//（1）定义"军人"类,Solider,包含以下成员：
//        成员属性：name（姓名）：String类型；age（年龄）：int类型；like(爱好)：String类型；属性使用private修饰
//        成员方法：
//        1.get/set方法
//        2.show（）方法，打印对象所有属性的值
//        （2）定义类：Test，类中定义main（）方法，按以下要求编写代码：
//        1.实例化三个Solider对象，三个对象分别为："王小兵"，25，"打篮球"、"李团长"，35，"游泳"、"王军长"，55，"踢足球"；
//        2.创建一个ArrayList集合，这个集合里面存储的是Solider类型，分别将上面的三个Solider对象添加到集合中
//        3.遍历这个集合，在遍历的过程中，如果这个集合里面的对象的年龄大于40，那么将集合中的这个对象的爱好改成"打高尔夫"，然后调用这个对象的show（）方法展示这个对象所有的属性信息

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Solider s1 = new Solider("王小兵", 25, "打篮球");
        Solider s2 = new Solider("李团长", 35, "游泳");
        Solider s3 = new Solider("王军长", 55, "踢足球");
        ArrayList<Solider> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() > 40)
                list.get(i).setLike("打高尔夫");
            list.get(i).show();
        }
    }
}
