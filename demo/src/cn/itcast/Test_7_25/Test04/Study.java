package cn.itcast.Test_7_25.Test04;
interface Study {
    void studyPlan(Plan p);
    public default void studyHard(){
        readBook();
        doTest();
    }
    private void readBook(){
        System.out.println("多读书,多看报,少吃零食多睡觉");
    }
    private void doTest(){
        System.out.println("键盘敲烂,先赚他一个亿");
    }
}
