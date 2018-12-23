package cn.itcast.day09.Test01;

//根据人类，创建一个工人类Worker
//        增加属性：
//        单位unit、工龄workAge；
//        重写工作方法（工人的工作是盖房子）

public class Worker extends Person {
    String unit;
    int workAge;

    public Worker() {
    }

    public Worker(String name, String gender, int age, String nationality, String unit, int workAge) {
        super(name, gender, age, nationality);
        this.unit = unit;
        this.workAge = workAge;
    }

    @Override
    public void work() {
        System.out.println("工人的工作是盖房子!");
    }

}
