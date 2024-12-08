package part6;

import part4.Dish;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Partitioning {
    public static void main(String[] args) {
        List<Dish> menu = Dish.menu;

        Map<Boolean,Map<Dish.Type,List<Dish>>> vegetarianDishesByType = menu.stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian,Collectors.groupingBy(Dish::getType)));

        Map<Boolean,Map<Dish.Type,List<Dish>>> vegetarianDishesByType2 = menu.stream()
                .collect(Collectors.groupingBy(Dish::isVegetarian,Collectors.groupingBy(Dish::getType)));

        System.out.println(vegetarianDishesByType);
        System.out.println(vegetarianDishesByType.equals(vegetarianDishesByType2));

        System.out.println("----------------");
        Map<Boolean,List<Integer>> primelist = paritionPrimes(10);
        System.out.println(primelist);
    }

    public static boolean isPrime(int candidate){
        int candidateRoot=(int)Math.sqrt((double)candidate);
        return IntStream.rangeClosed(2,candidateRoot).noneMatch(i->candidate%i==0);
    }
    public static Map<Boolean,List<Integer>>paritionPrimes(int n ){
        return IntStream.rangeClosed(2,n).boxed()
                .collect(Collectors.partitioningBy(candidate ->isPrime(candidate)));
    }
}
