package cn.itcast.day11;

interface Inter{
    void show();
}

class Outer{
   public static Inter method(){
       Inter in = new Inter() {
           @Override
           public void show() {
               System.out.println("HelloWord");
           }
       };
       return in;
   }
}

public class Test01 {
    public static void main(String[] args) {
        Outer.method().show();
    }
}
