package org.example.part9;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingRefact {
    public static void main(String[] args) {
        List<Dish> menu = Dish.menu;
        Map<Grouping.CaloricLevel, List<Dish>>
                dishesByCaloricLevel = menu.stream()
                .collect(Collectors.groupingBy(
                        dish->{
                            if(dish.getCalories()<=400)return Grouping.CaloricLevel.DIET;
                            else if (dish.getCalories()<=700) return Grouping.CaloricLevel.NORMAL;
                            else return Grouping.CaloricLevel.FAT;
                        }
                ));
        Map<Grouping.CaloricLevel, List<Dish>>  d= menu.stream().collect(Collectors.groupingBy(Dish::getCaloricLevel
        ));
        System.out.println(dishesByCaloricLevel.equals(d));
    }
}
