package buoi8_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DateUtil {
    public static Date toDate(String s) throws ParseException
    {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("dd-mm-yyyy");
        Date d = null;
        try {
            d = sdf.parse(s);
        } catch (ParseException e) {
            System.out.println("Nhập sai định dạng ngày tháng");
            e.printStackTrace();
            throw e;
        }
        
        return d;
    }
    
    public static String toString(Date d)
    {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("dd-mm-yyyy");
        return sdf.format(d);
    }
}
