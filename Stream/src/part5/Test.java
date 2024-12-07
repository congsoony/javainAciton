package part5;

import part4.Dish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Dish> menu = Dish.menu;

        List<Dish> meat = menu.stream()
                .filter(dish -> Dish.Type.MEAT.equals(dish.getType()))
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(meat);


        //5-2quiz

        List<Integer>l = Arrays.asList(1,2,3,4,5);
        List<Integer> res = l.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(res);

        //5-2-2 quiz
        List<Integer> a = Arrays.asList(1,2,3);
        List<Integer> b = Arrays.asList(3,4);
        List<int []>result = a.stream()
                .flatMap(i->b.stream().map(j->new int[]{i,j}))
                .filter(i->(i[0]+i[1])%3==0)
                .collect(Collectors.toList());
        for(int[] t:result){
            System.out.println(t[0]+" "+t[1]);
        }

        menu.stream().map(d->1).reduce(0,Integer::sum);

        int totalcalories = menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();
        System.out.println(totalcalories);


    }
}
