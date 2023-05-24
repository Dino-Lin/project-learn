package com.dino;

public class VolatileVisableTest {
    public static volatile boolean flag = false;
    //public static  boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() ->{

            System.out.println("waiting data ..");
            while (!flag){

            }
            System.out.println("success");
        }).start();

        Thread.sleep(500);
        new Thread(()->prepareData()).start();

    }

    public static void prepareData(){
        System.out.println("prepare data..");
        flag = true;
        System.out.println("prepare data end..");
    }
}
