package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDataProcess {
    static void main() {
//        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5,6,7,8));
//        Stream<Integer> stream = list.stream();// stream() is used to convert collection to stream to perform operations
//        list.stream()
//                .filter((num) ->num%2==0) // predicate, checks a number be even and then prints
//                .map((numSqr) -> numSqr*numSqr) // function
//                .forEach((element)-> System.out.println(element));// uses Consumer this prints all the elements of the above stream(Arraylist)

        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15));

//        numbers.stream()
//                .map((number) -> number * number) //returns square
//                .forEach((number) -> System.out.println(number)); //prints the square numbers

        numbers.stream()
                .filter((num) -> num%2==0)
                .forEach((numb) -> System.out.println(numb));


    }

}
