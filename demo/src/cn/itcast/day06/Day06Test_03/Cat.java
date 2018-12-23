package cn.itcast.day06.Day06Test_03;


public class Cat {
    private String color, breed;

    public Cat() {
    }

    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public void eat() {
        System.out.println("正在吃鱼.....");
    }

    public void catchMouse() {
        System.out.println("正在逮老鼠.....");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }
}
