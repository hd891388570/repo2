package cn.itcast.Test_7_25.Test02;

public class Feeder {
    public void feed(Animal a){
        if (a instanceof Cat){
            a.sleep();
            ((Cat) a).catchMouse();
        }else if (a instanceof Duck){
            a.sleep();
            ((Duck) a).fly(new fly() {
                @Override
                public void flyInSky() {
                    System.out.println("大鹏展翅");
                }
            });
        }
    }
}
