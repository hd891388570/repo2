package cn.itcast.Test_7_25.Test06;

public class Test6 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setAge(18);
        stu.setName("胡章顺");
        Study2 sy = new Study2() {
            @Override
            public void studyLine(Line line) {
                line.printLine();
            }
        };
        stu.studying(sy);
    }
}
