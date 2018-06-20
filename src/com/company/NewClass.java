package com.company;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

//类的构造方式（construct）
public class NewClass {
    public NewClass(){
        System.out.println("第一个构造方法！");
    }

    public NewClass(String name){
        System.out.print("小狗的名字是：" + name);
    }

    public static void main(String []args){
        NewClass myNewClass = new NewClass();
        NewClass myPuppy = new NewClass("tommy");
    }
}
