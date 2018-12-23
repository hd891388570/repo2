package cn.itcast.day07;

import java.util.Random;
import java.util.Scanner;

//1.通过键盘录入一个数字，作为数组的长度
//2.根据录入的数字，创建一个长度为该数字的数组
//3.通过随机数为数组中的每个元素进行赋值。随机数的范围在1-100之间
//4.求出数组中最大数字
//5.求出数组中的数字平均值

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int[] array = new int[width];
        Random r = new Random();
        for (int i = 0; i < width; i++) {
            array[i] = r.nextInt(100) + 1;
        }
        for (int i = 0; i < width; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = array[0];
        double var = 0,sum =0;
        for (int i = 0; i < width; i++) {
            if(array[i] > max)
                max = array[i];
                sum += array[i];
        }
        var = sum /(width + 0.0);
        System.out.println("最大数字是" + max + "平均值是" + var);
    }
}
