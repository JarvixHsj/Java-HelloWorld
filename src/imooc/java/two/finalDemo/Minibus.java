package imooc.java.two.finalDemo;


public class Minibus extends Car implements ICar{
    String carType = "小客车";
    int price = 200;
    int cargoPersonNum = 4;
    int cargoWeightNum = 0;

    //    车信息介绍
    public void intro(){
        System.out.println("3.\t小客车\t\t" + price + super.priceUnit + "\t" + cargoPersonNum+ super.CargoPreson);
    }

    @Override
    public int getPrice() {
        return price;
    }
}
