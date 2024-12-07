package part6;

import part4.Dish;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Joining {
    public static void main(String[] args) {
        List< Dish> menu =Dish.menu;
        String shortMenu = menu.stream().map(Dish::getName).collect(Collectors.joining(","));

        System.out.println(shortMenu);


        int totalCalories = menu.stream().collect(Collectors.reducing(0,Dish::getCalories,(i,j)->(i+j)));
        System.out.println(totalCalories);

        Optional<Dish> mostCalorieDish = menu.stream().collect(Collectors.reducing((d1,d2)->d1.getCalories()>d2.getCalories()?d1:d2));

        System.out.println(mostCalorieDish.get());
    }
}
