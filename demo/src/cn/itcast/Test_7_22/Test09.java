package cn.itcast.Test_7_22;

//1.定义Empl类，包含salary（工资属性私有化），提供空参带参构造方法，和set/get方法
//        2.定义ArrayList集合，存入3个Empl对象，对象的薪资属性分别为：100，123，567
//        3.遍历集合,将集合中元素的薪资小于等于300的元素删除，将集合中元素的薪资大于300的元素，元素值在原来基础上加100，并在控制台打印输出修改后集合中所有元素的属性

import java.util.ArrayList;

public class Test09 {
    public static void main(String[] args) {
        ArrayList<Empl> list  = new ArrayList<>();
        list.add(new Empl(100));
        list.add(new Empl(123));
        list.add(new Empl(567));
        int salary = 0;
        int i = 0 , flag = 0;
        while (i < list.size()) {
            if (list.get(i).getSalary() <=300) {
                list.remove(i);
                flag = 1;
            }
            else{
                salary = list.get(i).getSalary();
                salary += 100;
                list.get(i).setSalary(salary);
                flag = 0;
            }
            if (flag==0)
                i = 0;
            else
                i++;
        }
        for (i = 0; i < list.size(); i++) {
            System.out.println("第" + (i+1) + "位的工资是：" + list.get(i).getSalary() );
        }
    }
}
