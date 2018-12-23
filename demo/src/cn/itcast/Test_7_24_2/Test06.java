package cn.itcast.Test_7_24_2;

//1、编写一个无返回值，参数为String类型的方法，实现以下功能：
//        a.将传入的字符串中的大写字母变成小写字母，小写字母变成大写字母，其余字符不变。并且统计转换了多少次（大小写转换总和）
//        b.在控制台打印输出转换后的字符串以及转换总次数
//        2、在main方法中键盘录入一个字符串，并将该字符串传入上述方法中，调用测试。

import java.util.Arrays;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        System.out.println("请输入一串字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = run(str);
        System.out.println(str);
    }

    public static String run(String str) {
        String str2 = "";
        char[] arr = new char[str.length()];
        arr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] += 32;
                count++;
            } else if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] -= 32;
                count++;
            } else ;
        }
        str = Arrays.toString(arr);
        return str;
    }
}
