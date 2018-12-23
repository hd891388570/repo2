package cn.itcast.Test_7_25.Test03;

public class Test3 {
    public static void main(String[] args) {
        BOC bank = new BOC("中国银行");
        Person p = new Person("张三");
        bank.sendLoans();
        bank.check();
        bank.bankCustomer(p);
    }
}
