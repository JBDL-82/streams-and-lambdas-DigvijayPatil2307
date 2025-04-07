import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void removeDuplicate(List<Integer> list) {

        List<Integer> uniqueNum = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueNum);
    }

    public static void removeDuplicate2(List<Integer> list) {

        /**
         * 1] convert list -> set
         * 2] againg set -> list
         */

        List<Integer> uniqueNum = list.stream()
                .collect(Collectors.toSet())
                .stream()
                .collect(Collectors.toList());
        System.out.println(uniqueNum);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,1,2,2,2,3,3,4,5,5);

        removeDuplicate(list); // approach no. 1
//        removeDuplicate2(list); // approach no.2
    }
}
