import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static List<Dish> menu = Item.menu;
    public static void main(String[] args) {
        Map<Dish.Type,List<Dish>> caloricDishByType = menu.stream().filter(dish -> dish.getCalories()>500)
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println(caloricDishByType);

        Map<Dish.Type,List<Dish>> caloricDishesByType = menu.stream()
                .collect(Collectors.groupingBy(Dish::getType,Collectors.filtering(dish -> dish.getCalories()>500,Collectors.toList())));

        System.out.println(caloricDishesByType);
    }
}
