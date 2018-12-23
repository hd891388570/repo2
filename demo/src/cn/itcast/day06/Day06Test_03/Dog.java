package cn.itcast.day06.Day06Test_03;


public class Dog {
    String color, breed;

    public Dog() {
    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public void eat() {
        System.out.println("正在啃骨头....");
    }

    public void lookHome() {
        System.out.println("正在看家....");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    ;

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }
}
