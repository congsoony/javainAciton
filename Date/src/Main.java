import java.time.*;
import java.time.temporal.ChronoField;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023,6,28);
        int year = date.getYear();
        Month month = date.getMonth();
        int day = date.getDayOfMonth();
        DayOfWeek dow = date.getDayOfWeek();
        int len = date.lengthOfMonth();
        boolean leap = date.isLeapYear();

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(dow);
        System.out.println(len);
        System.out.println(leap);

        date = LocalDate.parse("2023-06-28");
        System.out.println(date);

        LocalTime time = LocalTime.parse("18:43:20");
        System.out.println(time);

        LocalDateTime dt1 = LocalDateTime.of(2023, Month.JUNE,28,18,43,20);
        LocalDateTime dt2 = LocalDateTime.of(date,time);
        LocalDateTime dt3 = date.atTime(18,43,20);
        LocalDateTime dt4 = date.atTime(time);
        LocalDateTime dt5 = time.atDate(date);

        System.out.println(dt1);
        System.out.println(dt2);
        System.out.println(dt3);
        System.out.println(dt4);
        System.out.println(dt5);

        LocalDate date2 = date.withYear(2011);

        System.out.println(date);
        System.out.println(date2);


    }
}