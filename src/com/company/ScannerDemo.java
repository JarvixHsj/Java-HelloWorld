package com.company;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
//        next();
//        nextLine();
        getIntAndFloat();

    }

//    获取输入的字符串
    public static void next(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Next方式接收：");
        if(scan.hasNext()){
            String str2 = scan.next();
            System.out.println("输入的数据为：" + str2);
        }
        scan.close();
    }


    public static void nextLine(){
        Scanner scan = new Scanner(System.in);

        //从键盘接收数据
        System.out.println("NextLine方式接收：");
        //判断是否还有输入
        if (scan.hasNextLine()){
            String str2 = scan.nextLine();
            System.out.println("输入的数据为：" + str2);
        }

        scan.close();
    }


//    指定获取int和float
    public static void getIntAndFloat(){
        int i = 0;
        float f = 0.00f;
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入整数：");

        if (scan.hasNextInt()){
            i = scan.nextInt();
            System.out.println("你输入的是：" + i);
        }else{
            System.out.println("你输入的不是整数");
        }

        System.out.println("请输入小数：");
        if(scan.hasNextFloat()){
            f = scan.nextFloat();
            System.out.println("你输入的小数是："+ f);
        }else{
            System.out.println("输入的不是小数！");
        }

    }
}
