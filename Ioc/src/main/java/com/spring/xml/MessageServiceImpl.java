package com.spring.xml;

/**
 * Created by 94921 on 2019/3/4.
 */
public class MessageServiceImpl implements MessageService {
    private String name;
    private int age;

    public MessageServiceImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getMessage(){
        return "Hello!"+name+",age is"+age;
    }
}
