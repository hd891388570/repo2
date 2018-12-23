package cn.itcast.RedTest_day11;

import java.util.ArrayList;
import java.util.Random;

public class RondomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalmoney, int totalcount) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        int leftmoney = totalmoney;
        int leftcount = totalcount;
        for (int i = 0; i < totalcount - 1; i++) {
            leftmoney = r.nextInt(leftmoney / leftcount * 2) + 1;
            list.add(leftmoney);
            leftmoney = totalmoney - leftmoney;
            leftcount--;
        }
        list.add(leftmoney);
        return list;
    }
}
