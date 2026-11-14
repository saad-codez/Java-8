package OptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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

    public Optional<Book> getBookDetails(int id) {
        List<Book> books = Arrays.asList(new Book("Atomic Habits", 1), new Book("Never Split The Difference", 2), new Book("Deep Work", 3));

        for (Book book : books) {
            if (book.getId() == id) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

}


public class OCExample {
    static void main() {
       Library library = new Library();
        Optional<Book> optionalBook = library.getBookDetails(3);

        //using isPresent()
//        if (optionalBook.isPresent()) {
//            Book books = optionalBook.get(); // fetches the book
//            System.out.println("Name of the Book: " + books.getName()+"\nId of the Book: "+ books.getId());
//        }

        // using ifPresent()
        optionalBook.ifPresent(books ->System.out.println("Name of the Book: " + books.getName()+"\nId of the Book: "+ books.getId()));
    }
}
