package DateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test1 {
    public static void main(String[] args) {

//        LocalDate ld1 = LocalDate.of(2023,1,26);
//        System.out.println(ld1);
//        ld1 = ld1.minusDays(6);
//        System.out.println(ld1);
//        ld1 = ld1.plusWeeks(3);
//        System.out.println(ld1);
//        ld1 = ld1.minusWeeks(1);
//        System.out.println(ld1);
//        ld1 = ld1.plusMonths(2);
//        System.out.println(ld1);
//        ld1 = ld1.minusMonths(3);
//        System.out.println(ld1);
//        ld1 = ld1.plusYears(3);
//        System.out.println(ld1);
//        ld1 = ld1.minusYears(2);
//        System.out.println(ld1);

        LocalTime lt1 = LocalTime.of(15,30);
        System.out.println(lt1);
//        lt1 = lt1.plusHours(2);
//        lt1 = lt1.minusMinutes(10);
//        lt1 = lt1.plusSeconds(20);
//        lt1 = lt1..plusNanos(10);
        lt1 = lt1.plusHours(2).minusMinutes(10).plusSeconds(30)
                .plusNanos(10);
        System.out.println(lt1);
    }
}
