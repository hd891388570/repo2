package cn.itcast.Test_7_22;

//一、需求说明：创建三个图书类对象，找出价格最高的图书并打印该图书的所有信息。
//        二、设计“图书类”Book，要求有以下属性：
//        图书编号：
//        书名：
//        价格：

public class Test06 {
    public static void main(String[] args) {
        Book b1 = new Book(1,"JAVA",100);
        Book b2 = new Book(2,"C",90);
        Book b3 = new Book(3,"C++",80);
        Book[] box = new Book[3];
        box[0] = b1;
        box[1] = b2;
        box[2] = b3;
        int k = 0;
        int max = box[0].getPrice();
        for (int i = 1; i < box.length; i++) {
            if (box[i].getPrice() > max){
                max = box[i].getPrice();
                k = i;
            }

        }
        System.out.println("价格最高的图书信息：" + box[k].getNum() + " " + box[k].getName() + " " +box[k].getPrice());
    }
}
