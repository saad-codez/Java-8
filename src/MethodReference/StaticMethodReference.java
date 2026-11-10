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

    public int multiply(int x, int y) {
         return x*y;
    }
}
public class StaticMethodReference {
    static void main() {
      //  Calculator calci = (a, b) -> a * b; //method 1
        Calculator c1 = (a, b) -> { // method 2
            return a*b;
        };
        System.out.println(c1.calculate(4,8)); // using lambda

        Calculator c2 = Maths::add; // directly call the class and it's method; // it is static method reference
        System.out.println(c2.calculate(5, 5));
    }
}
