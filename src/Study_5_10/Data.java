package src.Study_5_10;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
    public static void main(String[] args) {
//        String year;
//        String week;
//        String month;
//        String day;
//        String hour;
//        String minutes;
//        String seconds;
//        SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date oldTime = new Date();
//        String expireTime = time.format(new Date(oldTime.getTime() + 30*1000));
//        year = expireTime.indexOf(0,1);
//        String cron =

        BigDecimal bigDecimal = new BigDecimal(100);
        System.out.println(bigDecimal);
        String sdf = "17 38 14 25 07 ? 2022";
        String s = sdf.substring(6,8)+":"+sdf.substring(3,5);
        //SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
//        Date date = new Date();
//        String formatTimeStr = null;
//        if (date != null) {
//            formatTimeStr = sdf.format(date.getTime() + 30 * 1000);
//        }
        System.out.println(s);
    }
}
