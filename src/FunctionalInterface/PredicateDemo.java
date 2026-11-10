package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateDemo {
    // Take's an argument and returns a boolean value
    // Used in test condition cases
    static void main() {
    Predicate<Integer> p = (Number) -> { // let's check if a number is even or od
        if(Number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    };
        System.out.println(p.test(23)); // returns false
        System.out.println(p.test(24)); // returns true
        System.out.println(p.test(25)); // returns false

        // Let's try for string
        Predicate<String> ps = (string) -> { // let's check if a string is empty
            if(string.equals("")){
                return true;
            }
            else {
                return false;
            }
        };
        System.out.println(ps.test("Mohammed Saad")); // returns false as the string contains some value
        System.out.println(ps.test("")); // returns true since the string is empty
}
}
