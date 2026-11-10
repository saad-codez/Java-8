package MethodReference;

public class InstanceMethodReference {
    static void main() {

        Maths maths = new Maths(); //creating an object, instance of Maths class
        Calculator c1 = maths::multiply; // calling instance method
        System.out.println(c1.calculate(2,3));
    }
}
