package com.company;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("请输入行数：");
        int s = 0;
        if (n.hasNextInt()){
            s = n.nextInt();
            echoData(s);
        }else{
            System.out.println("输入的不是整数");
        }
    }

    public static void echoData(int s) {
        for (int i = 1; i <= s; i++){
            String str = "";
            for (int j = 1; j<=i ; j++){
                str += j + " × " + i + " = "+ i*j + "  ";
            }
            str+="\n";
            System.out.print(str);
        }
    }
}
