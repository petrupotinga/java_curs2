package DateTime;

import java.time.LocalDate;

public class Test1 {
    public static void main(String[] args) {

        LocalDate ld1 = LocalDate.of(2023,1,26);
        System.out.println(ld1);
        ld1.plusDays(5);
        LocalDate ld2 = ld1.plusDays(5);
        System.out.println(ld2);
        ld1 = ld1.plusDays(6);
        System.out.println(ld1);
    }
}
