package MethodReference;
// the method reference is of the class of the data type passed as argument

@FunctionalInterface
interface Operation{
    int operate(String string);
}
public class ArbitraryMethodReference {

    static void main() {
        //Using lambda
        Operation o1 = (str) -> {
            return str.length();
        };
        System.out.println(o1.operate("Alamgir"));

        //using arbitrary method reference

        Operation o2 = String::length; //gives the length ; DataTypeClass::Method
        System.out.println(o2.operate("Alamgir"));

        Operation o3 = String::hashCode; // calls hashCode() from string class
        System.out.println(o3.operate("Alamgir"));



    }
}
