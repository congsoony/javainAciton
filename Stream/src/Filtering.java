import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtering {
    public static List<Dish> specialMenu = Item.specialMenu;
    public static void main(String[] args) {
        List<Dish> sliceMenu1 = specialMenu.stream().takeWhile(dish->dish.getCalories()<320)
                .collect(Collectors.toList());

        System.out.println(sliceMenu1);


        List<Dish> sliceMenu2 = specialMenu.stream().dropWhile(dish->dish.getCalories()<320)
                .collect(Collectors.toList());
        System.out.println(sliceMenu2);
    }
}
