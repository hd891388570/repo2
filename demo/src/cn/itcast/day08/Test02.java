package cn.itcast.day08;

import java.util.Arrays;
import java.util.Random;

//定义String getStr()方法
//功能描述：
//获取长度为5的随机字符串
//字符串由随机的4个大写英文字母和1个0-9之间(包含0和9)的整数组成
//英文字母和数字的顺序是随机的
public class Test02 {
    public static void main(String[] args) {
        String str = "";

        str = new Test02().getStr2();
        System.out.println(str);
    }


//    此方法有bug，第一位数字概率1/2，第二位1/4，依次类推最后一位1/32
//    public  String getStr(){
//        char[] array = new char[5];
//        Random r = new Random();
//        String s = "ABCDEFGHIJKLMNOPQISTUVWXYZ";
//        String s2 = "0123456789";
//        int count = 0 ,flag = 1;
//
//        for (int i = 0; i < 5; i++) {
//            int t = r.nextInt(2);
//            if( (t == 1 || flag == 0) && count<=4 ){
//                array[i] = s.charAt(r.nextInt(25));
//                count++;
//            }
//            if(t == 0 && flag == 1){
//                array[i] = s2.charAt(r.nextInt(10));
//                flag = 0;
//            }
//        }
//        String str = Arrays.toString(array);
//        return str;
//    }

    public String getStr2(){
        char[] array = new char[5];
        Random r = new Random();
        String s = "ABCDEFGHIJKLMNOPQISTUVWXYZ";
        String s2 = "0123456789";
        for (int i = 0; i < array.length; i++) {
            array[i] = s.charAt(r.nextInt(25));
        }
        int index = r.nextInt(5);
        array[index] = s2.charAt(r.nextInt(10));
        String str = Arrays.toString(array);
        return str;
    }
}
