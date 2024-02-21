package programacionFuncional;

import java.util.List;
import java.util.Random;
import java.util.function.*;

public class FP03FunctionalInterfaces2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;

        Function<Integer, Integer> squareFunction = x -> x * x;

        Function<Integer, String> stringOutputFunction = x -> x + " ";

        Consumer<Integer> sysroutConsumer = x -> System.out.println(x);

        BinaryOperator<Integer> sumBinaryOperator = (x, y) -> x + y;

        //No input > Return Something
        Supplier<Integer> randomIntegerSupplier = () -> {
            Random random = new Random();
            return random.nextInt(1000);
        };

        System.out.println(randomIntegerSupplier.get());

        UnaryOperator<Integer> unaryOperator = x -> 3 * x;

        System.out.println(unaryOperator.apply(10));
     }
}
