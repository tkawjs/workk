package workkk;

import java.util.ArrayList;

public class User {
    String username;
    String password;
    ArrayList<String> workoutRoutine;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.workoutRoutine = new ArrayList<>();
    }
}