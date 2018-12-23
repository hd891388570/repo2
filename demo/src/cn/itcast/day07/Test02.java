package cn.itcast.day07;

//1.创建一个ArrayList集合，用于存储一些字符串
//2.通过键盘录入5个字符串，保存到集合中
//3.遍历集合,打印每一个字符串

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(sc.next());
        }

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
