package OptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Users {
     private int ID;
     private String name;

    public Users(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }
}

class Services {

    public Optional<Users> getUserByID(int ID) {
        List<Users> u = Arrays.asList(new Users(1, "Alamgir"), new Users(2, "Muwahhid"));

        for (Users user : u.toArray(new Users[0])) {
            if (user.getID() == ID) {
                return Optional.of(user);
            }
        }
        return Optional.empty();

    }
}

public class OptionalClassDemo {
    static void main() {
        Services services = new Services();
        Optional<Users> users = services.getUserByID(2);
        if(users.isPresent()) {
            Users users1 = users.get();
            System.out.println(users1.getID()+" "+users1.getName());
        }
    }
}
