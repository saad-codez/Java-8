import java.util.Arrays;
import java.util.List;

class UserService {

    public User getUserByID(int id) {
        List<User> users = Arrays.asList(new User(1, "Alamgir"), new User(2, "Muwahhid"), new User(3, "Mutawakkil"));

        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
            }
        return null;
        }
}


class User {
    private String user;
    private int id;

    public User(int id, String user) {
        this.user = user;
        this.id = id;
    }

    public String getUser() {
        return user;
    }


    public int getId() {
        return id;
    }

}


public class NullPointerExceptionDemo {
    static void main() {

        UserService userService = new UserService();
        User user = userService.getUserByID(5); // returns null
        // to check null pointer exception
        if (user != null) {
            System.out.println("UserName: " + user.getUser() + ", UserID: " + user.getId());
        } else {
            System.out.println("User does not exist");
        }
    }
}