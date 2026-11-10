package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateDemo {
    // Take's an argument and returns a boolean value
    // Used in test condition cases
    static void main() {
        // let's check if a number is even or odd
        Predicate<Integer> p = (Number) -> Number % 2 == 0; // since it is only one line, we can give make it short

        System.out.println(p.test(23)); // returns false
        System.out.println(p.test(24)); // returns true
        System.out.println(p.test(25)); // returns false

        // Let's try for string
        Predicate<String> ps = (string) -> string.isEmpty(); // let's check if a string is empty

        System.out.println(ps.test("Mohammed Saad")); // returns false as the string contains some value
        System.out.println(ps.test("")); // returns true since the string is empty
    }
}
