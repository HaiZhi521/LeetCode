package src.Study_5_10;

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
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //sdf.format(new Date());
        String minutes = sdf.format(new Date()).substring(14,16);
        int minutes15 = Integer.parseInt(minutes)/15*15;
        String date = sdf.format(new Date()).substring(0,14)+minutes15+sdf.format(new Date()).substring(16,17)+"00";
        //sdf.format(new Date());

//        String expireTime = time.format(new Date(oldTime.getTime() + 30*1000));
//        year = expireTime.indexOf(0,1);
//        String cron =
//        BigDecimal bigDecimal = new BigDecimal(100);
//        System.out.println(bigDecimal);
//        String sdf = "17 38 14 25 07 ? 2022";
//        String s = sdf.substring(6,8)+":"+sdf.substring(3,5);
        //SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
//        Date date = new Date();
//        String formatTimeStr = null;
//        if (date != null) {
//            formatTimeStr = sdf.format(date.getTime() + 30 * 1000);
//        }
        System.out.println(date);
    }
}
