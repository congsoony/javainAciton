import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

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
    }
}
