package cn.itcast.Test_7_24_2;

//获取键盘录入的字符串str ，随机从字符串str中获取5次字符 ，1次获取1个字符 ，将获取的5个字符拼接成新字符串 ，
// 如新字符串中有小写字符，将小写字符转换成大写字符 ，在控制台打印输出最终的新字符串

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String str = sc.next();
        char[] ch = new char[5];
        int index = 0;
        for (int i = 0; i < 5; i++) {
            ch[i] = str.charAt(r.nextInt(str.length()));
            if (ch[i]>'a'&&ch[i]<'z')
                ch[i]-=32;
        }
        String str2 = Arrays.toString(ch);
        System.out.println(str2);
    }
}
