package programacionFuncional;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course{
    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudents;

    public Course(String name, String category, int reviewScore, int noOfStudents) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }
    @Override
    public String toString() {
        return  name + ':' +
                 category + ':' +
                 reviewScore + ':' +
                 noOfStudents;
    }
}

public class FP04CustomClass {
    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000),
                new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000),
                new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000),
                new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000)
        );

        //allMatch, noneMatch, anyMatch
        Predicate<Course> reviewScoreGretaerThan95 = c -> c.getReviewScore() > 95;
        Predicate<Course> reviewScoreGretaerThan90 = c -> c.getReviewScore() > 90;
        Predicate<Course> reviewScoreLessThan90 = c -> c.getReviewScore() < 90;

        Predicate<Course> noOfStudentsGreaterThan15000 = c -> c.getNoOfStudents() > 15000;
        Predicate<Course> noOfStudentsGreaterThan20000 = c -> c.getNoOfStudents() > 20000;
        Predicate<Course> noOfStudentsLessThan10000 = c -> c.getNoOfStudents() < 10000;

        System.out.println(courses.stream().allMatch(reviewScoreGretaerThan95));
        System.out.println(courses.stream().noneMatch(reviewScoreLessThan90));
        System.out.println(courses.stream().anyMatch(reviewScoreLessThan90));
        System.out.println(courses.stream().anyMatch(reviewScoreGretaerThan95));

        System.out.println(courses.stream().allMatch(noOfStudentsGreaterThan15000));
        System.out.println(courses.stream().noneMatch(noOfStudentsGreaterThan15000));
        System.out.println(courses.stream().anyMatch(noOfStudentsGreaterThan20000));
        System.out.println(courses.stream().anyMatch(noOfStudentsLessThan10000));

        Comparator<Course> comparingByStudentsInc = Comparator.comparingInt(Course::getNoOfStudents);
        System.out.println(courses.stream().sorted(comparingByStudentsInc).toList());
        //[Course{name='FullStack', category='FullStack', reviewScore=91, noOfStudents=14000}, Course{name='Spring Boot', category='Framework', reviewScore=95, noOfStudents=18000}, Course{name='Spring', category='Framework', reviewScore=98, noOfStudents=20000}, Course{name='Docker', category='Cloud', reviewScore=92, noOfStudents=20000}, Course{name='Kubernetes', category='Cloud', reviewScore=91, noOfStudents=20000}, Course{name='AWS', category='Cloud', reviewScore=92, noOfStudents=21000}, Course{name='Azure', category='Cloud', reviewScore=99, noOfStudents=21000}, Course{name='API', category='Microservices', reviewScore=97, noOfStudents=22000}, Course{name='Microservices', category='Microservices', reviewScore=96, noOfStudents=25000}]

        Comparator<Course> comparingByStudentsDec = Comparator.comparingInt(Course::getNoOfStudents).reversed();
        System.out.println(courses.stream().sorted(comparingByStudentsDec).toList());
        //[Course{name='Microservices', category='Microservices', reviewScore=96, noOfStudents=25000}, Course{name='API', category='Microservices', reviewScore=97, noOfStudents=22000}, Course{name='AWS', category='Cloud', reviewScore=92, noOfStudents=21000}, Course{name='Azure', category='Cloud', reviewScore=99, noOfStudents=21000}, Course{name='Spring', category='Framework', reviewScore=98, noOfStudents=20000}, Course{name='Docker', category='Cloud', reviewScore=92, noOfStudents=20000}, Course{name='Kubernetes', category='Cloud', reviewScore=91, noOfStudents=20000}, Course{name='Spring Boot', category='Framework', reviewScore=95, noOfStudents=18000}, Course{name='FullStack', category='FullStack', reviewScore=91, noOfStudents=14000}]

        Comparator<Course> comparingByStudentsAndScore = Comparator.comparingInt(Course::getNoOfStudents).thenComparingInt(Course::getReviewScore).reversed();
        System.out.println(courses.stream().sorted(comparingByStudentsAndScore).limit(5).collect(Collectors.toList()));
        //[Course{name='Microservices', category='Microservices', reviewScore=96, noOfStudents=25000}, Course{name='API', category='Microservices', reviewScore=97, noOfStudents=22000}, Course{name='Azure', category='Cloud', reviewScore=99, noOfStudents=21000}, Course{name='AWS', category='Cloud', reviewScore=92, noOfStudents=21000}, Course{name='Spring', category='Framework', reviewScore=98, noOfStudents=20000}, Course{name='Docker', category='Cloud', reviewScore=92, noOfStudents=20000}, Course{name='Kubernetes', category='Cloud', reviewScore=91, noOfStudents=20000}, Course{name='Spring Boot', category='Framework', reviewScore=95, noOfStudents=18000}, Course{name='FullStack', category='FullStack', reviewScore=91, noOfStudents=14000}]

        System.out.println(courses.stream().sorted(comparingByStudentsAndScore).skip(3).limit(5).collect(Collectors.toList()));

        System.out.println(courses.stream()
                .sorted(comparingByStudentsAndScore)
                .takeWhile(c -> c.getReviewScore() >= 95)
                .collect(Collectors.toList())
        );

        System.out.println(courses.stream()
                .sorted(comparingByStudentsAndScore)
                .dropWhile(c -> c.getReviewScore() >= 95)
                .collect(Collectors.toList())
        );

        System.out.println(courses.stream().max(comparingByStudentsAndScore));
        System.out.println(courses.stream().min(comparingByStudentsAndScore));

        System.out.println(courses.stream()
                        .filter(reviewScoreLessThan90)
                        .min(comparingByStudentsAndScore)
                        .orElse(new Course("Kubernetes", "Cloud", 91, 20000))
                );

        System.out.println(
                courses.stream()
                        .filter(reviewScoreLessThan90)
                        .findFirst()
        );

        System.out.println(
                courses.stream()
                        .filter(reviewScoreLessThan90)
                        .findAny()
        );

        System.out.println(
                courses.stream()
                        .mapToInt(Course::getNoOfStudents)
                        .sum()
        );

        System.out.println(
                courses.stream()
                        .mapToInt(Course::getNoOfStudents)
                        .average()
        );

        System.out.println(
                courses.stream()
                        .filter(reviewScoreGretaerThan95)
                        .mapToInt(Course::getNoOfStudents)
                        .count()
        );

        System.out.println(
                courses.stream()
                        .filter(reviewScoreGretaerThan95)
                        .mapToInt(Course::getNoOfStudents)
                        .max()
        );

        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory))
        );
        //{Cloud=[Course{name='AWS', category='Cloud', reviewScore=92, noOfStudents=21000}, Course{name='Azure', category='Cloud', reviewScore=99, noOfStudents=21000}, Course{name='Docker', category='Cloud', reviewScore=92, noOfStudents=20000}, Course{name='Kubernetes', category='Cloud', reviewScore=91, noOfStudents=20000}], FullStack=[Course{name='FullStack', category='FullStack', reviewScore=91, noOfStudents=14000}], Microservices=[Course{name='API', category='Microservices', reviewScore=97, noOfStudents=22000}, Course{name='Microservices', category='Microservices', reviewScore=96, noOfStudents=25000}], Framework=[Course{name='Spring', category='Framework', reviewScore=98, noOfStudents=20000}, Course{name='Spring Boot', category='Framework', reviewScore=95, noOfStudents=18000}]}
        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory, Collectors.counting()))
        );
        //{Cloud=4, FullStack=1, Microservices=2, Framework=2}

        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory,
                                Collectors.maxBy(Comparator.comparing(Course::getReviewScore))))
        );
        //{Cloud=Optional[Azure:Cloud:99:21000], FullStack=Optional[FullStack:FullStack:91:14000], Microservices=Optional[API:Microservices:97:22000], Framework=Optional[Spring:Framework:98:20000]}

        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory,
                                Collectors.mapping(Course::getName, Collectors.toList())))
        );
        //{Cloud=[AWS, Azure, Docker, Kubernetes], FullStack=[FullStack], Microservices=[API, Microservices], Framework=[Spring, Spring Boot]}


    }
}
