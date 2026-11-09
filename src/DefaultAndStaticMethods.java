interface Vehicle {
   // void add(); // this is default method, // classes that implements this interface must override this method

     static void add(int a, int b){ // static method can contain method body
        System.out.println(a+b);
    }

    default void start(){
        System.out.println("Vehicle Starts");
    }
}

class Car implements Vehicle {

// Car implements the default start() from the Vehicle class

}


public class DefaultAndStaticMethods {
    static void main() {

        Vehicle.add(10, 5); // static method in interface

        Car car = new Car();
        car.start(); // default method in interface

    }
}
