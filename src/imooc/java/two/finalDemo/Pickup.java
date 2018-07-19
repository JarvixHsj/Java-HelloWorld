package imooc.java.two.finalDemo;

public class Pickup extends Car implements ICar{
    String carType = "皮卡";
    int price = 350;
    int cargoPersonNum = 3;
    int cargoWeightNum = 500;

    //    车信息介绍
    public void intro(){
        System.out.println("5.\t皮卡\t\t\t" + price + super.priceUnit + "\t" + cargoWeightNum+ super.CargoWeight + "  " + cargoPersonNum+super.CargoPreson);
    }

    @Override
    public int getPrice() {
        return price;
    }

}
