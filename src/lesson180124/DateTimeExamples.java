package lesson180124;

import java.time.LocalDate;

public class DateTimeExamples {
    public static void main(String[] args) {

        LocalDate ld = LocalDate.now().withDayOfMonth(1);
        System.out.println(ld);
    }

}
