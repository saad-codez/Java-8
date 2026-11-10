package FunctionalInterface;

import java.util.function.Supplier;

public class SupplierDemo {
    // takes no argument but returns a value
    // get() is used
    static void main() {
        Supplier<Integer> s1 = () -> (int)Math.pow(3,4); //returns 3^4
        System.out.println(s1.get()); // takes no input but returns value

        Supplier<String> s2 = () -> {
            String a = "Hi";
            String b = "I am Alamgir.";
            String c = "Nice to meet you!";
            return a + "\n" + b + "\n" + c;
        };
        System.out.println(s2.get());
    }
}
