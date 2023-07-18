import  java.util.Calendar;
import java.util.TimeZone;

//import static java.util.Calendar.getInstance;

public class Calender_Class_In_java {
    public static void main(String[] args) {
//        Calendar c1= Calendar.getInstance();
//        System.out.println(c1.getCalendarType());
//        System.out.println(c1.getFirstDayOfWeek());
//        System.out.println(c1.getTimeZone());
//        System.out.println(c1.getWeeksInWeekYear());


        Calendar c1= Calendar.getInstance(TimeZone.getTimeZone(String.valueOf(1)));
        System.out.println(c1.getCalendarType());
        System.out.println(c1.getFirstDayOfWeek());
        System.out.println(c1.getTimeZone());
        System.out.println(c1.getWeeksInWeekYear());
    }
}
