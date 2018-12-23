package cn.itcast.Test_7_25.Test06;

public class Line {
    private String basicClass;
    private String emplymentClass;

    public Line() {
    }

    public Line(String basicClass, String emplymentClass) {
        this.basicClass = basicClass;
        this.emplymentClass = emplymentClass;
    }
    void printLine(){
        System.out.println("学习路线，基础班学习：" + basicClass + ",就业班学习：" + emplymentClass);
    }

    public String getBasicClass() {
        return basicClass;
    }

    public void setBasicClass(String basicClass) {
        this.basicClass = basicClass;
    }

    public String getEmplymentClass() {
        return emplymentClass;
    }

    public void setEmplymentClass(String emplymentClass) {
        this.emplymentClass = emplymentClass;
    }
}
