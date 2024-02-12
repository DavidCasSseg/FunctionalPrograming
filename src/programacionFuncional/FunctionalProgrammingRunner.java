package programacionFuncional;
import java.util.List;

public class FunctionalProgrammingRunner {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
        List<Integer> list1 = List.of(1,2,3,4,5,6,7,8);
        printBasic(list);
        System.out.println();
        printWithFP(list);
        printBasicWhitFiltering(list);
        System.out.println();
        printWithFPWithFiltering(list);
        printOddNumbers(list1);
        System.out.println();
        printPairNumbers(list1);
    }
    private static void printBasic(List<String> list) {
        for(String string : list){
            System.out.println(string);
        }
    }
    private static void printBasicWhitFiltering(List<String> list) {
        for(String string : list){
            if(string.endsWith("at")){
                System.out.println(string);
            }
        }
    }
    private static void printWithFP(List<String> list){
        list.stream().forEach(element -> System.out.println(element));
    }
    private static void printWithFPWithFiltering(List<String> list){
        list.stream()
                .filter(element -> element.endsWith("at"))
                .forEach(element -> System.out.println(element));
    }
    private static void printOddNumbers(List<Integer> list){
        list.stream().filter(element -> element%2 != 0).forEach(element -> System.out.println(element));
    }
    private static void printPairNumbers(List<Integer> list){
        list.stream()
                .filter(element -> element%2 == 0)
                .forEach(element -> System.out.println(element));
    }
}
