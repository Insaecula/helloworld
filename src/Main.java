import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] arr = (" apple ","banana", "apple", "orange", "banana", "pear");
        Set<String> set = new LinkedHashSet<>(Arrays.asList(arr));
        String result = String.join(" ", set);
        System.out.println(result);
    }

}
