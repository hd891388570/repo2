package cn.itcast.day08;

import java.util.Scanner;

//1.键盘录入一个大字符串,再录入一个小字符串
//        2.统计小字符串在大字符串中出现的次数
//        3.代码运行打印格式:
//        请输入大字符串:woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma
//        请输入小字符串:heima
//
//        控制台输出:共出现3次
public class Test01 {
    public static void main(String[] args) {
//
        String s1 = "woaiheimaheimaaiwo,wulunheimahaishibaima";
        String s2 = "heima";
        int i = 0 , count = 0;
        while ((i = s1.indexOf(s2)) >= 0) {
            count++;
            s1 = s1.substring(i + s2.length() - 1);
        }
        System.out.println("共出现" + count + "次");
    }
}
