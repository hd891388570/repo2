package cn.itcast.Test_7_22;

//一、需求说明：请用户输入一个“QQ号码”，我们来判断这个QQ号码是否正确。
//        要求：使用方法来完成判断功能。

import java.util.Random;
import java.util.Scanner;

public class Text07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("请输入一个QQ号码:");
        String qq = sc.next();
        boolean t = istrue(qq);
        if (t == true)
            System.out.println("正确的QQ号。");
        else
            System.out.println("错误的QQ号。");
    }

    private static boolean istrue(String qq) {
        boolean b = true;
        if (qq.length() > 13)
            b = false;
        else if (qq.length() > 0) {
            for (int i = 0; i < qq.length(); i++) {
                if (qq.charAt(i) > 57 || qq.charAt(i) < 48)
                    b = false;
            }
        } else if (qq.length() <= 0)
            b = false;
        else
            b = true;
        return b;
    }
}
