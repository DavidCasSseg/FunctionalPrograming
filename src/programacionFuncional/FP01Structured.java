package programacionFuncional;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        List<String> courses = List.of("Spring","Spring Boot","Api","Microservices","Aws","PCF","Azure","Docker","Kubernetes");

//        printAllNumbersInListStructured(numbers);
//        System.out.println();
//        printEvenNumbers(numbers);
//        printOddNumbers(numbers);
        printAllCourses(courses);
        System.out.println();
        printCoursesSpring(courses);
        System.out.println();
        printLittleLengthCourses(courses);
    }

    private static void printLittleLengthCourses(List<String> courses) {
        courses.stream().filter(c -> c.length() >= 4)
                .forEach(System.out::println);
    }

    private static void printCoursesSpring(List<String> courses) {
        courses.stream().filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printAllCourses(List<String> courses) {
        courses.stream().forEach(System.out::println);
    }
    //    private static void print(int number){
//        System.out.print(number + " ");
//    }
    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        //How to loop the numbers
//        for(int number:numbers){
//            System.out.println(number);
//        }
//        numbers.stream().forEach(FP01Structured::print);
        numbers.stream().forEach(n -> System.out.print(n + " "));
    }
    private static void printEvenNumbers(List<Integer> numbers){
        numbers.stream().filter(n -> n%2 == 0)
                .forEach(n -> System.out.print(n + " "));
    }
    private static void printOddNumbers(List<Integer> numbers){
        numbers.stream()
                .filter(n -> n!= 0)
                .forEach(n -> System.out.println(n + " "));
    }
}
