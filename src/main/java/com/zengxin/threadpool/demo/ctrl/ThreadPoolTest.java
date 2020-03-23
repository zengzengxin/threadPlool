package com.zengxin.threadpool.demo.ctrl;

import com.zengxin.threadpool.demo.entity.Message;
import com.zengxin.threadpool.demo.task.MessageTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadPoolExecutor;

@RestController
@RequestMapping("sendMessage")
public class ThreadPoolTest {

    @Autowired
    ThreadPoolExecutor myThreadPool;

    private int messageNum = 1000;

    Message ms = new Message("消息头：","回家啊过的机会噶机会是快递");
    MessageTask msg = new MessageTask(ms);

    @GetMapping
    public String sendMessage(){
        for (int i = 0; i <messageNum ; i++) {
            myThreadPool.execute(msg);
        }
        return "消息推送成功";
    }
}
