package cn.itcast.Test_7_20;

//1.功能描述：模拟计算器功能，对定义的int类型的数据进行加、减、乘、除的运算，并打印运算结果
//        2.要求：
//        (1)定义三个int类型变量接收三个数据,其中前两个整数代表参加运算的数据，
//        第三个整数为要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算)
//        (2)使用今天所学知识完成功能
//        (3)演示格式如下:
//        第一个整数:30
//        第二个整数:40
//        您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):0
//        控制台输出:30+40=70

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入mark的值: 0代表求和，1代表求差，2代表乘积，3代表求商，4代表求余数");
        int mark = sc.nextInt();
        while (mark < 0 || mark > 4) {
            if (mark >= 0 && mark <= 4) {
                break;
            } else {
                System.out.println("错误输入，请重新输入mark的值：");
                mark = sc.nextInt();
            }
        }
        System.out.println("请输入两个整型数num1,num2:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = 0, difference = 0, product = 0, remainder = 0, temp = 0;
        double quotient = 0;
        if (mark == 0) {
            System.out.println("您计算的是加法：");
            System.out.println("表达式及结果 ：" + num1 + "+" + num2 + "=" + (sum = getSum(num1, num2)));
        }

        if (mark == 1) {
            System.out.println("您计算的是减法：");
            System.out.println("表达式及结果 ：" + num1 + "-" + num2 + "=" + (difference = getDifference(num1, num2)));
        }

        if (mark == 2) {
            System.out.println("您计算的是乘法：");
            System.out.println("表达式及结果 ：" + num1 + "*" + num2 + "=" + (product = getProduct(+num1, num2)));
        }

        if (mark == 3) {
            System.out.println("您计算的是除法：");
            System.out.println("表达式及结果 ：" + num1 + "/" + num2 + "=" + (quotient = getQuotient(+num1, num2)));
        }

        if (mark == 4) {
            if (num2 > num1) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            System.out.println("您计算的是求余数：");
            System.out.println("表达式及结果 ：" + num1 + "%" + num2 + "=" + (remainder = getRemainder(+num1, num2)));
        }

    }

    public static int getSum(int num1, int num2) {
        return num1 + num2;
    }

    public static int getDifference(int num1, int num2) {
        return num1 - num2;
    }

    public static int getProduct(int num1, int num2) {
        return num1 * num2;
    }

    public static double getQuotient(int num1, int num2) {
        return num1 / (num2 + 0.0);
    }

    public static int getRemainder(int num1, int num2) {
        return num1 % num2;
    }
}
