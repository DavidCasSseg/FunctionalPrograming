package programacionFuncional;

import java.util.List;
import java.util.function.BinaryOperator;

public class Exercice4 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(54,21,654,54,2,11,654);

        System.out.println(findFunctionalInterface(numbers));
    }

    private static int findFunctionalInterface(List<Integer> numbers) {
        BinaryOperator<Integer> sum = Integer::sum;
        BinaryOperator<Integer> sum2 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        };

        return numbers.stream().reduce(0, sum);
    }
}
