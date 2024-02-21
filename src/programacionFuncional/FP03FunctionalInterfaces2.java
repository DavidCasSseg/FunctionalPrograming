package programacionFuncional;

import java.util.List;
import java.util.Random;
import java.util.function.*;

public class FP03FunctionalInterfaces2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

        Predicate<Integer> isEvenPredicate = (Integer x) -> x % 2 == 0;

        Function<Integer, Integer> squareFunction = x -> x * x;

        Function<Integer, String> stringOutputFunction = x -> x + " ";

        Consumer<Integer> sysoutConsumer = x -> System.out.println(x);

        BinaryOperator<Integer> sumBinaryOperator = (Integer x, Integer y) -> x + y;

        //No input > Return Something
        Supplier<Integer> randomIntegerSupplier = () -> {
            Random random = new Random();
            return random.nextInt(1000);
        };
        System.out.println(randomIntegerSupplier.get());

        //UnaryOperator
        UnaryOperator<Integer> unaryOperator = x -> 3 * x;
        System.out.println(unaryOperator.apply(10));

        //BiPredicate
        BiPredicate<Integer, String> biPredicate = (x,y) -> {
            return x < 10 && y.length() > 5;
        };
        System.out.println(biPredicate.test(5, "in28minutes"));

        //BiFunction
        BiFunction<Integer, String, String> biFunction = (number,str) -> {
            return number + " " + str;
        };
        System.out.println(biFunction.apply(15, "in28minutes"));

        //BiConsumer
        BiConsumer<Integer, String> biConsumer = (s1,s2) -> {
            System.out.println(s1);
            System.out.println(s2);
        };
        biConsumer.accept(15, "in28minutes");
     }

    //IntBinaryOperator
    IntBinaryOperator intBinaryOperator = (x,y) -> x + y;
    //IntConsumer
    //IntFunction
    //Int Predicate
    //IntSupplier
    //IntToDoubleFunction
    //IntToLongFunction
    //IntUnaryOperator
}
