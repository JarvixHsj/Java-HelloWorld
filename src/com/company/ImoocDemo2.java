package com.company;

//imooc java第一季 5-5进阶练习

import java.util.Scanner;

/**
 * 实现接收三个班级各四名学员的成绩信息，然后计算每个班级学院的平均分
 */
public class ImoocDemo2 {
    public static void main(String[] args) {
        int classNum = 3;
        int studyNum = 4;
        double sum = 0;

        Scanner input = new Scanner(System.in);
        for (int i = 1;i <= classNum; i++){
            sum = 0;
            System.out.println("***请输入第" + i + "个班级的成绩***");
            for (int j = 1; j <= studyNum; j++){
                System.out.println("输入第" + j + "位学员成绩：");
                sum += input.nextInt();
            }
            System.out.println("该班级成绩平均分为：" + (sum / studyNum));
        }
    }
}
