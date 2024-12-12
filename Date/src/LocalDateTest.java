import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017,9,21);
        int year = date.getYear();
        Month month = date.getMonth();
        int day = date.getDayOfMonth();
        DayOfWeek dow = date.getDayOfWeek();
        int len = date.lengthOfMonth();
        boolean leap = date.isLeapYear();

        System.out.println(year+" "+month +" "+ day);

        System.out.println(dow);
        System.out.println(len);
        System.out.println(leap);//윤년인지

        int year2 =date.get(ChronoField.YEAR);
        int month2 = date.get(ChronoField.MONTH_OF_YEAR);
        int day2 = date.get(ChronoField.DAY_OF_MONTH);
        System.out.println(year2 + " "+month2 + " "+ day2);

    }
}
