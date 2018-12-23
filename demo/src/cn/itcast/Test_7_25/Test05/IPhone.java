package cn.itcast.Test_7_25.Test05;

public class IPhone extends Phone implements Bluetooth {
    @Override
    public void btFunction() {
        System.out.println("支持蓝牙功能");
    }

    @Override
    public void playMusic(Song song) {
        System.out.println(getName() + "的手机" + "正在播放" +song.singer + "唱的" + song.name);
    }
}
