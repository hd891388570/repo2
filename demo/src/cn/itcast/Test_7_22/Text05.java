package cn.itcast.Test_7_22;

//将数字1-10保存到一个长度为10的一维数组中
//        定义一个新数组,长度为3,取出原来数组中随机三个元素(不考虑是否重复)
//        给新数组的元素赋值
//        求新数组所有元素的和

import java.util.Random;
import java.util.Scanner;

public class Text05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i+1;
        }
        int[] arr2 = new int[3];
        int index = 0,sum = 0;
        for (int i = 0; i < 3; i++) {
            index = r.nextInt(10);
            arr2[i] = arr[index];
            sum+=arr2[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.println("新数组所有元素之和：" + sum);
    }
}
