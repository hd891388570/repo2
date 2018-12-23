package cn.itcast.Test_7_22;

//(1)定义数组,存储如下数据:"hElLo1","wOrLd002","jAVA3","bEst!","loVe","enJoy#"
//        (2)定义方法,统计数组中大写,小写,数字字符的个数并进行打印,打印格式如下:
//        大写字符: 个
//        小写字符: 个
//        数字字符: 个
//        (3)定义方法,将字符串中包含数字的字符串替换成"*",并打印结果,打印格式如下:
//        替换前:["hElLo1","wOrLd002","jAVA3","bEst!","loVe","enJoy#"]
//        替换后:["*","*","*","bEst!","loVe","enJoy#"]
//        (4)定义方法,将字符串的小写转换成大写,大写转换成小写(用码表值转换,大写转小写+32,小写转大写-32),其他字符不变并打印结果,打印格式如下:
//        转换前:["*","*","*","bEst!","loVe","enJoy#"]
//        转换后:[*, *, *, BeST!, LOvE, ENjOY#]

import java.util.ArrayList;
import java.util.Arrays;
public class Test12 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hElLo1");
        list.add("wOrld002");
        list.add("JAVA3");
        list.add("bEst!");
        list.add("loVe");
        list.add("enJoy#");
        int big = 0,small = 0,num = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                if (list.get(i).charAt(j) >='A'&&list.get(i).charAt(j) <='Z')
                    big++;
                else if (list.get(i).charAt(j) >='a'&&list.get(i).charAt(j) <='z')
                    small++;
                else if (list.get(i).charAt(j) >='0'&&list.get(i).charAt(j) <='9')
                    num++;
            }
        }
        System.out.println("大写字符:" + big + ",小写字符：" + small + ",数字字符" + num);
        replace(list);
        maxAndmin(list);
    }
    public static void replace(ArrayList<String> list){
        String str = "*";
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                if (list.get(i).charAt(j) >='0'&&list.get(i).charAt(j) <='9'){
                    list.set(i,str);
                }
            }
        }
        System.out.println(list);
    }
    public static void maxAndmin(ArrayList<String> list){
        String str;
        for (int i = 0; i < list.size(); i++) {
            char[] chars = list.get(i).toCharArray();
            String result = "";
            for (int i1 = 0; i1 < chars.length; i1++) {
                char ch = chars[i1];
                if (ch>='a'&&ch<='z'){
                    ch -=32;
                    result+=ch;
                }else if (ch>='A'&&ch<='Z'){
                    ch +=32;
                    result+=ch;
                }else {
                    result+=ch;
                }
            }
            list.set(i,result);
        }
        System.out.println(list);
    }
}
