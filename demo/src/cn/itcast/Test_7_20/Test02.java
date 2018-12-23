package cn.itcast.Test_7_20;

//定义一个int类型变量接收一个大于100的三位数,求出100到该数字之间满足如下要求的数字之和:
//        1.数字的个位数不为7;
//        2.数字的十位数不为5;
//        3.数字的百位数不为3;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于100的三位数:");
        int num = sc.nextInt();
        while (num <= 100 || num > 1000) {
            System.out.println("输入有误，请重新输入：");
            num = sc.nextInt();
            if (num > 100 && num < 1000)
                break;
        }
        int sum = 0;
        for (int i = 100; i <= num; i++) {
            int ge = i % 10;
            int shi = i % 100 / 10;
            int bai = i / 100;
            if (ge != 7 && shi != 5 && bai != 3) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println();
        System.out.println("和为：" + sum);
    }
}
