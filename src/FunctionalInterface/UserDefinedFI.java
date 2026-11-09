package FunctionalInterface;
@FunctionalInterface
// an interface must have only one abstract method to be considered as Functional Interface
    // it can have multiple concrete methods
interface Greeting {
    void greet();
}
public class UserDefinedFI {

    static void main() {
        Greeting obj = () -> { // This is how we write functional interface
            System.out.println("Hi, Hello");
        };

        obj.greet(); // prints the above statement
    }
}
