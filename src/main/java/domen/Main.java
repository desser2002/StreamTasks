package domen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        // Task 4:
        //   List<String> names = Arrays.asList("Anna", "Bartek", "Cecylia", "Dan");
        //   MyStream<String> stream = new MyStream<>(names);
        //   stream.filter(name -> name.length() > 4).map(String::toUpperCase).forEach(System.out::println);

        // Task 11:
        //   List<String> names = Arrays.asList("Daniel", "Anna", "Bartek", "Cecylia");
        //   MyStream<String> stream =  new MyStream<>(names);
        //   stream.sorted(String::compareTo).skip(2).forEach(System.out::println);

        // Task 13:
        //   List<Integer> numbers = Arrays.asList(5, 8, 12, 15, 22);
        //   MyStream<Integer> stream = new MyStream<>(numbers);
        //   stream.filter(n->n>10).map(n->n+5).findFirst().ifPresent(System.out::println);

        // Task 14:
        //   List<Integer> numbers = Arrays.asList(1, 6, 7, 8, 6, 9, 10);
        //   MyStream<Integer> stream = new MyStream<>(numbers);
        //   System.out.print(stream.distinct().filter(n->n>5).limit(3).count());

        // Task 15:
        //   List<String> names = Arrays.asList("Daniel", "Anna", "Bartek", "Cecylia","Ela");
        //   MyStream<String> stream = new MyStream<>(names);
        //   stream.sorted(String::compareTo).skip(3).findFirst().ifPresent(System.out::println);

        // Task 16:
        //  List<Integer> numbers = Arrays.asList(10, 30, 40, 60, 80);
        //  MyStream<Integer> stream = new MyStream<>(numbers);
        //  System.out.print(stream.map(n->n+20).filter(n->n>50).count());

        // Task 17:
        //  List<String> names = Arrays.asList("Anna", "Agnieszka", "Bartek", "Cecylia", "Adam");
        //  MyStream<String> stream = new MyStream<>(names);
        //  System.out.print(stream.filter(name -> name.startsWith("A")).map(String::toUpperCase).count());

    }
}