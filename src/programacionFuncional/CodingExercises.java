package programacionFuncional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodingExercises {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
        List<String> words = List.of("Math","English","History","Physics");
        System.out.println(filterOddNumers(numbers));
        System.out.println(getCubesOfFirstNNumbers(0));
        System.out.println(getCoursesNameCharacterCount(words));
        System.out.println(sumOfSquares(numbers));
        System.out.println(findMaxEvenNumber(numbers));
    }
    public static List<Integer> filterOddNumers(List<Integer> numbers){
        return numbers.stream().filter(n -> n%2 != 0)
                .collect(Collectors.toList());
    }
    public static List<Integer> getCubesOfFirstNNumbers(int n){
        return IntStream.range(1, n+1)
                .map(x -> x*x*x).boxed()
                .collect(Collectors.toList());
    }
    public static List<Integer> getCoursesNameCharacterCount(List<String> courses){
        if(courses == null || courses.isEmpty()){
            return List.of();
        }
        return courses.stream().map(String::length).collect(Collectors.toList());
    }
    public static long sumOfSquares(List<Integer> numbers){
        if(numbers == null){
            return 0;
        }
        return numbers.stream().mapToLong(n -> n*n).sum();
    }
    public static int findMaxEvenNumber(List<Integer> numbers){
        if(numbers == null){
            return 0;
        }
        return numbers.stream()
                .filter(n -> n%2==0)
                .max(Integer::compare)
                .orElse(0);
    }
}
