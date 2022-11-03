package src.Study_11_2;

public class Variable {
    static String name; //成员变量 又称静态变量 由 static修饰 又称全局变量 可以被静态方法使用
    int num=10;//成员变量	又称实例变量   一般使用在其他需要的方法中 使用时需要new一下
    public static void A() {
        int num=20;  //局部变量 在这个方法内使用
        System.out.println("我是静态变量name 我的值是初始值"+name);
        System.out.println("我是局部变量num 我需要赋值后使用 我的值是"+num);
        name = "被A修改过的name";
    }

    public static  void B(int param) {  //方法的参数就是局部变量
        //参数在方法调用的时候必然是会被赋值的
        System.out.println("我是局部变量parame 我需要赋值后使用 我的值是"+param);
        System.out.println("我是静态变量name 我的值是"+name);
    }

    public static void main(String[] args){
        int numB = 100;
        A();
        B(numB);
    }
}
