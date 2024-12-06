import part4.Dish;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Partitioning {
    public static List<Dish> menu = Item.menu;
    public static void main(String[] args) {
        Map<Boolean,List<Dish>> map = menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println(map);

        Map<Boolean,Map<Dish.Type,List<Dish>>> maps = menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian,
                Collectors.groupingBy(Dish::getType)));
        System.out.println(maps);

        Map<Boolean,Dish> mostCaloric = menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)), Optional::get)));
        System.out.println(mostCaloric);
    }
}
