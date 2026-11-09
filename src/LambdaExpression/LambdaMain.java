package LambdaExpression;

@FunctionalInterface
interface Animal {
    void makeSound(); // you must implement this.
}

// class Cat implements Animal{
//
//    @Override
//    public void makeSound(){
//        System.out.println("MEOW MEOW");
//    }
// }
//
// class Dog implements Animal {
//    @Override
//    public void makeSound(){
//        System.out.println("BHOW BHOW");
//    }
// }

public class LambdaMain {
    static void main() {

        //creating the object
       // Animal cat = new Animal(); // cannot create object of Animal class

        //Method 1 - creating child classes that implements the Animal class.
//        Animal cat = new Cat();
//        cat.makeSound(); // this gives up the result
//
//        Animal dog = new Dog();
//        dog.makeSound();

        //Method 2 - Anonymous inner class
//        Animal cat = new Animal() {
//            @Override
//            public void makeSound(){
//                System.out.println("MEOW MEOW");
//            }
//        };
//
//        Animal dog = new Animal(){
//          @Override
//          public void makeSound(){
//              System.out.println("BHOW BHOW");
//          }
//        };
//
//        cat.makeSound();
//        dog.makeSound();

        // Method 3 - Using Lambda Expression
        Animal cat =()-> System.out.println("MEOW MEOW");
        cat.makeSound();

        Animal dog = () -> System.out.println("BHOW BHOW");
        dog.makeSound();


    }
}
