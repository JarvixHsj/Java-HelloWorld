package Variable;

// static 修饰符

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * 静态变量：
 * static 关键字用来声明独立于对象的静态变量，无论一个类实例化多少对象，它的静态变量只有一份拷贝。 静态变量也被称为类变量。局部变量不能被声明为 static 变量。
 *
 * 静态方法：
 * static 关键字用来声明独立于对象的静态方法。静态方法不能使用类的非静态变量。静态方法从参数列表得到数据，然后计算这些数据。
 * 对类变量和方法的访问可以直接使用 classname.variablename 和 classname.methodname 的方式访问。
 */
public class StaticModifier {
    private static int numInstances = 0;

    protected static int getCount(){
        return numInstances;
    }

    private static void addInstances(int num){
        if(num != 0){
            numInstances+=num;
        }else{
            numInstances++;
        }
    }

    StaticModifier(int num){
        StaticModifier.addInstances(num);
    }

    public static void main(String[] args){
        System.out.println("Starting with " + getCount() +" instances");
        for (int i = 0; i < 501; i++){
            new StaticModifier(i);
        }
        System.out.println("Created "+ getCount() + " instances");
    }

}
