package cn.itcast.Test_7_22;

//一、需求说明：创建三个图书类对象，找出价格最高的图书并打印该图书的所有信息。
//        二、设计“图书类”Book，要求有以下属性：
//        图书编号：
//        书名：
//        价格：

public class Book {
    private int num ;
    private String name;
    private int price;

    public Book() {
    }

    public Book(int num, String name, int price) {
        this.num = num;
        this.name = name;
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
