package cn.itcast.Test_7_20;

//方法的练习：
//        1.求两个数据之和(整数和小数)
//        2.判断两个数据是否相等(整数和小数)
//        3.获取两个数中较大的值(整数和小数)并返回
//        4.获取两个数中较小的值(整数和小数)并返回
//        5.否能用一个方法实现3和4的两个功能

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入一个小数：");
        double num2 = sc.nextDouble();
        isEquals(num1, num2);
        double max = max(num1, num2);
        double min = min(num1,num2);
        maxandmin(num1,num2);
    }

    public static double max(int num1, double num2) {

        return num1 > num2 ? num1 : num2;
    }

    public static double min(int num1, double num2) {

        return num1 > num2 ? num2 : num1;
    }

    public static void isEquals(int num1, double num2) {
        if (num1 == num2)
            System.out.println("相等");
        else
            System.out.println("不相等");
        return;
    }
    public  static void maxandmin(int num1, double num2){
        if (num1 > num2){
            System.out.println("最大值为 ：" + num1 + "最小值为：" + num2);
        }
        else if (num1<num2)
            System.out.println("最大值为 ：" + num2 + "最小值为：" + num1);
        else
            System.out.println("相等");
    }
}
