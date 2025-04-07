import java.util.Arrays;
import java.util.List;

public class JoinStrings {

    public static void joinStirngWithDelimitar(List<String> list) {

        String result = list.stream()
                .reduce("", (str1,str2) ->str1 + str2 + ",");

        if (result.endsWith(",")) {
            result += result.substring(0,result.length() - 1);
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        List<String> str = Arrays.asList("java","python", "c++", "Kotlin", "scala");

        joinStirngWithDelimitar(str);
    }
}
