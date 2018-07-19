package imooc.java.two.finalDemo;

import java.util.Scanner;

public class Inital {
    public static int[] carPriceList[];
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("欢迎进去租车系统，请问是否需要租车？（1=租车，0=不租）");
        if(input.hasNext()){
            if(input.nextInt() == 1){
                ICar lwc = new LightWeightCat();

                ICar hc = new HeavyCar();

                ICar mb = new Minibus();

                ICar bb = new Bigbus();

                ICar p = new Pickup();

//        输入介绍
                System.out.println("序号\t车型\t价格\t容量");
                lwc.intro();
                hc.intro();
                mb.intro();
                bb.intro();
                p.intro();

                System.out.println("请输入你要租车的数量：");
                int selectCarNum = input.nextInt();
                if(selectCarNum < 0){
                    System.out.println("输入有误");
                }else{
//                    成功获取数量后，循环车辆数量，并获取所选车型序号
                    int[] carNo = new int[selectCarNum];
                    for (int i= 0; i<selectCarNum; i++) {
                        System.out.println("请输入你要租的第"+(i+1)+"辆车的序号：");
                        carNo[i] = input.nextInt();
                    }
                    System.out.println("请选择出借天数:");

                    int rentDay = input.nextInt();
                    double ontDayPrice = 0;
                    double totalPrice = 0;
//                    获取完车辆序号和天数后，循环刚刚所选的车序号，并计算一天的价格，然后在乘以租用天数即可
//                    System.out.println("循环内");
                    for (int i = 0; i < carNo.length; i++){
//                        System.out.println("循环内的i的值："+i);
//                        System.out.println("循环内carNo[i]的值："+carNo[i]);
//                        System.out.println("获取车价格的返回值："+getCarPrice((carNo[i])));
                        ontDayPrice += getCarPrice((carNo[i])+1);
                    }
//                    System.out.println("循环结束");
//                    System.out.println(ontDayPrice);
                    totalPrice = ontDayPrice * rentDay;
                    System.out.println("结算完毕，您需要支付：" + totalPrice + " \t支付后即可马上提车！");
                }

            }else if (input.nextInt() == 0){
                System.out.println("谢谢惠顾，欢迎下次光临！");
            }else{
                System.out.println("输入有误，谢谢再见！");
            }
        }

    }

    public static void enter(){
       showCar();

        System.out.println("请输入你要租车的数量：");
        Scanner input = new Scanner(System.in);
        int selectCarNum = input.nextInt();
        if(selectCarNum < 0){
            System.out.println("输入有误");
        }else{
            handle(selectCarNum);
        }

    }

    /**
     * 处理选择的车型
     */
    public static void handle(int selectCarNum){
//        int[]
    }


    /**
     * 展示可租车辆
     */
    public static void showCar() {
        ICar lwc = new LightWeightCat();

        ICar hc = new HeavyCar();

        ICar mb = new Minibus();

        ICar bb = new Bigbus();

        ICar p = new Pickup();

//        输入介绍
        System.out.println("序号\t车型\t价格\t容量");
        lwc.intro();
        hc.intro();
        mb.intro();
        bb.intro();
        p.intro();
    }

    /**
     * 根据id序号返回相应车型信息
     * @param id
     */
    public static int getCarPrice(int id){
        System.out.println("id=" + id);
        int price = 0;
        switch (id){
            case 1:
                price = new LightWeightCat().getPrice();
                break;
            case 2:
                price = new HeavyCar().getPrice();
                break;
            case 3:
                price = new Minibus().getPrice();
                break;
            case 4:
                price = new Bigbus().getPrice();
                break;
            case 5:
                price = new Pickup().getPrice();
                break;
        }

        return price;
    }

    public static void printArr(int[] arr){
        for (int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
