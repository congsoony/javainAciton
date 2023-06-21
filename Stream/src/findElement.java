import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findElement {
    public static List<Dish> menu = Item.menu;
    public static void main(String[] args) {
        List<Integer> someNumbers = Arrays.asList(1,2,3,4,5,6);

        Optional<Integer> firstSqareDivisibleByThree = someNumbers.stream()
                .map(n->n*n)
                .filter(n->n%3==0)
                .findAny();

        Optional<Integer> op = someNumbers.stream().reduce(Integer::min);
        System.out.println(op.get());

        int count = menu.stream().map(dish->1).reduce(0,Integer::sum);
        System.out.println(count);

    }
}
