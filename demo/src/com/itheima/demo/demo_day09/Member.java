package com.itheima.demo.demo_day09;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
    public void receive(ArrayList<Integer> redlist){
        int index = new Random().nextInt(redlist.size());
        int mymoney = redlist.get(index);
        redlist.remove(index);
        super.setMoney(mymoney);
    }
}
