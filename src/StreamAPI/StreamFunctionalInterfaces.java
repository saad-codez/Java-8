package StreamAPI;

//Stream is an interface
// it has multiple methods
// it works on functional programming
// we use it to filter the data

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StreamFunctionalInterfaces {
    static void main() {
        //Predicate
        Predicate<String> p = (name) -> name.isEmpty(); //checks if the string is empty
        System.out.println(p.test("Mohammed")); //returns false

        Function<String, Integer> f = (word) -> word.length(); //prints the length of the word
        System.out.println(f.apply("Alamgir"));

        Consumer<Integer> c = (age) -> System.out.println("I am " + age + " years old!"); // takes value but returns nothing
        c.accept(22);

        Supplier<String> s = () -> "Learning Stream API!"; // takes nothing but returns value
        System.out.println(s.get());


    }
}

