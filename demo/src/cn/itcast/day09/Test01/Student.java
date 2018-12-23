package cn.itcast.day09.Test01;

//根据人类，创建一个学生类Student
//        增加属性：
//        学校school、学号stuNumber；
//        重写工作方法（学生的工作是学习）。

public class Student extends Person {
    String school;
    int stuNumber;

    public Student() {
    }

    public Student(String name, String gender, int age, String nationality, String school, int stuNumber) {
        super(name, gender, age, nationality);
        this.school = school;
        this.stuNumber = stuNumber;
    }

    @Override
    public void work() {
        System.out.println("学生需要学习！");
    }
}
