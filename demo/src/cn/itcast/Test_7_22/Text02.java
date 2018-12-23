package cn.itcast.Test_7_22;

//分析以下需求，并用代码实现
//        1.提示用户输入10个整数，存入到int数组中；根据以下要求实现相关功能
//        2.提示用户输入一个数字作为数组索引，查找数组中该索引对应的元素，
//        （需要判断输入的数字是否在0-9之间包含临界值，如果该数字不符合要求则随机生成一个符合要求的索引）
//        3.将2中得到的索引对应的元素的左右两边元素进行互换，若对应的元素是第一个或最后一个则不做任何操作

import java.util.Random;
import java.util.Scanner;

public class Text02 {
    public static void main(String[] args) {
        System.out.println("请输入十个整数：");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("请输入数组索引，查找对应数字：");
        int index = sc.nextInt();
        if (index<0||index>9){
            System.out.print("您输入的数字超出索引，以为您随机生成：");
            index = r.nextInt(10);
            System.out.println(index);
        }
        System.out.println("您的索引对应的数组元素：" + arr[index]);
        int temp;
        if (index == 0 || index == 9 );
        else {
            temp = arr[index - 1];
            arr[index - 1] = arr[index + 1];
            arr[index + 1] = temp;
        }
        System.out.println("变换后的数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
