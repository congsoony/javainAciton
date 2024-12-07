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
        List<String> list = menu.stream()
                .filter(dish->{
                    System.out.println("filter : "+dish.getName() + " "+dish.getCalories());
                    return dish.getCalories()>500;
                })
                .map(d->{
                    System.out.println("mapping "+ d.getName()+ " "+d.getName());
                    return d.getName();
                })
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(list);

    }
}
