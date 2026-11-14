package OptionalClass;

import java.util.Arrays;
import java.util.List;

class Book {
    private String name;
    private int id;

    public Book(String Name, int ID) {
        name = Name;
        id = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


class Library {

    public Book getBookDetails(int id) {
        List<Book> books = Arrays.asList(new Book("Atomic Habits", 1), new Book("Never Split The Difference", 2), new Book("Deep Work", 3));

        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

}


public class OCExample {
    static void main() {
        Library library = new Library();
        Book b1 = library.getBookDetails(2);
        System.out.println("Book Name: " + b1.getName() + ",\nBook ID: " + b1.getId());
    }
}
