package cn.itcast.Test_7_24_2;

//编写一个Java程序，定义一个String字符串"   ab123cd  "，首先去除字符串两端的空白，然后截取出字符串中的最后3个字符并在控制台输出。

public class Test03 {
    public static void main(String[] args) {
        String str1 = "   ab123cd  ";
        String str2 = str1.trim();
        System.out.println(str2);
        for (int i = str2.length()-3; i<str2.length(); i++) {
            char ch = str2.charAt(i);
            System.out.println(ch);
        }
    }
}
