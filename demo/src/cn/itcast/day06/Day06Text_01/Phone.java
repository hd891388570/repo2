package cn.itcast.day06.Day06Text_01;

public class Phone {
    private String brand;
    private double price;

    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void call() {
        System.out.println("打电话...");
    }

    public void sendMessage() {
        System.out.println("发短信...");
    }

    public void playGame() {
        System.out.println("玩游戏...");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Phone p = new Phone();
        p.setBrand("小米");
        p.setPrice(998);
        System.out.print("正在使用价格为" + p.getPrice() + "元的" + p.getBrand() + "品牌的手机");
        p.call();
        System.out.print("正在使用价格为" + p.getPrice() + "元的" + p.getBrand() + "品牌的手机");
        p.sendMessage();
        System.out.print("正在使用价格为" + p.getPrice() + "元的" + p.getBrand() + "品牌的手机");
        p.playGame();
        System.out.println("=====================");
        Phone p2 = new Phone("大米", 998);
        System.out.print("正在使用价格为" + p2.getPrice() + "元的" + p2.getBrand() + "品牌的手机");
        p2.call();
        System.out.print("正在使用价格为" + p2.getPrice() + "元的" + p2.getBrand() + "品牌的手机");
        p2.sendMessage();
        System.out.print("正在使用价格为" + p2.getPrice() + "元的" + p2.getBrand() + "品牌的手机");
        p2.playGame();
    }
}
