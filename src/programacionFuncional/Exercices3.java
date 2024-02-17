package programacionFuncional;

import java.util.List;

public class Exercices3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        List<String> courses = List.of("Spring","Spring Boot","Api"
                ,"Microservices","AWS","PCF","Azure","Docker","Kubernetes");

        System.out.println(FilterList(numbers));
        System.out.println(coursesListLengths(courses));
    }

    private static List<Integer> coursesListLengths(List<String> courses) {
        return courses.stream().map(String::length).toList();
    }

    private static List<Integer> FilterList(List<Integer> numbers) {
        return numbers.stream().filter(n-> n%2 == 0).toList();
    }
}
