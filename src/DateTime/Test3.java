package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test3 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2023,1,26);
        LocalDate ld2 = LocalDate.of(2023,1,27);
        System.out.println(ld1.isAfter(ld2));

        LocalTime lt1 = LocalTime.of(16,30);
        LocalTime lt2 = LocalTime.of(16,30,25);
        System.out.println(lt1.isBefore(lt2));

        LocalDateTime ldt1 = LocalDateTime.of(2023,2,15,16,30);
        LocalDateTime ldt2 = LocalDateTime.of(2023,2,15,16,30, 25);
        System.out.println(ldt1.isAfter(ldt2));
    }
}
