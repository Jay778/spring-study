package com.spring.xml;

/**
 * Created by 94921 on 2019/3/4.
 */
public class MessagePrinter {
    final private  MessageService service;
    public MessagePrinter(MessageService service){
        this.service=service;
    }
    public void printMessage(){
        System.out.print(this.service.getMessage());
    }
}
