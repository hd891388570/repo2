package cn.itcast.Test_7_25.Test05;

public class Song {
    String singer;
    String name;

    public Song() {
    }

    public Song(String singer, String name) {
        this.singer = singer;
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
