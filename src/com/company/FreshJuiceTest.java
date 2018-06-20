package com.company;

class FreshJuice {
    enum FreshJuiceSize{ SMALL, MEDIUM , LARGE }
    FreshJuiceSize size;
    FreshJuiceSize param;
}

public class FreshJuiceTest {
    public static void main(String []args){
        FreshJuice juice = new FreshJuice();
        String juice_size = String.valueOf(FreshJuice.FreshJuiceSize.SMALL);
        juice.param = FreshJuice.FreshJuiceSize.LARGE;
        System.out.println(juice_size);
        System.out.println(juice.param);
    }
}
