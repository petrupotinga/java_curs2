package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test6 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDateTime ldt = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 16, 40, 9);
        LocalTime lt = LocalTime.of(16, 40);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-YYYY; h:mm:ss");
        System.out.println(ldt);
        System.out.println(ldt.format(f));

//        System.out.println(ldt.getSecond());
//        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
//        System.out.println(ld.format(d1));
//        DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
//        System.out.println(lt.format(DateTimeFormatter.ISO_LOCAL_TIME));
//        DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
//        System.out.println(ldt.format(d2));
//        DateTimeFormatter d4 = DateTimeFormatter.ISO_WEEK_DATE;
//        System.out.println(d4.format(ld));
//
//        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
//        System.out.println(ld);
//        System.out.println(ld.format(shortFormat));
//        System.out.println(ldt);
//        System.out.println(shortFormat.format(ldt));
    }
}
