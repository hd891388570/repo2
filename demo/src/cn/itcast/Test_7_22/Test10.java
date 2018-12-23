package cn.itcast.Test_7_22;

//请编写程序，键盘录入1个字符串，统计字符串中的大写字符个数，小写字符个数和数字的个数。
//        格式如下：
//        数字个数：3
//        请输入：	小写字符个数：2
//        大写字符个数：2

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串：");
        String str = sc.next();
        int big = 0, small = 0, num = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c<'Z'&&c>'A')
                big++;
            else if (c<'z'&&c>'a')
                small++;
            else if (c>'0'&&c<'9')
                num++;
        }
        System.out.println("数字个数：" + num + ",小写字符个数：" + small + ",大写字符个数： " + big);
    }
}
