package cn.itcast.Test_7_20;

//定义一个方法,求出给定的数字在给定int型数组中出现的次数,如果一次没有出现则返回0。
//        如:给定数字3 求出3在数组 int[] arr = {3,4,3,5,7,9};中出现的次数

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        int[] arr = {3,4,3,5,7,9};
        System.out.println("请输入要判断的数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(),count = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == num)
                count++;
        System.out.println(num + "在数组中出项的次数是" + count + "次");
    }
}
