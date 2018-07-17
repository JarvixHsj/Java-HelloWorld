package ExtendsDemo;

//狗类
public class dog extends Animal{

    void eat(){
        System.out.println("dog : eat");
    }

    void eatTest(){
        this.eat();
        super.eat();
    }
}
