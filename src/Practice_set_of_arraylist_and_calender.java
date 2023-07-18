

//import java.text.Format;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * this java doc is made by me and try to learn something new
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/overview-summary.html" target="_blank">java-Docs</a>
 * @author LOKENDRA SINGH YADAV
 *
 * @version 0.11
 * @since 2002
 * @serial love
 */

public class Practice_set_of_arraylist_and_calender {
    public static void main(String[] args) {

        // Question 1- arraylist and printNAme 10

        ArrayList<String> arName = new ArrayList<>();
        arName.add("luck1");
        arName.add("luck2");
        arName.add("luck3");
        arName.add("luck4");
        arName.add("luck5");
        arName.add("luck6");
        arName.add("luck7");
        arName.add("luck8");
        arName.add("luck9");
        arName.add("luck10");

        for (String Name : arName) {
            System.out.println(Name);

            // question 2- print date formatJava dd:mm:yyyy

            LocalDate ldd = LocalDate.now();
            System.out.println(ldd);
            DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd:MM:yyyy");
            String FormattedDate = ldd.format(dft);
            System.out.println(FormattedDate);


//        question 3- using calendar class make the date or time in format

            Date d = Calendar.getInstance().getTime();
            SimpleDateFormat smf = new SimpleDateFormat("dd:MM:yyyy");
            String sName = smf.format(d);
            System.out.println(sName);

            HashSet<String> set = new HashSet<>();
            set.add("a");
            set.add("b");
            set.add("c");
            set.add("d");
            set.add("e");
//            set.add("e");

            System.out.println(set);
        set.stream().distinct().forEach(System.out::println);
            set.stream().filter(Met -> Met.startsWith("e")).forEach(System.out::println);
        System.out.println(set.spliterator());
        System.out.println(set);
        System.out.println(set.stream().distinct());
        System.out.println(set.stream().distinct().count());
//    }
        }

    }}
