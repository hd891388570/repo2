package cn.itcast.Test_7_19;

import java.util.Scanner;

//模拟计算器:
//        定义三个整数类型变量num1,mark,num2
//        根据mark的值选择运算类型,
//        mark值为0,调用getSum方法,计算num1和num2的和并打印;
//        mark值为1,调用getDifference方法,计算num1和num2的差并打印;
//        mark值为2,调用getProduct 方法,计算num1和num2的乘积并打印;
//        mark值为3,调用getQuotient 方法,计算num1和num2的商并打印;
//        mark值为4,调用getRemainder 方法,计算num1和num2的余数并打印;
//        如果mark值大于4,则提示"没有这种计算方式"
//        打印格式如下:例如当mark值为0,num1值为1,num2值为2时打印:
//        您进行的计算为:加法
//        表达式及结果:1 + 2 = 3;

public class t01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入mark的值: 0代表求和，1代表求差，2代表乘积，3代表求商，4代表求余数");
        int mark = sc.nextInt();
        while (mark<0||mark>4) {
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
