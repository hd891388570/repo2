package cn.itcast.day09.Test02;

//属性：
//        姓名 工号 工资 奖金
//        行为：
//        工作work

public class Worker {
    private String name;
    private int worknum;
    private int salary;
    private int money;

    public Worker() {
    }

    public Worker(String name, int worknum, int salary, int money) {
        this.name = name;
        this.worknum = worknum;
        this.salary = salary;
        this.money = money;
    }

    public void work(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorknum() {
        return worknum;
    }

    public void setWorknum(int worknum) {
        this.worknum = worknum;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
