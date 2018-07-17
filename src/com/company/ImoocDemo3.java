package com.company;

//imooc 8-1编程练习
public class ImoocDemo3 {
    public static void main(String[] args) {
        int[] scores = {89,-23,64,91,119,52,73};
        printReturn(scores);
    }

    public static void printReturn(int[] scores) {
        
        double[] newArr = new double[10];
        for (int i = 0; i < scores.length; i++){
            if(scores[i] <= 100 && scores[i] >= 0){
                newArr[i] = scores[i];
            }
        }
    }
    
}
