package src.Study_4_2;
import java.io.Console;
import java.util.*;
//Console 命令行输入类，需要在命令行执行

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入年龄：");
//        int age = scanner.nextInt();
//        System.out.println("输入姓名：");
//        String name = scanner.nextLine();
//        System.out.println(name + " is " +age);
        Console console = System.console();
        String username = console.readLine("username:");
        char[] psw = console.readPassword("password:");
        for (int i = 0;i<psw.length;i++){
            System.out.print(psw[i]);
        }

    }
}
