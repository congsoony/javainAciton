import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DurationTest {
    public static void main(String[] args) {

        Period tenDays =Period.between(LocalDate.of(2017,9,11),
                LocalDate.of(2017,8,12));
        System.out.println(tenDays.getDays());

    }
}
