package cn.itcast.Test_7_24_2;

//字符串数组strs中包含字符串{"12","345","6789","1","123","4567"} ，创建2个ArrayList集合 ，分别存放strs数组中字符串长度为偶数的元素和字符串长度为奇数的元素 ，最终将这两个集合在控制台打印输出 ：
//        打印格式如下：
//        偶数长度字符串[12,6789,4567]
//        奇数长度字符串[345,1,123]

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        String[] arr = new String[]{"12","345","6789","1","123","4567"};
        ArrayList<String> listou = new ArrayList<>();
        ArrayList<String> listji = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()%2==0)
                listou.add(arr[i]);
            else
                listji.add(arr[i]);
        }
        System.out.println("偶数长度字符串"+ listou);
        System.out.println("奇数长度字符串" + listji);
    }
}
