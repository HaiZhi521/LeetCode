package src.Study_11_2;

public class Test1 {
    int  a=10;	//成员变量 示例变量

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        int a = test1.a; //局部变量a
        System.out.println(a);
        test1.sys();
    }
    public void sys() {//示例方法
        System.out.println(a);
    }
}

