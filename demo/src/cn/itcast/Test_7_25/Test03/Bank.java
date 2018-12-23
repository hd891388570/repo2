package cn.itcast.Test_7_25.Test03;

public abstract class Bank {
    private String bankName ;

    public Bank() {
    }

    public Bank(String bankName) {
        this.bankName = bankName;
    }
    public abstract void bankCustomer(Person person);

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
