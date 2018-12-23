package cn.itcast.Test_7_24_2;

//请编写程序，键盘录入1个字符串，统计字符串中的大写字符个数，小写字符个数和数字的个数。
//        格式如下：
//        数字个数：3
//        请输入：	小写字符个数：2
//        大写字符个数：2

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int big = 0,small = 0,num = 0;
        System.out.println("输入遗传字符串：");
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='A'&&str.charAt(i)<='Z')
                big++;
            else if (str.charAt(i)>='a'&&str.charAt(i)<='z')
                small++;
            else if (str.charAt(i)>='0'&&str.charAt(i)<='9')
                num++;
        }
        System.out.println("数字个数：" + num + "，小写字符个数：" + small + ",大写字符个数：" + big);
    }
}
