package part5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("Hello","World");

        List<String>l = words.stream().map(word->word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());



    }
}
