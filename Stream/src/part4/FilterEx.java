package part4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEx {
    public static void main(String[] args) {
        List<Dish> menu = Dish.menu;
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for(Dish dish:menu){
            if(dish.getCalories()<400){
                lowCaloricDishes.add(dish);
            }
        }
        Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return Integer.compare(o1.getCalories(), o2.getCalories());
            }
        });

        List<String>lowCaloricDisheName = new ArrayList<>();
        for(Dish dish:lowCaloricDishes){
            lowCaloricDisheName.add(dish.getName());
        }
        System.out.println(lowCaloricDisheName);

        //위아래 코드는 같다.
        lowCaloricDisheName = menu.stream()
                .filter(d->d.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName).
                collect(Collectors.toList());
        System.out.println(lowCaloricDisheName);

    }
}
