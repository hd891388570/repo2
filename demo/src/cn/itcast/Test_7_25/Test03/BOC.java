package cn.itcast.Test_7_25.Test03;

public class BOC extends Bank implements Loans {
    public BOC() {
    }

    public BOC(String bankName) {
        super(bankName);
    }

    @Override
    public void bankCustomer(Person person) {
        System.out.println(person.getName() + "使用的是" + getBankName() +"的贷款");
    }

    @Override
    public void sendLoans() {
        System.out.println(getBankName() + "可以发放贷款");
    }
}
