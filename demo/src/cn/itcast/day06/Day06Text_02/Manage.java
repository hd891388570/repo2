package cn.itcast.day06.Day06Text_02;

public class Manage {
    private String name;
    private int id;
    private double salary;
    private double bonus;

    public Manage() {
    }

    public Manage(String name, int id, double salary, double bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }
    public void work() {
        System.out.println("正在努力的做着管理工作，分配任务，检查员工提交上来的代码.....");
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
