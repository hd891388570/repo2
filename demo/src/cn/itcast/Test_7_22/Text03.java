package cn.itcast.Test_7_22;

//分析以下需求，并用代码实现
//        1.键盘录入班级人数
//        2.根据录入的班级人数创建数组
//        3.利用随机数产生0-100的成绩(包含0和100)
//        4.要求:
//        (1)打印该班级的不及格人数
//        (2)打印该班级的平均分
//        (3)演示格式如下:
//        请输入班级人数:
//        键盘录入:100
//        控制台输出:
//        不及格人数:19
//        班级平均分:87


import java.util.Random;
import java.util.Scanner;

public class Text03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("请输入班级人数：");
        int count = 0 ,sum = 0;
        double avg = 0;
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = r.nextInt(101);
            sum+=arr[i];
            if (arr[i] < 60)
                count++;
        }
        avg = sum / (num + 0.0);
        System.out.println("不及格人数：" + count);
        System.out.println("班级平均分：" + avg);
    }
}
