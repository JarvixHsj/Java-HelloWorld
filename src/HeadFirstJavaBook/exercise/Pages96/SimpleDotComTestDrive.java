package HeadFirstJavaBook.exercise.Pages96;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleDotComTestDrive {

    public static void main(String[] args) {
        int numberOfGuess = 0;
        SimpleDotCom dot = new SimpleDotCom();

        int randomNum = (int) (Math.random() * 5);
        ArrayList locations = new ArrayList();
        locations.add(randomNum);
        locations.add(randomNum+1);
        locations.add(randomNum+2);

//        int[] locations = {randomNum,randomNum+1,randomNum+2};

        String result;
        dot.setLocationCells(locations);

        Scanner scan = new Scanner(System.in);
        boolean isAlive = true;
        while (isAlive == true){
            System.out.println("请输入整数：");
            String a = scan.next();
            result = dot.checkYourself(a);
            numberOfGuess++;

            if (result.equals("kill")){
                isAlive = false;
            }
        }
        System.out.println("Game Over！");
        System.out.println("use " + numberOfGuess + " number");
    }

}
