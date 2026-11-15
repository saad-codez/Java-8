package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelStreams {
    // uses multiple threads to iterate parallel
    static void main() {

        List<String> students = new ArrayList<>(Arrays.asList(
                "Alamgir",
                "Mohammed",
                "Prince",
                "Muwahhid",
                "Fatimah",
                "Abu Bakr",
                "Umar",
                "Usman",
                "Ali",
                "Zainab",
                "Khadija",
                "Kulsum",
                "Ruqayyah"
        ));

        students.stream().filter((student) -> student.contains("a"))
                .forEach((std) -> System.out.println(std));
    }
}
