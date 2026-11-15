package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {
    //filter(), map(), sorted()..
    // return stream
    // lazy loaded, because they return nothing unless a terminal operation(eagerly loaded) is performed
    // Lazy loading and eager loading
    static void main() {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        Stream<Integer> number = numbers.stream();
//        numbers.stream()
//                .filter((num) -> num % 2 == 0)// intermediate operation
//              //  .map((num)->num/2) // intermediate
//                .forEach((num) -> System.out.println(num)); //terminate

        // using count
        long count = numbers.stream()
                .filter((num) -> num % 2 == 0)// intermediate operation
                //  .map((num)->num/2) // intermediate
                .count(); //terminate
        System.out.println(count);

        // a stream once terminated cannot be reused. Terminal operations end the stream completely



    }

}
