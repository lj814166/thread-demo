package com.gupaoedu.other;

class SingleTon {
    private static SingleTon singleTon = new SingleTon(8);
    public static int count1;
    public  int count2 = 0;

    public  SingleTon() {
        count1++;
        count2++;

    }
    public  SingleTon(int b) {
        count1=count1+b;
        count2=count2+b;

    }


    public static SingleTon getInstance() {
        return singleTon;
    }
}

public class Test {
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        System.out.println(" getInstan cecount1=" + singleTon.count1);
        System.out.println("getInstance count2=" + singleTon.count2);


        SingleTon singleTonv = new SingleTon();
        System.out.println("count1=" + singleTon.count1);
        System.out.println("count2=" + singleTon.count2);

        System.out.println("count1=" + singleTonv.count1);
        System.out.println("count2=" + singleTonv.count2);

        System.out.println("count1=" + SingleTon.count1);
        //System.out.println("count2=" + SingleTon.count2);
    }
}