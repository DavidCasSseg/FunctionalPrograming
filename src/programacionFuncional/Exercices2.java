package programacionFuncional;

import javax.print.attribute.IntegerSyntax;
import java.util.List;

public class Exercices2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

        System.out.print(squareAndSum(numbers) + " ");
        System.out.println();
        System.out.print(cubesAndSum(numbers) + " ");
        System.out.println();
        System.out.println(sumOddNumbers(numbers));
    }

    private static int sumOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n%2!=0)
                .reduce(0, Integer::sum);
    }

    private static int cubesAndSum(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n*n*n)
                .reduce(0, Integer::sum);
    }

    private static int squareAndSum(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n*n)
                .reduce(0, Integer::sum);
    }
}
