package com.gupaoedu.mythread;

public class PendingInterrupt extends Object {
    public static void main(String[] args) {
//如果输入了参数，则在mian线程中中断当前线程（亦即main线程）
        if (args.length > 0) {
            Thread.currentThread().interrupt();
        }
        System.out.println( Thread.currentThread().isInterrupted());
        Thread.currentThread().interrupt();
        System.out.println( Thread.currentThread().isInterrupted());
        System.out.println(Thread.interrupted());
        System.out.println(Thread.interrupted());
//获取当前时间
        long startTime = System.currentTimeMillis();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        try {
            Thread.sleep(2000);
            System.out.println("was NOT interrupted");
        } catch (InterruptedException x) {
            System.out.println("was interrupted");
        }
//计算中间代码执行的时间
        System.out.println("elapsedTime=" + (System.currentTimeMillis() - startTime));
    }
}