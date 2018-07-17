package com.company;

//尝试写下冒泡排序
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = {88, 31, 24, 58, 95, 24, 11};
        int arrCount = arr.length;
        for (int i = 0; i < arrCount-1; i++) {
            for (int j = 0; j < arrCount - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i< arrCount; i++){
            System.out.print(arr[i] + "  ");
        }


//        for(int i =0;i<arr.length-1;i++) {
//            for(int j=0;j<arr.length-i-1;j++) {//-1为了防止溢出
//                if(arr[j]>arr[j+1]) {
//                    int temp = arr[j];
//
//                    arr[j]=arr[j+1];
//
//                    arr[j+1]=temp;
//                }
//            }
//        }

    }
}
