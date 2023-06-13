import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(Color.GREEN,80),new Apple(Color.GREEN,155),new Apple(Color.RED,120));

        List<Apple> heavyApples = filterApples(inventory,new AppleHeavyWeightPredicate());
        List<Apple>greenApples = filterApples(inventory,new AppleGREE)
    }



    public static List<Apple> filterApples(List<Apple> inventory,ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    public static enum Color {RED,GREEN}
}
