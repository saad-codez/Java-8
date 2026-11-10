package FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo {
    // Takes an input but does not return a value
    static void main() {

        Consumer<String> c = (name) -> System.out.println("Hi, I am Alamgir, Nice to meet you "+ name); //returns string value
        c.accept("Mohammed"); //

        Consumer<Integer> ci = (age) -> System.out.println("I am "+ age + " years old."); // returns integer value
        ci.accept(22);

    }
}
