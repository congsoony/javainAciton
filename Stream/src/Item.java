import part4.Dish;

import java.util.Arrays;
import java.util.List;

public interface Item {
    List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("fries", true, 500, Dish.Type.OTHER),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("fruit", true, 120, Dish.Type.OTHER),
            new Dish("pizza", false, 600, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("salmon", false, 450, Dish.Type.FISH)
    );
    List<Dish> specialMenu = Arrays.asList(new Dish("seasonal fruit",true,120,Dish.Type.OTHER)
    ,new Dish("prawns",false,300,Dish.Type.FISH)
            ,new Dish("rice",true,350,Dish.Type.OTHER),
            new Dish("chicken",false,400,Dish.Type.MEAT)
            ,new Dish("french fries",true,100,Dish.Type.OTHER));



}


