import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date1 = LocalDate.of(2014,3,18);
        String formattedDate = date1.format(formatter);
        LocalDate date2 = LocalDate.parse(formattedDate,formatter);
        System.out.println(formattedDate);

        System.out.println(date2);

        DateTimeFormatter italianFormatter = DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.ITALIAN);
        formattedDate = date1.format(italianFormatter);
        date2 = LocalDate.parse(formattedDate,italianFormatter);

        System.out.println(formattedDate);
        System.out.println(date2);
    }
}
