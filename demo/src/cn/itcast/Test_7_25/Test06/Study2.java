package cn.itcast.Test_7_25.Test06;

public interface Study2 {
    void studyLine(Line line);
    default void info(){
        stu1();
        stu2();
    }
    private void stu1(){
        System.out.println("好好学习，天天向上");
    }
    private void stu2(){
        System.out.println("键盘敲烂，月薪过万");
    }
}
