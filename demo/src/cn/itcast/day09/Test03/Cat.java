package cn.itcast.day09.Test03;

//        3.定义猫类继承动物类
//        行为:eat(String something)方法,逮老鼠catchMouse方法(无参数)

public class Cat extends Animite {
    public void eat(String something){
        System.out.println("猫吃" + something);
    }
    public void catchMouse(){
        System.out.println("猫会逮老属。");
    }
}
