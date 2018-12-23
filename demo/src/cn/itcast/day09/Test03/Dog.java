package cn.itcast.day09.Test03;

//2.定义狗类继承动物类
//        行为:
//        eat(String something)方法,看家lookHome方法(无参数)

public class Dog extends Animite{
    public void eat(String something){
        System.out.println("狗吃" + something);
    }
    public void lookHome(){
        System.out.println("狗看家。");
    }
}
