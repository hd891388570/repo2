package cn.itcast.Test_7_25.Test04;

public class Plan {
    private String read;
    private String test;

    public Plan() {
    }

    public Plan(String read, String test) {
        this.read = read;
        this.test = test;
    }

    public void printPlan(){
        System.out.println("当次学习计划，阅读:" + read + ",练习：" + test );
    }

    public String getRead() {
        return read;
    }

    public void setRead(String read) {
        this.read = read;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
