package com.company;

//类的操作
public class OperationClass {

//    访问实例变量和方法
    int puppyAge;
    public OperationClass(String name){
//        这是构造方法
        System.out.println("小狗的名字是：" + name);
    }

    public void setPuppyage(int age) {
        puppyAge = age;
    }

    public int getPuppyAge(){
        System.out.println("小狗的年龄为：" + puppyAge);
        return puppyAge;
    }

    public static void main(String []args){
//        创建对象
        OperationClass myClass = new OperationClass("tommy");
//        通过方法来设定age
        myClass.setPuppyage(1);
//        调用另一个方法获取age
        myClass.getPuppyAge();
//        也可以像下面这样访问成员变量
        myClass.puppyAge = 10;
        System.out.println("变量值：" + myClass.puppyAge);
    }


}
