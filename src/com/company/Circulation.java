package com.company;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

//循环结构
public class Circulation {
    public static void main(String args[]){
//        whileTest();
//        doWhileTest();
//        forTest();
        demo();
    }

    public static void whileTest(){
        System.out.println("while循环Start");
        System.out.println("不满足条件则不执行");

        int x = 15;
        while (x < 20){
            System.out.println("value of x :" + x);
            x++;
        }
        System.out.println("while循环end");
    }

    public static void doWhileTest(){
        System.out.println("doWhile循环Start");
        System.out.println("先执行一次后再判断循环条件。至少执行一次");
        int x = 15;
        do{
            System.out.println("value of x : " + x);
            x++;
        }while( x < 20);
        System.out.println("doWhile循环End");
    }

    public static void forTest(){
        System.out.println("for循环Start");
        System.out.println("执行的次数是在执行前就确定的");
        for (int x = 15; x < 20; x++){
            System.out.println("value of x:" + x);
        }
        System.out.println("for循环End");
    }


    public static void demo(){
        int [] numbers = {10,20,30,40,50};

        for (int x:numbers){
            System.out.print(x);
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names = {"James", "Larry", "Tom", "Lacy"};
        for( String name : names){
            System.out.print(name);
            System.out.print(",");
        }
    }

}
