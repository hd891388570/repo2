package cn.itcast.RedTest_day11;

import java.util.ArrayList;
import java.util.Scanner;

public class BootStrap {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        OpenMode normal = new NormalMode();
        OpenMode random = new RondomMode();
        System.out.println("请输入金额：");
        int totalmoney = sc.nextInt();
        System.out.println("请输入数目：");
        int totalcount = sc.nextInt();
        list = normal.divide(totalmoney, totalcount);
        System.out.println(list);
        list = random.divide(totalmoney, totalcount);
        System.out.println(list);
    }
}
