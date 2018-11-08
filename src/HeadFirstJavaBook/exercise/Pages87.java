package HeadFirstJavaBook.exercise;

public class Pages87 {

    public static void main(String[] args) {
        int a = calcArea(7,12);

        short c = 7;
        calcArea(c,15);

//        int d = calcArea(57);

//        long t = 42;
//        int f = calcArea(t,15);

//        int g = calcArea();

//        byte h = calcArea(4,20);

//        int j = calcArea(1,2,3);

//        System.out.println(a);

    }

    public static int calcArea(int height, int width) {
        return height * width;
    }
}
