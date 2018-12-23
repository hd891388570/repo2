package cn.itcast.day07;

//1.创建一个ArrayList集合，用于存储一些字符串："abc","def","def","ghi","def","hij","jkol"
//2.遍历集合，统计集合中"def"字符串一共出现了多少个
//3.将集合中的所有"def"字符串删除。打印删除后的集合元素

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("def");
        list.add("ghi");
        list.add("def");
        list.add("hij");
        list.add("jkol");
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == "def"){
                count++;
                list.remove(i);
                i--;
            }
        }
        System.out.println("def出现次数" + count);
        System.out.println(list);
    }
}
