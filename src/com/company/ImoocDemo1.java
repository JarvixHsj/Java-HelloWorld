package com.company;

//imooc java第一季 5-1编程练习

import java.util.Scanner;

/**
 * 指定成绩加分，直到分数大于等于60为止，输出加分前和加分后的成绩，并统计加分的次数
 */
public class ImoocDemo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int score = input.nextInt();

        int count = 0;
        System.out.println("初始分数是：" + score);
        System.out.println("请输入要加分的数值：");
        do{
//            if(input.hasNextInt()){
//                score += input.nextInt();
                score += 1;
                count += 1;
//            }
        }while (score < 60);


        System.out.println("加分后的数值：" + score);
        System.out.println("共加了" + count + "次");
    }
}
