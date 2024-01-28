package DateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Test4 {
    static void ziuaLucratorului(LocalDate inceput, LocalDate sfirsit, Period p) {
        LocalDate data = inceput;
        while (data.isBefore(sfirsit)) {
            System.out.println("A venit data " + data + " trebuie de inlocuit lucratorul!");
            data = data.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalDate inceput = LocalDate.of(2014, Month.SEPTEMBER, 1);
        LocalDate sfirsit = LocalDate.of(2017, Month.MAY, 31);
        Period p = Period.ofDays(10);
        ziuaLucratorului(inceput, sfirsit, p);
    }
}

