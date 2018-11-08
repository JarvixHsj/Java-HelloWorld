package HeadFirstJavaBook.exercise;

public class Pages90 {
    int counter = 0;

    public static void main(String[] args) {
        int count = 0;

        Pages90[] p = new Pages90[20];

        int x = 0;
        while (x < 9) {
            p[x] = new Pages90();
            p[x].counter = p[x].counter + 1;

            count = count + 1;
            count = count + p[x].maybe(x);
            x = x + 1;
        }
        System.out.println(count + "  " + p[1].counter);
    }

    public int maybe(int index) {
        if ( index < 5) {
            Pages90 ps = new Pages90();
            ps.counter = ps.counter + 1;
            return 1;
        }
        return 0;
    }
}
