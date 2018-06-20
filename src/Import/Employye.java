package Import;

import java.io.*;

public class Employye {
    String name;
    int age;
    String designation;
    double salary;

    public Employye(String name){
        this.name = name;
    }
//    设置age的值
    public void empAge(int empAge) {
        age = empAge;
    }
//    设置desogmatopm
    public void empDesignation(String empDesig){
        designation = empDesig;
    }

    public void empSalary(double empSalary){
        salary = empSalary;
    }

    public void printEmployee() {
        System.out.println("名字：" + name);
        System.out.println("年龄：" + age);
        System.out.println("职位：" + designation);
        System.out.println("薪水：" + salary);
    }
}
