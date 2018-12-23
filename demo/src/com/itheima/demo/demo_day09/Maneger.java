package com.itheima.demo.demo_day09;

import java.lang.reflect.Member;
import java.util.ArrayList;

public class Maneger extends User {
    public Maneger() {
    }

    public Maneger(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int allmoney, int count) {
        ArrayList<Integer> redlist = new ArrayList<>();
        int leftmoney = super.getMoney();
        if (allmoney > leftmoney) {
            System.out.println("余额不足！！！");
            return redlist;
        }
        super.setMoney(leftmoney - allmoney);
        int avgmoney = allmoney / count;
        int mod = allmoney % count;
        for (int i = 0; i < count - 1; i++) {
            redlist.add(avgmoney);
        }
        int last = avgmoney + mod;
        redlist.add(last);
        return redlist;
    }
}
