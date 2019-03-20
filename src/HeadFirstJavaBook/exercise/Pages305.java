package HeadFirstJavaBook.exercise;

import java.util.Calendar;

public class Pages305 {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        c.set(2004,1,7,15,40,01); //将时间设为2004年1月7日15点40分01秒
        long day1 = c.getTimeInMillis(); //获取当前时间戳，也就是刚刚设定的2004年的
        day1 += 1000 * 60 * 60;  //加上1个小时
        c.setTimeInMillis(day1); //将添加了一个小时的时间戳设置进去
        System.out.println(c.getTime());
        System.out.println("Now Hour：" + c.get(c.HOUR_OF_DAY));  //打印多少点

        c.add(c.DATE, 35);
        System.out.println("add 35 days :" + c.getTime());

        c.roll(c.DATE,35);
        System.out.println("roll 35 days :" + c.getTime());

        c.set(c.DATE, 1);
        System.out.println("set to 1 " + c.getTime());
    }
}
