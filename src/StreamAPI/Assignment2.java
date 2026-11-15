package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// Create a list, convert it to Stream, process the data and convert it back to list
class Students {
    private int id;
    private String name;
    private String dept;

    public Students(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public String getDept() {
        return dept;
    }

    public String getName() {
        return name;
    }
}

public class Assignment2 {
    static void main() {
        List<Students> studentsList = Arrays.asList(
                new Students(1,"Charizard", "Computer Science"),
                new Students(2,"Blastoise", "Data Science"),
                new Students(3, "Venusaur","Artificial Intelligence"),
                new Students(4, "Pidgeot", "Machine Learning"),
                new Students(5, "Pikachu", "Cyber Security") ,
        new Students(6, "Feraligator", "Machine Learning"),
                new Students(7, "Mewto", "Artificial Intelligence")
        );

        Set<String> name = studentsList.stream()
                .filter((students) -> students.getDept().equals("Artificial Intelligence"))
                .map((student)-> student.getName())
                .collect(Collectors.toSet()); // reverts the stream to list/set



        System.out.println(name); // prints answer as list/set



    }
}
