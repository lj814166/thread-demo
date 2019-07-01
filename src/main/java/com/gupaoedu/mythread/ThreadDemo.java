package com.gupaoedu.mythread;

class MyThread extends Thread {
    private int ticket = 15;

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("iiiii = " + i);
            if (ticket > 0) {
                System.out.println("i = " + i);
                System.out.println("ticket = " + ticket--);
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
    }
}