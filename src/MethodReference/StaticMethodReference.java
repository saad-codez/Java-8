package MethodReference;

// Method reference can be done only in 2 conditions,
// 1. It has only one expression
// 2. It has Method class inside that statement

@FunctionalInterface
interface Calculator{
    public int calculate(int a, int b); // must be overridden
}

class Maths {
     public static int add(int a , int b) {
         return a + b;
     }
}
public class StaticMethodReference {
    static void main() {
        Calculator calci = (a, b) -> a * b;
        System.out.println(calci.calculate(4,8)); // using lambda

        Calculator c2 = Maths::add; // directly call the class and it's method; // it is static method reference
        System.out.println(c2.calculate(5, 5));
    }
}
