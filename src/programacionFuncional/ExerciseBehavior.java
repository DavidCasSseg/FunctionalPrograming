package programacionFuncional;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExerciseBehavior {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(45,6,21,65,46,4,3,654);

        System.out.println(squaresNumbers(numbers));
        System.out.println(cubeNumbers(numbers));
        System.out.println(doubledNumbers(numbers));
    }

    private static List<Integer> squaresNumbers(List<Integer> numbers) {
        return getCollect(numbers, x -> x * x);
    }
    private static List<Integer> cubeNumbers(List<Integer> numbers) {
        return getCollect(numbers, x -> x * x *x);
    }

    private static List<Integer> doubledNumbers(List<Integer> numbers) {
        return getCollect(numbers, x -> x + x);
    }

    private static List<Integer> getCollect(List<Integer> numbers, Function<Integer, Integer> collectNumber) {
        return numbers.stream().map(collectNumber).collect(Collectors.toList());
    }
}
