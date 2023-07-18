import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class LocalDateTime_class_in_java {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println(d);
        LocalDateTime dt=LocalDateTime.now();
//        System.out.println(dt.hashCode());
//        System.out.println(dt);
//        System.out.println(dt.toLocalDate());
//        DateTimeFormatter dft=DateTimeFormatter.ofPattern("dd-mm-yyyy");
//        DateTimeFormatter dft=DateTimeFormatter.ISO_LOCAL_DATE_TIME;
//        DateTimeFormatter dft=DateTimeFormatter.ISO_OFFSET_DATE;
//        DateTimeFormatter dft2=DateTimeFormatter.ISO_ORDINAL_DATE;
//        DateTimeFormatter dft3=DateTimeFormatter.ISO_WEEK_DATE;
        DateTimeFormatter dft4=DateTimeFormatter.ISO_TIME;

//        String myd=dt.format(dft);
//        String myd2=dt.format(dft2);
//        String myd3=dt.format(dft3);
        String myd4=dt.format(dft4);

//        System.out.println(myd);
//        System.out.println(myd2);
//        System.out.println(myd3);
        System.out.println(myd4);
//        System.out.println(myd);
//
    }
}
