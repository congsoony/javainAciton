package part5;

import part4.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhile {
    public static void main(String[] args) {
        List<Dish> specialMenu = Arrays.asList(
                new Dish("seasonal fruit",true,120,Dish.Type.OTHER),
                new Dish("prawns",false,300,Dish.Type.FISH),
                new Dish("rice",true,350,Dish.Type.OTHER),
                new Dish("chicken",false,400,Dish.Type.MEAT),
                new Dish("french fries",true,530,Dish.Type.OTHER)
        );
        //320 보다 작은 칼리로만 필터하고싶을때
        List<Dish> filteredMenu  = specialMenu.stream().
                filter(d->d.getCalories()<320)
                .collect(Collectors.toList());

        //칼로리가 정렬된 상태라면 takewhile로 슬라이스가능

        List<Dish> sliceMenu1 = specialMenu.stream()
                .takeWhile(dish -> dish.getCalories()<320)
                .collect(Collectors.toList());

        //dropwhile 은 takewhile의 정반대 320이상인 칼로리에서 슬라이스
        List<Dish> sliceMenu2 = specialMenu.stream()
                .dropWhile(dish -> dish.getCalories()<320)
                .collect(Collectors.toList());


        System.out.println(filteredMenu);
        System.out.println(sliceMenu1);
        System.out.println(sliceMenu2);

        List<Integer> sortedList = List.of(1, 2, 3, 5, 2, 5, 6, 5, 7);

// Using takeWhile
        List<Integer> result1 = sortedList.stream()
                .takeWhile(x -> {
                    System.out.println("takewhile : "+x);
                    return x<=5;
                })
                .collect(Collectors.toList());
        System.out.println(result1);


    }
}
