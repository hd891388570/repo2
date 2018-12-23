package cn.itcast.Test_7_25.Test01;

public class Man extends Person implements Speak{
    @Override
    public void eat() {
        System.out.println("大口吃");
    }

    @Override
    public void speak(String language) {
        System.out.println("第二语言" + language);
    }
}
