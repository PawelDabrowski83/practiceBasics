package pl.basics9.gui.wyklad.w05.ex03;

import pl.basics9.gui.wyklad.w03.selector.Student;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Student[] arr = {
                new Student("Sylvia", 2),
                new Student("Philipa", 67),
                new Student("Hugh", 535)
        };

        Stream.generate(Math::random)
            .limit(10)
            .forEach(System.out::println);

        Stream.iterate(1, elem -> elem + 2)
            .limit(10)
            .forEach(System.out::println);

        IntStream.range(3, 11)
            .forEach(System.out::println);

        Arrays.stream(new int[]{9, 8, 7})
            .forEach(System.out::println);

        List<Student> list = new LinkedList<>();
        list.add(new Student("Ala", 2));
        list.add(new Student("Bob", 12));
        list.add(new Student("Alan", 222));

        System.out.println(list);

        list.stream()
            .forEach(System.out::println);

//        list.parallelStream()

        Stream.iterate(1, el -> el + 1)
            .takeWhile(element -> element < 10)
            .forEach(System.out::println);

        Stream.iterate(1, el -> el + 1)
            .dropWhile(e -> e < 10)
            .limit(10)
            .forEach(System.out::println);

        List<Integer> list1 = Stream.iterate(1, el -> el + 1)
            .takeWhile(e1 -> e1 < 10)
            .dropWhile(e2 -> e2 < 5)
            .map(n -> 2 * n + 1)
            .collect(Collectors.toList());

        System.out.println(list1);
        //============================================








    }


}
