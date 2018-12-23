package com.itheima.demo.demo_day09;

import cn.itcast.day06.Day06Text_02.Manage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Maneger god = new Maneger("我",100);
        Member list1 = new Member("成员A",0);
        Member list2 = new Member("成员B",0);
        Member list3 = new Member("成员C",0);
        god.show();
        list1.show();
        list2.show();
        list3.show();
        System.out.println("-----------------");
        System.out.println("发了红包之后：");
        ArrayList<Integer> list = new ArrayList<>();
        list = god.send(80,3);
        list1.receive(list);
        list2.receive(list);
        list3.receive(list);
        god.show();
        list1.show();
        list2.show();
        list3.show();
    }
}
