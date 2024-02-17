package programacionFuncional;

import java.util.List;
import java.util.stream.Collectors;

public class CollectStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,5,7,9,3,3,45,6,87,4);
        List<Integer> doubleNumbers = doubleList(numbers);

        System.out.print(doubleNumbers + " ");
    }

    private static List<Integer> doubleList(List<Integer> numbers) {
//        return numbers.stream().map(n -> n*n).toList();
        return numbers.stream().map(n -> n*n).collect(Collectors.toList());
    }
}
