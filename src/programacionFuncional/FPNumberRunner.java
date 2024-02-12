package programacionFuncional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class UsingPredicate implements Predicate<Integer>{

    @Override
    public boolean test(Integer number) {
        return number%2 != 0;
    }
}

class UsingForEach implements Consumer<Integer> {

    @Override
    public void accept(Integer number) {
        System.out.println(number);
    }
}

public class FPNumberRunner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,6,8,13,3,15);
        List<String> animals = List.of("Ant", "Bat", "Cat", "Dog", "Elephant");
//        System.out.println(setNumbers(numbers));
//        System.out.println(sumWhitFP(numbers));
//        System.out.println(max(numbers));
//
//        ArrayList<Integer> list = new ArrayList<>();
//        list.addAll(oddNumbers(numbers));
//        list.addAll(evenNumbers(numbers));
//        System.out.println(list);
//
//        System.out.println(setNumbers(numbers));
        oddNumbersBS(numbers);
        animalsLength(animals);
        System.out.println(filterMax(numbers));
    }

    private static int sumWhitFP(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0,(number1, number2) -> number1 + number2);
    }
    private static int setNumbers(List<Integer> numbers) {
        int sum = 0;
        for(int numero : numbers){
            sum += numero; //mutation
        }
        return sum;
    }
    private static int max(List<Integer> numbers){
        return numbers.stream().max((n1,n2) -> Integer.compare(n1,n2)).get();
    }
    private static List<Integer> oddNumbers(List<Integer> numbers){
        return numbers.stream()
                .filter(n -> n%2 != 0)
                .collect(Collectors.toList());
    }
    private static void oddNumbersBS(List<Integer> numbers){
        numbers.stream()
                .filter(new UsingPredicate())
                .forEach(new UsingForEach());
    }
    private static List<Integer> evenNumbers(List<Integer> numbers){
        return numbers.stream()
                .filter(n -> n%2 == 0)
                .collect(Collectors.toList());
    }
    private static List<Integer> squareNumbers(List<Integer> numbers){
        return IntStream.range(1,11)
                .map(e -> e * e)
                .boxed()
                .collect(Collectors.toList());
    }
    private static void animalsLength(List<String> animals){
        animals.stream().map(String::length).forEach(System.out::println );
    }
    private static int filterMax(List<Integer> numbers){
        return numbers.stream()
                .filter(FPNumberRunner::filter)
                .max(Integer::compare)
                .orElse(0);
    }
    private static boolean filter(Integer number){
        return number%2==0;
    }
}
