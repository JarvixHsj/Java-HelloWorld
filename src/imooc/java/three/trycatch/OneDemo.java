package imooc.java.three.trycatch;

public class OneDemo {
    public static void main(String[] args) {
        OneDemo oneDemo = new OneDemo();
//        int result = oneDemo.test();
//        System.out.println("test()方法，执行完毕，返回值为：" + result);
//
//        int result2 = oneDemo.test2();
//        System.out.println("test2()方式，执行完毕，返回值为：" + result2);
//
        int result3 = oneDemo.test3();
        System.out.println("test3（）执行完毕，返回值为：" + result3);
    }


    /**
     * divider(被除数）：
     * result（结果）：
     * try-catch捕获while循环
     * 每次循环，divider减一，result=result+100/divider
     * 如果：捕获异常，打印输出“抛出异常了！！”，返回result = -1；
     * 否则：返回result
     * @return
     */
    public int test() {
        int divider = 10;
        int result = 100;
        try {
            while (divider > -1){
                divider--;
                result = result + 100/divider;
            }
            return result;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("循环抛出异常了！！！");
            return -1;
        }
    }

    /**
     * divider(被除数）：
     * result（结果）：
     * try-catch捕获while循环
     * 每次循环，divider减一，result=result+100/divider
     * 如果：捕获异常，打印输出“抛出异常了！！”，返回result = 999；
     * 否则：返回result
     * finally:答应输出“这是finally！！！哈哈！！”，同时打印输出result的值
     * @return
     */
    public int test2() {
        int divider = 10;
        int result = 100;
        try {
            while (divider > -1){
                divider--;
                result = result + 100/divider;
            }
            return result;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("循环抛出异常了！！！");
            return result = 999;
        }finally {
            System.out.println("这是finally！！！哈哈！！");
            System.out.println("我是result，我的值："+ result);
        }
    }

    /**
     * divider(被除数）：
     * result（结果）：
     * try-catch捕获while循环
     * 每次循环，divider减一，result=result+100/divider
     * 如果：捕获异常，打印输出“抛出异常了！！”；
     * 否则：返回result
     * finally:答应输出“这是finally！！！哈哈！！”，同时打印输出result的值
     * 最后，返回1111作为结果
     * @return
     */
    public int test3() {
        int divider = 10;
        int result = 100;
        try {
            while (divider > -1){
                divider--;
                result = result + 100/divider;
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("循环抛出异常了！！！");
        }finally {
            System.out.println("这是finally！！！哈哈！！");
            System.out.println("我是result，我的值："+ result);
        }
        System.out.println("我是test3，我运行完毕了");
        return 1111;
    }
}
