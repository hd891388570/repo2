package cn.itcast.Test_7_24_2;

import java.util.Random;
import java.util.Scanner;

public class Test09 {
    int found(String str){
        int count = 0;
        Random r = new Random();
        char c= str.charAt(r.nextInt(str.length()));
        System.out.println(c);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("请输入一串字符串");
        String str = sc.next();
        int count = new Test09().found(str);
        System.out.println(count);
    }
}
