package com.zengxin.threadpool.demo.entity;

public class Message {
    private String Tittle;

    private String Body;

    public String getTittle() {
        return Tittle;
    }

    public void setTittle(String tittle) {
        Tittle = tittle;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }

    public Message(String tittle, String body) {
        Tittle = tittle;
        Body = body;
    }
}
