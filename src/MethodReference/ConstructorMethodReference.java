package MethodReference;

import org.w3c.dom.ls.LSOutput;

interface Creator<T> { //using generic
    T create(String obj); // returns T type, which we will specify at the time or returning
}

class User {
    String name;

    public User(String name) {
        this.name = name;
    }
}

class Product {
    String productName;

    public Product(String productName){
        this.productName = productName;

    }
}

public class ConstructorMethodReference {
    // Used when we call a constructor to create an object
    static void main() {

        // Using Lambda
        Creator<User> c1 = (name) -> {
            return new User(name);
        };
        User u1 = c1.create("Mohammed Saad");
        System.out.println(u1.name); // prints the name


        Creator<User> c2 = User::new;
        User u2 = c2.create("Alamgir");// prints the name
        System.out.println(u2.name);

        Creator<Product> c3 = (productName) -> {
            return new Product(productName);
        };
        Product p1 = c3.create("MacBook");
        System.out.println(p1.productName);

        Creator<Product> c4 = Product::new;
        Product p2 = c4.create("Earbuds");
        System.out.println(p2.productName);

    }
}

