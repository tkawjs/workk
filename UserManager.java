package workkk;

import java.util.HashMap;

public class UserManager {
    private HashMap<String, User> users = new HashMap<>();
    private User currentUser = null;

    public boolean addUser(User user) {
        if (users.containsKey(user.username)) {
            return false; // 이미 존재하는 사용자 이름
        }
        users.put(user.username, user);
        return true;
    }

    public User getUser(String username) {
        return users.get(username);
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User user) {
        this.currentUser = user;
    }

    public void logout() {
        currentUser = null;
    }
}