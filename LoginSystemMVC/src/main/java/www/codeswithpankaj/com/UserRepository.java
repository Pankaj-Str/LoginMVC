package www.codeswithpankaj.com;

import java.util.*;

public class UserRepository {
    private static final Map<String, User> users = new HashMap<>();


    public static void addUser(User user) {

        users.put(user.getUsername(), user);

    }


    public static User getUserByUsername(String username) {

        return users.get(username);

    }
}
