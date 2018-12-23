package cn.itcast.Test_7_25.Test06;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void studying(Study2 sy){
        sy = new Study2() {
            @Override
            public void studyLine(Line line) {

            }
        };
        System.out.println(name + "学习中");
        Line line = new Line("基础知识","项目知识");
        sy.info();
        line.printLine();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

