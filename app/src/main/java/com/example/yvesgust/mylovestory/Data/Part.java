package com.example.yvesgust.mylovestory.Data;

public class Part {

    public static Part[] book={
            new Part("1","aaaaa", 2, 3),
            new Part("2","bbbbb",3,4)
    };

    String name;
    String content;
    int yesChapterId;
    int noChapterId;

    public Part(String name, String content, int yesChapterId, int noChapterId) {
        this.name = name;
        this.content = content;
        this.yesChapterId = yesChapterId;
        this.noChapterId = noChapterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getYesChapterId() {
        return yesChapterId;
    }

    public void setYesChapterId(int yesChapterId) {
        this.yesChapterId = yesChapterId;
    }

    public int getNoChapterId() {
        return noChapterId;
    }

    public void setNoChapterId(int noChapterId) {
        this.noChapterId = noChapterId;
    }
}
