package HeadFirstJavaBook.exercise;

public class Pages291 {
    Integer i;
    int j;

    public static void main(String[] args) {
        Pages291 pages291 = new Pages291();

        pages291.go();
    }

    public void go() {
        j = i;
        System.out.println(j);
        System.out.println(i);
    }
}
