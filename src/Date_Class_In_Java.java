
import java.util.Date;
public class Date_Class_In_Java {
    public static void main(String[] args) {
         Date d1=new Date();
         Date d2=new Date();
        System.out.println(d1);
        System.out.println(d1.getDate());
//        System.out.println(d1.after());
           d1.setDate(1);
           d1.compareTo(d2);
        System.out.println(d1.getTime());
        System.out.println(d1.getHours());
        System.out.println(d1.getTimezoneOffset());
        System.out.println(d1.getClass());
        System.out.println(d1.getDate());

    }
}
