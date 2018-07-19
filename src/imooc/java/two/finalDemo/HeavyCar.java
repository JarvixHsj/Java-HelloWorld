package imooc.java.two.finalDemo;

//重型载货车
public class HeavyCar extends Car implements ICar{
    String carType = "重型载货车";
    int price = 1000;
    int cargoWeightNum = 3000;
    int cargoPersonNum = 0;
    //    车信息介绍
    public void intro(){
        System.out.println("2.\t重型载货车\t" + price + super.priceUnit + "\t" + cargoWeightNum+ super.CargoWeight + "\t" + cargoPersonNum+ super.CargoPreson);
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}
