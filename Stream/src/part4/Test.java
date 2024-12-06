package part4;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Dish> menu = Dish.menu;
        List<String> highCaloricDishes = new ArrayList<>();
        Iterator<Dish> iterator = menu.iterator();
        while (iterator.hasNext()) {
            Dish dish = iterator.next();
            if(dish.getCalories()>300){
                highCaloricDishes.add(dish.getName());
            }
        }
        List<String> list = menu.stream().filter(dish->dish.getCalories()>300)
                .map(Dish::getName)
                .collect(Collectors.toList());
        System.out.println(highCaloricDishes.equals(list));

    }
}
