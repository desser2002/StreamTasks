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

//       Task 1:
//        List<Integer> numbers = Arrays.asList(2, 4, 6, 8);
//        MyStream<Integer> stream = new MyStream<>(numbers);
//        boolean allEven = stream.allMatch(n -> n % 2 == 0);
//        System.out.println(allEven);  // Wyjście: true

//       Task 2:
//        List<Integer> numbers = Arrays.asList(1, 3, 4, 5);
//        MyStream<Integer> stream = new MyStream<>(numbers);
//        boolean hasEven = stream.anyMatch(n -> n % 2 == 0);
//        System.out.println(hasEven);  // Wyjście: true

//       Task 3:
//        List<Integer> numbers = Arrays.asList(2, 4, 6, 9, 12);
//        MyStream<Integer> stream = new MyStream<>(numbers);
//        System.out.println("allMatch: " + stream.allMatch(x -> x%2 == 0));
//        System.out.println("anyMatch: " + stream.anyMatch(x -> x>10));

//       Task 4:
//        List<Integer> numbers = Arrays.asList(1, 3, 5, 7);
//        MyStream<Integer> stream = new MyStream<>(numbers);
//        boolean noneEven = stream.noneMatch(n -> n % 2 == 0);
//        System.out.println(noneEven);  // Wyjście: true

//       Task 5:
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
//        MyStream<Integer> stream = new MyStream<>(numbers);
//        int sum = stream.reduce(0, Integer::sum);
//        System.out.println(sum);  // Wyjście: 10

//        Task 6:
//        List<Integer> numbers = Arrays.asList(12, 15, 8, 22);
//        MyStream<Integer> stream = new MyStream<>(numbers);
//
//        System.out.println("Sum: " + stream.filter(n -> n > 10).reduce(0, Integer::sum));
//        System.out.println("Wynik noneMatch:: " + stream.noneMatch(n -> n < 5));

//        Task 7:
//        List<Integer> numbers = Arrays.asList(4, 2, 6, 1);
//        MyStream<Integer> stream = new MyStream<>(numbers);
//        Optional<Integer> minValue = stream.min(Integer::compareTo);
//        minValue.ifPresent(System.out::println);  // Wyjście: 1
//
//        Task 8:
//        List<Integer> numbers = Arrays.asList(4, 2, 6, 1);
//        MyStream<Integer> stream = new MyStream<>(numbers);
//        Optional<Integer> maxValue = stream.max(Integer::compareTo);
//        maxValue.ifPresent(System.out::println);  // Wyjście: 6

//        Task 9:
//        List<Integer> numbers = Arrays.asList(4, 2, 6, 1);
//        MyStream<Integer> stream = new MyStream<>(numbers);
//
//        Optional<Integer> minValue = stream.min(Integer::compareTo);
//        minValue.ifPresent(min -> System.out.println("Minimalna: " + min));
//
//        Optional<Integer> maxValue = stream.max(Integer::compareTo);
//        maxValue.ifPresent(max -> System.out.println("Maximalna: " + max));
//
//        int sum = stream.reduce(0, Integer::sum);
//        System.out.println("Suma: " + sum);

//        Task 10:
//        List<String> names = Arrays.asList("Anna", "Bartek", "Cecylia");
//        MyStream<String> stream = new MyStream<>(names);
//        stream.peek(System.out::println).toList();

//// Wyjście:
//// Anna
//// Bartek
//// Cecylia

//        Task 11:
//        List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
//        MyStream<List<Integer>> stream = new MyStream<>(numbers);
//        MyStream<Integer> flattened = stream.flatMap(list -> new MyStream<>(list));
//        List<Integer> result = flattened.toList();
//        System.out.println(result);  // Wyjście: [1, 2, 3, 4]

//        Task 12:
//        List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
//        MyStream<List<Integer>> stream = new MyStream<>(numbers);
//        MyStream <Integer> flattend = stream.flatMap(list-> new MyStream<>(list)).peek(element -> System.out.print(element+ " "));
//

//        Task 13:
//        List<String> names = Arrays.asList("Anna", "Bartek", "Cecylia");
//        MyStream<String> stream = new MyStream<>(names);
//        String result = stream.join(", ");
//        System.out.println(result);  // Wyjście: "Anna, Bartek, Cecylia"
//

//      Task 14.1:
//        List<Integer> numbers = Arrays.asList(12, 50, 70, 33);
//        MyStream<Integer> stream = new MyStream<>(numbers);
//
//        System.out.println("allMatch :" + stream.allMatch(n -> n > 0));
//        System.out.println("noneMatch:" + stream.noneMatch(n -> n > 100));

//       Task 14.2:
//        List<String> names = Arrays.asList("Anna", "Agnieszka", "Bartek", "Cecylia", "Adam");
//        MyStream<String> stream = new MyStream<>(names);
//
//        System.out.print(stream.filter(name -> name.startsWith("A")).map(String::toUpperCase).join(", "));

//        Task 14.3:
//        List <Integer> list = Arrays.asList(10,15,20,10);
//        MyStream <Integer> stream = new MyStream<>(list);
//
//        System.out.println("Suma: " + stream.reduce(0,Integer::sum));
//        System.out.println("Wynik noneMatch: " + stream.noneMatch(n->n>50));

//       Task 14.4:
//        List<Integer> list = Arrays.asList(3, 7, 9, 2, 8);
//
//        MyStream<Integer> stream = new MyStream<>(list);
//
//        Optional<Integer> minValue = stream.min(Integer::compareTo);
//        minValue.ifPresent(min -> System.out.println("Minimalna: " + min));
//
//        Optional<Integer> maxValue = stream.max(Integer::compareTo);
//        maxValue.ifPresent(max -> System.out.println("Maximalna: " + max));

//        Test 14.5:
//        List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1,2), Arrays.asList(3,4), Arrays.asList(5,6));
//        MyStream <List<Integer>> stream = new MyStream<>(numbers);
//
//        System.out.print("Drukowane elementy: ");
//        MyStream<Integer> flatten =stream.flatMap(list->new MyStream<>(list)).peek(n->System.out.print(n+" "));
//        System.out.print("\nSuma: "+ flatten.reduce(0,Integer::sum));

    }
}