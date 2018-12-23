package cn.itcast.Test_7_25.Test05;

public class Test5 {
    public static void main(String[] args) {
        IPhone phone = new IPhone();
       Song s = new Song("简弘亦","你就不要想起我");
       phone.setName("胡章顺");
       phone.btFunction();
       phone.connecting();;
       phone.playMusic(s);
    }
}
