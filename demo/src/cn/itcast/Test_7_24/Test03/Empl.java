package cn.itcast.Test_7_24.Test03;

//1.定义Empl类，包含salary（工资属性私有化），提供空参带参构造方法，和set/get方法
//        2.定义ArrayList集合，存入3个Empl对象，对象的薪资属性分别为：100，123，567
//        3.遍历集合,将集合中元素的薪资小于等于300的元素删除，将集合中元素的薪资大于300的元素，元素值在原来基础上加100，并在控制台打印输出修改后集合中所有元素的属性

import java.util.ArrayList;

public class Empl {
    private int salary;

    public Empl() {
    }

    public Empl(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Empl e1 = new Empl(100);
        Empl e2 = new Empl(123);
        Empl e3 = new Empl(567);
        ArrayList<Empl> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        int flag = 0;
        for (int i = 0; i < list.size(); ) {
            if (list.get(i).getSalary() < 300) {
                list.remove(i);
                flag = 1;
            } else {
                list.get(i).setSalary(list.get(i).getSalary() + 100);
                System.out.println(list.get(i).getSalary());
            }
            if (flag == 0) {
                i++;
            } else {
                i = 0;
                flag = 0;
            }
        }
    }
}
