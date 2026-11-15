package StreamAPI;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreams {
    // int = IntStream
    // long = LongStream
    // double = DoubleStream
    static void main() {

        //IntStream

        IntStream intStream1 = IntStream.range(1, 6); // 1,2,3,4,5
        OptionalDouble average = intStream1.average(); // average
        System.out.println(average.getAsDouble()); // prints the average as double

        IntStream intStream2 = IntStream.range(1, 6); // 1,2,3,4,5
        int sum = intStream2.sum(); // sum
        System.out.println((sum)); // prints the average as double

        //DoubleStream

        DoubleStream doubleStream = DoubleStream.of(5.8, 5.61, 7.2, 5.45,9.1, 4.39);
        System.out.println(doubleStream.average().getAsDouble());

        //LongStream
        LongStream longStream = LongStream.of(32343, 2343, 234324, 2535, 643, 6345345);
        System.out.println(longStream.average().getAsDouble());


    }
}
