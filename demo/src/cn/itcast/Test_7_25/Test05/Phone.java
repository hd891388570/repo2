package cn.itcast.Test_7_25.Test05;

public abstract class Phone {
    private String name;

    public Phone() {
    }

    public Phone(String name) {
        this.name = name;
    }

    public abstract void playMusic(Song song);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
