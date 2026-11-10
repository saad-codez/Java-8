package FunctionalInterface;

import java.util.function.Function;

public class FunctionDemo {
    static void main() {
        // Takes an input of one type and gives output of different type.

        Function<String, Integer> f1 = (str) -> str.length(); // returns the length of given string
        System.out.println(f1.apply("Alamgir"));

        Function<Integer, Integer> f2 = (num) -> num*num; // returns the square of a number
        System.out.println(f2.apply(6));
    }
}
