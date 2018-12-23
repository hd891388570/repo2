package cn.itcast.Test_7_19;

//1.定义长度为100的整数类型数组,并对数组进行赋值1-100之间的整数数据(包括1和100),
//        2.定义方法,传递数组,将数组中元素能同时被3和5整除的存入到新数组中,并将新数组返回
//        3.定义方法,传递数组及一个整数数据,判断该数据在数组中是否存在,如果存在,则打印该元素在数组中出现的位置,
//        如果不存在则提示"不存在"
//        4.定义print方法,打印传递的数组内的元素,打印格式如下:数组元素:[元素1,元素2,元素3...]

import java.util.Scanner;

public class t03 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        int[] array1 = run(array);
        System.out.println("能被3或5整除的数：");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        run2(array, temp);
        print(array);
    }

    public static int[] run(int[] array) {
        int count = 0, j = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }
        int[] array1 = new int[count];
        for (int i = 0; i < 100; i++) {
            if (array[i] % 3 == 0 && array[i] % 5 == 0) {
                array1[j] = array[i];
                j++;
            }
        }
        return array1;
    }

    public static void run2(int[] array, int temp) {
        int i = 0;
        for (i = 0; i < 100; i++) {
            if (temp == array[i]) {
                System.out.println("在数组中位置是：第" + (i + 1) + "位");
                return;
            }
        }
        if (i == 100)
            System.out.println("不存在！！");
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
                break;
            }else
                System.out.print(array[i] + ",");
        }
    }
}
