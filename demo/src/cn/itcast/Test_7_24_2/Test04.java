package cn.itcast.Test_7_24_2;

//1.定义ArrayList集合，存入如下字符串：“abc”，“123”，“java”，“mysql”，“别跑啊”
//        2.遍历集合，将长度小于4的元素左边填充字符串0，并在控制台打印输出修改后集合中所有元素
//        输出结果格式如下：
//        [0abc,0123,java,mysql,0别跑啊]

import java.util.ArrayList;

public class Test04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abc");
        list.add("abc");
        list.add("abc");
        list.add("abc");
    }
}
