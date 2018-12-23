package cn.itcast.day06.Day06Text_02;


public class Test02 {
    public static void main(String[] args) {
        Manage m = new Manage();
        Coder c = new Coder();
        m.setName("项目经理");
        m.setId(123);
        m.setBonus(6000);
        m.setSalary(15000);
        c.setName("程序员");
        c.setId(135);
        c.setSalary(10000);
        System.out.print("工号为" + m.getId() + "基本工资为" + m.getSalary() + "奖金为" + m.getSalary() + "的" + m.getName());
        m.work();
        System.out.print("工号为" + c.getId() + "基本工资为" + c.getSalary() + c.getName());
        c.work();
        System.out.println("====================");
        Manage m2 = new Manage("顺", 111, 15000, 6000);
        Coder c2 = new Coder("顺", 121, 10000);
        System.out.print("工号为" + m2.getId() + "基本工资为" + m2.getSalary() + "奖金为" + m2.getSalary() + "的" + m2.getName());
        m.work();
        System.out.print("工号为" + c2.getId() + "基本工资为" + c2.getSalary() + c2.getName());
        c2.work();
    }
}
