package src.Study_2023_01_04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataCalculation {
    public static void main(String[] args) {
        String dateTime = "2022-04-01 00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar time = Calendar.getInstance();
        Date date = null;
        try {
            date = sdf.parse(dateTime);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        time.setTime(date);
        time.add(Calendar.MINUTE,-1);
        //dateTime = time.toString();
        System.out.println(sdf.format(time.getTime()));
    }
}
