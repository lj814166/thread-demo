package com.gupaoedu.other;

public class Demo1 {
    public static int i = 1;
    public int j = 2;
    
    public static int getNumber(int b){
        i=b;
        return i;
//        这个return返回的是全局变量的i，即前面多创建的i
    }
    
    public int getDealNumber(int b){
        j=b;
        return j;
//        这个return返回的是所传进来的参数，是(int j)这个东西
    }





    public static void main(String args[]){
//        想要得到Demo1中的静态的（即全局的）变量i，直接用类名引用就可以了
        int i = Demo1.i;
//        但是想要得到Demo1中的实例的变量j，我需要怎么做呢？（此刻牢记java面向对象的思想！）
//        首先我要先new一个Demo1的对象,然后才可以通过new出来的对象得到Demo1中的j
        Demo1 demo1 = new Demo1();
        int j = demo1.j;
//        同理，java中的static方法和非static方法都是一样的区别
//        下面一行的方法是静态的,我可以直接根据类名调用方法
        int ii = Demo1.getNumber(7);
//        但是想要调用实例的方法,就需要利用前面所new出来的Demo1的对象来调用了
        int jj = demo1.getDealNumber(66);

        System.out.println("i="+i+";j="+j+";ii="+ii+";jj="+jj);
        System.out.println("i="+i+";j="+j+";ii="+ii+";jj="+jj);
//        所以现在你可以理解上文紫色的定义了么？
    }
}