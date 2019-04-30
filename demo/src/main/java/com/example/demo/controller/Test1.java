package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
//        new Thread(()-> System.out.println("这个是一个线程")).start();
//        System.out.println("......................");
//        new Thread(()->{for (int i = 0; i < 10; i++) {
//            System.out.println("这个是2个线程");
//        }
//        } ).start();

        List list = new ArrayList();
        list.add("123");
        list.add("843");
        list.stream().forEach((s)-> {System.out.println(s);});

    }
}
