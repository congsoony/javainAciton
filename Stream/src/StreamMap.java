import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
    public static List<Dish> menu = Item.menu;

    public static void main(String[] args) {
        List<Integer> dishNamelengths = menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(Collectors.toList());


        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(3,4);
        List<int[]> pairs = list1.stream()
                .flatMap(i->list2.stream()
                        .filter(j->(i+j)%3==0)
                        .map(j->new int[]{i,j}))
                .collect(Collectors.toList());

        for(int i=0;i<pairs.size();i++){
            System.out.println(pairs.get(i)[0]+" "+pairs.get(i)[1]);
        }
    }
}
