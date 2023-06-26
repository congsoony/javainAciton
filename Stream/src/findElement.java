import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

        String shortMenu = menu.stream().map(Dish::getName).collect(Collectors.joining(","));

        shortMenu = menu.stream().map(Dish::getName).collect(Collectors.reducing((s1,s2)->s1+s2)).get();

        System.out.println(shortMenu);
        shortMenu = menu.stream().collect(Collectors.reducing("",Dish::getName,(d1,d2)->d1+d2));

        System.out.println(shortMenu);

    }
}
