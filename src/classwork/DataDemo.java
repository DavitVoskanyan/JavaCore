package classwork;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DataDemo {
    public static void main(String[] args) {
        Date  now= new Date();
        System.out.println(now);
        SimpleDateFormat stf=new SimpleDateFormat("dd/MMM/yy hh:mm",new Locale("arm"));
        String format =stf.format(now);
        System.out.println(format);

    }
}
