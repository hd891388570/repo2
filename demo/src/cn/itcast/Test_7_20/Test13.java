package cn.itcast.Test_7_20;

//定义一个方法，查找指定数字在数组中出现的位置(若出现多次，多次打印)
//        如: 数组[1232]要查找的数是2 则方法内部会打印索引值 1 ,3
//        数组[1232] 要查找的数是5 则会打印 “数组中没有这个数字”

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2 };
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查找的数字：");
        int num = sc.nextInt();
        index(arr, num);
    }

    public static void index(int[] arr, int num) {
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){
                System.out.print(i + " ");
                flag = 1;
            }
        }
        if (flag == 0)
            System.out.println("数组中没有这个数字。");
    }
}
