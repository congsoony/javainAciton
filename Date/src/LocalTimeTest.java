import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalTimeTest {
    public static void main(String[] args) {

        LocalTime time = LocalTime.of(13,45,20);//13:45:20
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        System.out.println(hour+" "+minute+" "+second);

        LocalDate date = LocalDate.parse("2017-09-21");
        time =LocalTime.parse("13:45:20");
        System.out.println(date);
        System.out.println(time);

        LocalDateTime dt1 = LocalDateTime.of(2017, Month.SEPTEMBER,21,13,45,20);
        LocalDateTime dt2 = LocalDateTime.of(date,time);
        LocalDateTime dt3 = date.atTime(13,45,20);
        LocalDateTime dt4 = date.atTime(time);
        LocalDateTime dt5 = time.atDate(date);

        System.out.println(dt1);
        System.out.println(dt2);
        System.out.println(dt3);
        System.out.println(dt4);
        System.out.println(dt5);

    }
}
