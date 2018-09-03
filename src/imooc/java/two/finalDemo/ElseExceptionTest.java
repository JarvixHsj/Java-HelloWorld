package imooc.java.two.finalDemo;

import java.util.Arrays;
import java.util.Scanner;

public class ElseExceptionTest {

    /**
     * 定义ExceptionTest类，其中包括静态成员方法div（int a,int b）实现返回量参数相除的结果，
     * 该方法对可能产生的除数为0的算术异常不做处理，只声明抛出异常（利用两种方法，自己定义抛出和系统自动抛出）；
     * 在main()方法中定义两个int 型数组x和y，x包含6个元素，y包含5个元素，通过键盘循环输入相应元素
     * 其中y的某个元素为0，调用div()方法实现x的每个元素除以y的每个元素，并输出结果；
     * 利用try…catch…finally 语句捕获可能会出现的错误，并最后利用exception类捕获所有的错误；在finally中输出“关闭相关资源！"
     */

    public static void main(String[] args) {
        int[] x = new int[6];
        int[] y = new int[5];
        int x_length = x.length;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入x和y的值");
        for (int i=0; i<x_length; i++){
            System.out.println("请输入x的第"+ (i+1) + "个值：");
            if(input.hasNextInt()){
                x[i] = input.nextInt();
            }else{
                System.out.println("你输入的不是整数！");
            }
        }
        for (int i=0; i<y.length; i++){
            System.out.println("请输入y的第"+ (i+1) + "个值：");
            if(input.hasNextInt()){
                y[i] = input.nextInt();
            }else{
                System.out.println("你输入的不是整数！");
            }
        }

        for (int i = 0; i<x_length;i++){

        }

        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));



    }

    public static int div(int a, int b){

        return 0;
    }
}
