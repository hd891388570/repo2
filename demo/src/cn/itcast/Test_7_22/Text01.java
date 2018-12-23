package cn.itcast.Test_7_22;

//随机产生5个范围是[1,100]的整数,把这些数字中所有个位或十位为3的数字打印出来

import java.util.Random;

public class Text01 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("个位或者十位是3的数有：");
        for (int i = 0; i < arr.length; i++) {
            int ge = arr[i] % 10;
            int shi = arr[i] / 10;
            if (ge == 3 || shi == 3) {
                System.out.println(arr[i]);
            }
        }

    }
}
