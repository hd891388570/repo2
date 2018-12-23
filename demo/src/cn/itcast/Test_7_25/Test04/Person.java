package cn.itcast.Test_7_25.Test04;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void startStudy(Study study){
        Plan p = new Plan("语文","习题");
        System.out.println(name + "开始学习");
        study.studyHard();
        study.studyPlan(p);
    }
}
