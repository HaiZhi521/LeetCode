package src.Study_2023_01_04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataCalculation {
    public static void main(String[] args) {

//        String dateTime = "2022-04-01 00:00:00";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        //SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
//        //System.out.println(sdf1.format(new Date()));
//        String executionTime = sdf.format(new Date()).substring(11,16);
//        System.out.println(executionTime);
//        Calendar time = Calendar.getInstance();
//        Date date = null;
//        try {
//            date = sdf.parse(dateTime);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//        time.setTime(date);
//        time.add(Calendar.MINUTE,-1);
//        //dateTime = time.toString();
//        System.out.println(sdf.format(time.getTime()));
        String date = "2023-02-16 00:00:00";
        SimpleDateFormat sdfDay = new SimpleDateFormat("HH:mm:ss");
        System.out.println(date.substring(8,19));
    }
}
