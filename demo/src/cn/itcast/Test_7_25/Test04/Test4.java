package cn.itcast.Test_7_25.Test04;

public class Test4 {
    public static void main(String[] args) {
        Person per = new Person("张三" , 14);
        Study study = new Study() {
            @Override
            public void studyPlan(Plan p) {
                    p.printPlan();
            }
        };
        per.startStudy(study);
    }
}
