package cn.itcast.day09.Test01;

//根据学生类，创建一个学生干部类 StudentLeader
//        增加属性：
//        职务job；
//        增加方法：开会meeting。

public class StudentLeader extends Student{
    String job;

    public StudentLeader() {
    }

    public StudentLeader(String name, String gender, int age, String nationality, String school, int stuNumber, String job) {
        super(name, gender, age, nationality, school, stuNumber);
        this.job = job;
    }

    public void  meeting(){
        System.out.println("学生干部喜欢开会。");
    }
}
