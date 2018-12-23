package cn.itcast.day06.Day06Text_02;


public class Coder {
    private String name;
    private int id;
    private double salary;

    public Coder() {
    }

    public Coder(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void work(){
        System.out.println("正在努力的写着代码......");
    }
    public void setName(String namne) {
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
}
