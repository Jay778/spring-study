package com.spring.xml;

/**
 * Created by 94921 on 2019/2/25.
 */
public class Phone {
    private String pp;
    private int price;

    public Phone(String pp, int price) {
        this.pp = pp;
        this.price = price;
    }
    public Phone(){

    }

    public String getPp() {
        return pp;
    }

    public void setPp(String pp) {
        this.pp = pp;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "pp='" + pp + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.getPp();
        phone.getPrice();
    }
}
