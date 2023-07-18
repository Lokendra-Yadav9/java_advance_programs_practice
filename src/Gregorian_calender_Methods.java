import java.util.Calendar;
import java.util.GregorianCalendar;

public class Gregorian_calender_Methods {


    public static void main(String[] args) {
        Calendar c2=Calendar.getInstance();
//        System.out.println(c2.getTimeZone());
//        System.out.println(c2.get(Calendar.HOUR));
//        System.out.println(c2.get(Calendar.HOUR_OF_DAY));
//        System.out.println(c2.get(Calendar.MINUTE));
//        System.out.println(c2.get(Calendar.MONDAY));
//        System.out.println(c2.get(Calendar.DAY_OF_YEAR));

        GregorianCalendar gc1=new GregorianCalendar();

        System.out.println(gc1.isLeapYear(2024));
//        gc1.add(GregorianCalendar.DATE,2);   // for add a date in number in an specific date
//        gc1.add(GregorianCalendar.YEAR,2);
//        gc1.add(GregorianCalendar.MONTH,2);
//        gc1.add(GregorianCalendar.ERA,2);
//        System.out.println(gc1.getTimeZone().getRawOffset());
//        gc1.roll(GregorianCalendar.YEAR,5);  add and roll are same for this
//        int year= gc1.getActualMaximum(GregorianCalendar.YEAR);
//        int month= gc1.getActualMaximum(GregorianCalendar.MONTH);
//        int Date= gc1.getActualMaximum(GregorianCalendar.DATE);
//        System.out.println("ActualMaximum year "+year+" Month "+month+" date "+Date);
//
//        int year1=gc1.getActualMinimum(GregorianCalendar.YEAR);
//        int Month1=gc1.getActualMinimum(GregorianCalendar.MONTH);
//        int Date1=gc1.getActualMinimum(GregorianCalendar.DATE);
//        System.out.println("ActualMinimum year "+year1+" Month "+Month1+" date "+Date1);
//
//        int year2=gc1.getGreatestMinimum(GregorianCalendar.YEAR);
//        int Month2=gc1.getGreatestMinimum(GregorianCalendar.MONTH);
//        int Date2=gc1.getGreatestMinimum(GregorianCalendar.DATE);
//        System.out.println("Greatminimum year "+year2+" Month "+Month2+" date "+Date2);
//
//        int year3=gc1.getLeastMaximum(GregorianCalendar.YEAR);
//        int Month3=gc1.getLeastMaximum(GregorianCalendar.MONTH);
//        int Date3=gc1.getLeastMaximum(GregorianCalendar.DATE);
//        System.out.println("leastMaximum year "+year3+" Month "+Month3+" date "+Date3);
//
//        int year4=gc1.getMaximum(GregorianCalendar.YEAR);
//        int Month4=gc1.getMaximum(GregorianCalendar.MONTH);
//        int Date4=gc1.getMaximum(GregorianCalendar.DATE);
//        System.out.println("getMaximum year "+year4+" Month "+Month4+" date "+Date4);
//
//        int year5=gc1.getMinimum(GregorianCalendar.YEAR);
//        int Month5=gc1.getMinimum(GregorianCalendar.MONTH);
//        int Date5=gc1.getMinimum(GregorianCalendar.DATE);
//        System.out.println("getMaximum year "+year5+" Month "+Month5+" date "+Date5);

//        these all are same



        System.out.println(gc1.getTime());
    }
}
