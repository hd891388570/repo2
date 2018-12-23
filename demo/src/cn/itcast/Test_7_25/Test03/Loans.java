package cn.itcast.Test_7_25.Test03;

public interface Loans {
    void sendLoans();
    public default void check(){
        System.out.println("查询征信");
    }
}
