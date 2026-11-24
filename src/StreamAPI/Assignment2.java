package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

// Create a list, convert it to Stream, process the data and convert it back to list
class Pokemon {
    private int id;
    private String name;
    private String dept;

    public Pokemon(int id, String name, String dept) {
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
        List<Pokemon> pokemonList = Arrays.asList(
                new Pokemon(1, "Charizard", "Computer Science"),
                new Pokemon(2, "Blastoise", "Data Science"),
                new Pokemon(3, "Venusaur", "Artificial Intelligence"),
                new Pokemon(4, "Pidgeot", "Machine Learning"),
                new Pokemon(5, "Pikachu", "Cyber Security"),
                new Pokemon(6, "Feraligator", "Machine Learning"),
                new Pokemon(7, "Mewto", "Artificial Intelligence")
        );

        Set<String> name = pokemonList.stream()
                .filter((students) -> students.getDept().equals("Artificial Intelligence"))
                .map((student) -> student.getName())
                .collect(Collectors.toSet()); // reverts the stream to list/set

        //converting it to map

        //defining the key and value
        Function<Pokemon, Integer> key = (student) -> student.getId(); //key
        Function<Pokemon, String> value = (student) -> student.getName(); //value


        Map<Integer, String> pokemonMap = pokemonList.stream()
                .collect(Collectors.toMap(key, value));


        System.out.println(pokemonMap); // prints answer as list/set


    }
}
