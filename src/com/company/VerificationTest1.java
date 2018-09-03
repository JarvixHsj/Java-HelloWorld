package com.company;

public class VerificationTest1 {
    public static void main(String[] args) {

        Integer i = new Integer(0);
        i = add(i);
        System.out.println(i);//0
    }
    private static Integer add(Integer i) {
        i = i + 3;
        i = new Integer(i);//3
        return i;
    }
}
