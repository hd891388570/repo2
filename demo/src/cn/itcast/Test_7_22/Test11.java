package cn.itcast.Test_7_22;

//1.定义ArrayList集合，存入如下字符串：“abc”，“123”，“java”，“mysql”，“别跑啊”
//        2.遍历集合，将长度小于4的元素左边填充字符串0，并在控制台打印输出修改后集合中所有元素
//        输出结果格式如下：
//        [0abc,0123,java,mysql,0别跑啊

import java.util.ArrayList;

public class Test11 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("123");
        list.add("java");
        list.add("mysql");
        list.add("别跑啊");
        String str = new String();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length()<4){
                str =  "0" + list.get(i);
                list.set(i,str);
            }
        }
        System.out.println(list);
    }
}
