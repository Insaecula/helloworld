import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static List<Integer> process(int[] arr) {
        return IntStream.of(arr)
                .map(n -> % 2 == 0 ? n + 1 : n)
                .skip(2)
                .limit(5)
                .boxed()
                .toList();
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6, 8, 10, 12};
        System.out.println(process(nums));
    }
}