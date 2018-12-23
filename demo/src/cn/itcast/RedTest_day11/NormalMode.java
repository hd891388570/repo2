package cn.itcast.RedTest_day11;

import java.util.ArrayList;

public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalmoney, int totalcount) {
        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalmoney / totalcount;
        int mo = totalmoney % totalcount;
        for (int i = 0; i < totalcount - 1; i++) {
            list.add(avg);
        }
        list.add(avg + mo);
        return list;
    }
}
