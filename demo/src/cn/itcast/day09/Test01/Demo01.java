package cn.itcast.day09.Test01;

public class Demo01 {
    public static void main(String[] args) {
        Worker worker = new Worker("工人","男",22,"中国","建筑单位",5);
        Student student = new Student("学生","男",16,"中国","黑马",0001);
        StudentLeader s1 = new StudentLeader("学生生干部","女",16,"中国","黑马",0002,"班长");
        student.work();
        worker.work();
        s1.work();
    }
}
