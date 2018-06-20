package Import;
import java.io.*;

public class EmployeeTest {
    public static void main(String []args){
        Employye empOne = new Employye("Jarvix-1");
        Employye empTwo = new Employye("Jarvix-2");

//        调用这两个对象的成员方法
        empOne.age = 31;
//        empOne.empAge(21);
        empOne.empDesignation("高级PHP");
        empOne.empSalary(10);
        empOne.printEmployee();

        empTwo.empAge(22);
        empTwo.empDesignation("高级Java");
        empTwo.empSalary(100);
        empTwo.printEmployee();

    }
}
