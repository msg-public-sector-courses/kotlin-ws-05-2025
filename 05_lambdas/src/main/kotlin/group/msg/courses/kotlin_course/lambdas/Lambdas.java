package group.msg.courses.kotlin_course.lambdas;

import java.util.List;

public class Lambdas {
    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4, 5, 6 ,7, 8);
        var evens = list.stream().filter(element -> element % 2 == 0);
        System.out.println(evens);
    }
}
