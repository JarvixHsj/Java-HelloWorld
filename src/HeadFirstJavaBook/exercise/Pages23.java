package HeadFirstJavaBook.exercise;

public class Pages23 {
    public static void main(String[] args) {
               int x = 0, y = 0;

            while (x < 5) {
//            第一组
//            y = x - y;  //print 00 11 21 32 42

//            第二组
//            y = y + x;  //00 11 23 36 410

//            第三组
//            y = y + 2;
//            if (y > 4) {
//                y = y - 1;
//            }           //02 14 25 36 47
//
//            第四组
//            x = x + 1;
//            y = y + x;  //11 34 59

//            第五组
            if (y < 5) {
                x = x + 1;
                if (y < 3) {
                    x = x - 1;
                }
            }
            y = y + 2;  //02 14 36 48

            System.out.print(x + ""+ y + " ");
            x = x + 1;
        }
    }
}
