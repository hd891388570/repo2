package cn.itcast.day09.Test02;

import com.itheima.demo.demo_day09.Maneger;

public class Demo02 {
    public static void main(String[] args) {
        Manager m = new Manager();
        Chenxu c = new Chenxu();
        c.setName("大盘鸡");
        c.setMoney(10000);
        c.setSalary(15000);
        c.setWorknum(1);
        m.setName("AK47");
        m.setMoney(11000);
        m.setSalary(16000);
        m.setWorknum(2);
        System.out.print(c.getName() + "是程序员" + "，工号为" + c.getWorknum() + "，薪水和奖金分别为：" + c.getSalary() +","+ c.getMoney() + " ");
        c.work();
        System.out.print(m.getName() + "是项目经理" + "，工号为" + m.getWorknum() + "，薪水和奖金分别为：" + m.getSalary() +","+ m.getMoney() + " ");
        m.work();
    }
}
