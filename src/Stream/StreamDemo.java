package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    // iteration strategy, filtering and mapping methods
    private static int sumStream(List<Integer> list) {
        return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
    }

    public static void main(String args[]) {
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 20; i++) myList.add(i);

        int sum = StreamDemo.sumStream(myList);
        System.out.println(sum);

        // Creating stream with stream.of()
        Stream<Integer> stream = Stream.of(1, 2, 3, 4);
        System.out.println(stream.mapToInt(i -> i).sum());

        //sequential stream
        Stream<Integer> sequentialStream = myList.stream();
        sequentialStream.forEach(integer -> System.out.println(integer));

        //parallel stream
        Stream<Integer> parallelStream = myList.parallelStream();
        parallelStream.forEach(System.out::println);
//
        // generate and iterate methods on stream
        Stream<String> stream1 = Stream.generate(() -> {return "abc";});
        stream1.limit(5).forEach(System.out::println);
        Stream<String> stream2 = Stream.iterate("xyz", (i) -> i);
        stream2.limit(5).forEach(System.out::println);
//
//
//        //Converting Java Stream to Collection or Array
//        Stream<Integer> intStream = Stream.of(1,2,3,4);
//        List<Integer> intList = intStream.collect(Collectors.toList());
//        System.out.println(intList); //prints [1, 2, 3, 4]
//
//        intStream = Stream.of(1,2,3,4); //stream is closed, so we need to create it again
//        Map<Integer,Integer> intMap = intStream.collect(Collectors.toMap(i -> i, i -> i+10));
//        System.out.println(intMap); //prints {1=11, 2=12, 3=13, 4=14}
//
//
//        //******************Java Stream Intermediate Operations**********************
//
//            //Stream filter() example
        Stream<Integer> filterStream = myList.stream();
        Stream<Integer> highNums = filterStream.filter(p -> p > 10);
        System.out.print("High Nums greater than 10 =");
        highNums.forEach(p -> System.out.println(p+" "));

            //Stream map() example
        Stream<String> names = Stream.of("aBc", "d", "ef");
        System.out.println(names.map(s -> {
            return s.toUpperCase();
        }).collect(Collectors.toList()));   //prints [ABC, D, EF]

            //Stream sorted() example
        Stream<String> names2 = Stream.of("aBc", "d", "ef", "123456");
        List<String> reverseSorted = names2.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSorted); // [ef, d, aBc, 123456]

        Stream<String> names3 = Stream.of("aBc", "d", "ef", "123456");
        List<String> naturalSorted = names3.sorted().collect(Collectors.toList());
        System.out.println(naturalSorted); //[123456, aBc, d, ef]
//
//
//        //********************Java Stream Terminal Operations************************
//
//            //Stream reduce() example
        Stream<Integer> numbers = Stream.of(1,2,3,4,5);

        Optional<Integer> intOptional = numbers.reduce((i, j) -> {return i*j;});
        if(intOptional.isPresent()) System.out.println("Multiplication = "+intOptional.get()); //120

            //Stream count() example
        Stream<Integer> numbers1 = Stream.of(1,2,3,4,5);

        System.out.println("Number of elements in stream="+numbers1.count());

            //Stream match() examples:
        Stream<Integer> numbers3 = Stream.of(1,2,3,4,5);
        System.out.println("Stream contains 4? "+numbers3.anyMatch(i -> i==4)); //Stream contains 4? true

        Stream<Integer> numbers4 = Stream.of(1,2,3,4,5);
        System.out.println("Stream contains all elements less than 10? "+numbers4.allMatch(i -> i<10)); //Stream contains all elements less than 10? true

        Stream<Integer> numbers5 = Stream.of(1,2,3,4,5);
        System.out.println("Stream doesn't contain 10? "+numbers5.noneMatch(i -> i==10)); //Stream doesn't contain 10? true

            //Stream findFirst() example
        Stream<String> names4 = Stream.of("Pankaj","Amit","David", "Lisa");
        Optional<String> firstNameWithD = names4.filter(i -> i.startsWith("D")).findFirst();
        if(firstNameWithD.isPresent()){
            System.out.println("First Name starting with D="+firstNameWithD.get()); //David
        }

    }
}
