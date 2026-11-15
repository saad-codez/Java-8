package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethods {
    //findFirst(): terminal method, returns the first element of the string
    //findAny(): terminal method, finds any element
    //anyMatch(): terminal method, checks if any element present matches the given condition
    //allMatch()
    //noneMatch()
    //sorted()
    static void main() {
        List<String> names = Arrays.asList("Alamgir", "Muwahhid", "Prince", "Nijat", "Nijaz");
        // findFirst()
//        Optional<String> first = names.stream().findFirst();
//        System.out.println(first.get()); //prints the first name

        //using with a condition
//        Optional<String> first = names.stream()
//                .filter((name) -> name.startsWith("P")) // checks if the string starts with P
//                .findFirst();
//        System.out.println(first.get()); //prints the first name

        //findAny()
//        Optional<String> first = names.stream()
//                .filter((name) -> name.startsWith("N"))
//                .findAny();
//        System.out.println(first.get());

        //anyMatch
        names.stream()
                .anyMatch((name) -> name.startsWith("X"));// returns false



    }
}
