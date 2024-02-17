package programacionFuncional;

import java.util.List;
import java.util.function.Predicate;

public class FP03BhaviorParameterization {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5,65,1,1,64,65,4,1,654,64,1);

        filterAndPrint(numbers, x1 -> x1 % 2 == 0);

        filterAndPrint(numbers, x -> x % 2 != 0);

        filterAndPrint(numbers, x -> x % 3 == 0);
    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}
