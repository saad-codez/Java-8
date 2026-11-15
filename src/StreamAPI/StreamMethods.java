package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethods {
    //findFirst(): terminal method, returns the first element of the string
    //findAny(): terminal method, finds any element
    //anyMatch(): terminal method, checks if any element present matches the given condition
    //allMatch(): terminal method, checks if all the elements matches the given condition
    //noneMatch(): terminal method, checks if non matches the condition
    //sorted(): intermediate method, returns stream in sorted order
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
//       boolean valueIsPresent = names.stream()
//                .anyMatch((name) -> name.startsWith("X"));
//        System.out.println(valueIsPresent);// returns false

        //allMatch
//        boolean valueIsPresent = names.stream()
//                .allMatch((name) -> name.length()>1); // checks if length is greater than 1
//        System.out.println(valueIsPresent);// returns true

        //noneMatch
//        boolean valueIsPresent = names.stream()
//                .noneMatch((name) -> name.length()>1); // checks if length is greater than 1
//        System.out.println(valueIsPresent);// returns false

        //sorted
        names.stream().sorted().forEach((name)-> System.out.println(name)); // sorts in alphabetic order


    }
}
