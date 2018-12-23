package cn.itcast.Test_7_20;

//分析以下需求，并用代码实现：
//        1.根据工龄(整数)给员工涨工资(整数),工龄和基本工资自定义
//        2.涨工资的条件如下：
//        [10-15)     +5000
//        [5-10)      +2500
//        [3~5)       +1000
//        [1~3)       +500
//        [0~1)       +200
//        3.如果自定义的工龄为10，基本工资为3000，程序运行后打印格式"您目前工作了10年，基本工资为 3000元, 应涨工资 5000元,涨后工资 8000元"

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        System.out.println("请输入工龄：");
        Scanner sc = new Scanner(System.in);
        int workage = sc.nextInt();
        if (workage > 15)
            System.out.println("输入有误。");
        else {
            int more =0;
            System.out.println("请输入基本工资：");
            int salary = sc.nextInt();
            if (salary==0)
                more = 200 ;
            else if (salary>=1&&salary<3)
                more = 500;
            else if(salary>=3&&salary<5)
                more = 1000;
            else if (salary>=5&&salary<10)
                more = 2500;
            else
                more = 5000;
            System.out.println("您目前工作了：" + workage + "年," + "基本工资为" + salary + "元," + "应涨工资" + more + "元，" + "张后工资" + (salary + more) + "元");
        }
    }
}
