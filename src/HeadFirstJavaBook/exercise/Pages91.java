package HeadFirstJavaBook.exercise;

public class Pages91 {

    public static void main(String[] args) {

        //1
        Pages91b[] obs = new Pages91b[6];
        int y = 1;
        int x = 0;
        int result = 0;
        while (x < 6){
            //2
            obs[x] = new Pages91b();
            //3
            obs[x].ivar = y;
            y = y * 10;
            //4
            x = x+1;
        }
        x = 6;
        while (x > 0){
            //5
            x = x -1;
            result = result + obs[x].doStuff(x); //6
        }
        System.out.println("result " + result);
    }

}

class Pages91b {
    int ivar;
    public int doStuff(int factor){
        if (ivar > 100){
            return ivar * factor;
        }else{
            return ivar * (5 - factor);
        }
    }

}
