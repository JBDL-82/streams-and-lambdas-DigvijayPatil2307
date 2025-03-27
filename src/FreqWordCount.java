import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FreqWordCount {

    public static void countFrequency(List<String> list) {

       Map<String, Long> countList =  list.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println(countList);
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana","apple","mango","mango","banana","apple","apple");

        countFrequency(words);
    }
}
