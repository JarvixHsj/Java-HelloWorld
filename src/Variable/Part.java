package Variable;

/**
 * 局部变量
 * 局部变量声明在方法、构造方法或者语句块中；
 * 局部变量在方法、构造方法、或者语句块被执行的时候创建，当它们执行完成后，变量将会被销毁；
 * 访问修饰符不能用于局部变量；
 * 局部变量只在声明它的方法、构造方法或者语句块中可见；
 * 局部变量是在栈上分配的。
 * 局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。
 */
public class Part {

    public void pupAge(){
        int age = 0;    //局部变量一定要初始化，int age;这样会报错
        age += 8;
        System.out.println("小狗的年龄是：" + age);
    }

    public static void main(String[] args){
        Part test = new Part();
        test.pupAge();
    }
}
