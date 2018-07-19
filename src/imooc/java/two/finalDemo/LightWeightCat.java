package imooc.java.two.finalDemo;

//轻型载货车
public class LightWeightCat extends Car implements ICar{
    int price = 500;
    int cargoWeightNum = 1000;
    int cargoPersonNum = 0;
    String carType = "轻型载货车";

//    车信息介绍
    public void intro(){
        System.out.println("1.\t轻型载货车\t" + price + super.priceUnit + "\t" + cargoWeightNum+ super.CargoWeight);
    }

    @Override
    public int getPrice() {
        return price;
    }
}
