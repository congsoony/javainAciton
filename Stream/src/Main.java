import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static List<Dish> menu = Item.menu;
    public static void main(String[] args) {

        List<String> threeHighCaloricDishNames = menu.stream().filter(dish -> dish.getCalories()>300)
                .map(Dish::getName)
                .limit(3)//선착순 3개까지만
                .collect(Collectors.toList());
        System.out.println(threeHighCaloricDishNames);



        //게으른 특성확인
        List<String> names = menu.stream().filter(dish->{
            System.out.println("filtering: "+dish.getName());
            return dish.getCalories()>300;})
                .map(dish->{
                    System.out.println("mapping: "+dish.getName());
                    return dish.getName();
                })
                .limit(3)
                .collect(Collectors.toList());
        //filtering: pork
        //mapping: pork
        //filtering: beef
        //mapping: beef
        //filtering: chicken
        //mapping: chicken
        System.out.println(names);

        int totalCalories = menu.stream().collect(Collectors.summingInt(Dish::getCalories));

        System.out.println("totalCalories : "+ totalCalories);

        IntSummaryStatistics menuStatistics =menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));

        System.out.println(menuStatistics);

        String shortMenu = menu.stream().map(Dish::getName).collect(Collectors.joining(" "));
        System.out.println(shortMenu);

        int total = menu.stream().collect(Collectors.reducing(0,Dish::getCalories,Integer::sum));


        Map<Dish.Type,List<Dish>> dishesByType = menu.stream().collect(Collectors.groupingBy(Dish::getType));

        System.out.println(dishesByType);


    }
}
