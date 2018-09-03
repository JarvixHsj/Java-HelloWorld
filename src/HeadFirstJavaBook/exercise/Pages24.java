package HeadFirstJavaBook.exercise;

/**
 * 大致思路：（先看题目和可选片段）
 * 1、选取循环条件的片段（这个可以根据片段给出的条件来算）
 * 2、提取公共部分（因为题目里面循环的第一行和第五行都是横线，要么是打印要么就是x的计算
 * 3、然后再根据给出的if条件来判断x依次增对应执行的打印片段（注意要根据x的值来错开if的判断，尽可能每次循环只执行一次if）
 */
public class Pages24 {
    public static void main(String[] args) {
        int x = 0;
        while (x < 4) {
            System.out.print("a");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");
            if (x > 1) {
                System.out.print(" oyster");
                x = x + 2;
            }
            if (x == 1) {
                System.out.print("noys");
            }

            if (x < 1) {
                System.out.print("oise");
            }

            System.out.println();
            x = x + 1;
        }
    }
}
