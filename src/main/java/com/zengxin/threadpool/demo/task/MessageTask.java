package com.zengxin.threadpool.demo.task;

import com.zengxin.threadpool.demo.entity.Message;

public class MessageTask implements Runnable{
    private Message message;

    private int ticket = 1000;

    public MessageTask(Message msg){
        this.message = msg;
    }

    public void run(){
        System.out.println(ticket--);
    }

}
