import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DurationTest {
    public static void main(String[] args) {

//        Period tenDays =Period.between(LocalDate.of(2017,9,11),
//                LocalDate.of(2017,8,12));
//        System.out.println(tenDays.getDays());

        Duration threeMinutes = Duration.of(3, ChronoUnit.MINUTES);
        System.out.println(threeMinutes);

        Period tenDays = Period.ofDays(10);
        Period threeWeeks = Period.ofWeeks(3);
        Period twoYearSixMonthOneDay = Period.of(2,6,1);
        System.out.println(tenDays);
        System.out.println(threeWeeks);
        System.out.println(twoYearSixMonthOneDay);

    }
}
