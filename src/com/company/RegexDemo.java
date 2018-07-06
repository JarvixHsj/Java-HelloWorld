package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {
//        RegexExample1();
        RegexMatches();

    }

    public static void RegexMatches() {
        //按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
//        String pattern = "(\\D*)(\\d+)(.*)";
        String pattern = "(\\d+)(.*)";

        //创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        //现在创建matches 对象
        Matcher m = r.matcher(line);
        if (m.find()){
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
//            System.out.println("Found value: " + m.group(3));
        }else{
            System.out.println("NO MATCH");
        }
    }

    //判断是否包含某字符串
    public static void RegexExample1() {
        String content = "I am noob " +
                "from runoob.com.";

        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println(isMatch);
    }
}
