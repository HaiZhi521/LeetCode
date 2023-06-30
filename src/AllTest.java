package src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AllTest {
    public static void main(String[] args) {
        int x = 5;
        if (x > 10){
            ++x;
        }
        System.out.println(x);
    }


}

//自增自减结果测试：符号在后，先取值,在运算;符号在前,先运算,再取值
//        int i= 5;
//        int s = (i++)+(++i)+(i--)+(--i);
//        System.out.println(s);

//Scanner类测试
//接收String类型输入：
// next()：不支持空格输入 nextLine():支持空格输入
//        Scanner sc = new Scanner(System.in);
//        String num = sc.nextLine();
//        String str = sc.next();
//        System.out.println(num);
//        System.out.println(str);