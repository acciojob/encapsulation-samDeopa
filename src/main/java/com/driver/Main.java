package com.driver;
//java: name has private access in com.driver.RWOnly
public class Main {
    public static void main(String[] args) {
        RWOnly obj  = new RWOnly();
        obj.setName("Sameer");
        obj.getName();

    }
}