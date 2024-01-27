package DateTime;

import java.time.*;

public class Test5 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2023, Month.APRIL, 1,16,30);
        LocalTime lt = LocalTime.of(10,30);
        Period p = Period.ofMonths(3);
        Duration d =Duration.ofMinutes(3);
        System.out.println(ldt.plus(d).plus(p));
    }
}
