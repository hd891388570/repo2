package cn.itcast.Test_7_22;

//键盘录入一个整数，创建一个该长度的数组，为每一个元素赋值为1-10的随机整数，最后打印数组中所有值大于5且为偶数的元素.

import java.util.Random;
import java.util.Scanner;

public class Text04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("请设置数组长度：");
        int lenth = sc.nextInt();
        int[] arr = new int[lenth];
        for (int i = 0; i < lenth; i++) {
            arr[i] = r.nextInt(10) + 1;
        }
        System.out.println("大于5且为偶数的：");
        for (int i = 0; i < lenth; i++) {
            if (arr[i] > 5 && arr[i] % 2 == 0)
                System.out.print(arr[i] + " ");
        }
    }
}
