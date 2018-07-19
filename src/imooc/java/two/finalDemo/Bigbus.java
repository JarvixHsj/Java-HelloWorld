package imooc.java.two.finalDemo;

public class Bigbus extends Car implements ICar{
    String carType = "大巴";
    int price = 200;
    int cargoPersonNum = 4;
    int cargoWeightNum = 0;

    //    车信息介绍
    public void intro(){
        System.out.println("4.\t大巴\t\t\t" + price + super.priceUnit + "\t" + cargoPersonNum+ super.CargoPreson);
    }

    @Override
    public int getPrice() {
        return price;
    }
}
