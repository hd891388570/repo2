package cn.itcast.day08.Test03;

public class Demo03 {
    public static void main(String[] args) {
        Phone ph1 = new Phone();
        Phone ph2 = new Phone();
        ph1.setBrand("三星");
        ph1.setPrice("5000元");
        ph2.setBrand("苹果");
        ph2.setPrice("10000");
        System.out.println(ph1.getBrand()+"手机:" + ph1.getPrice() +"\t" + "手机尺寸 ：" + Phone.size);
        System.out.println(ph2.getBrand()+"手机:" + ph2.getPrice() + "\t" +"手机尺寸 ：" + Phone.size);

    }
}
