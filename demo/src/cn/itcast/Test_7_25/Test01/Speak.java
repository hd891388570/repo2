package cn.itcast.Test_7_25.Test01;

public interface Speak {
    String language = "中文";
    public abstract void speak(String language);
    public default void speakM(){
        System.out.println("母语" + language);
    }
}
