package llama3.task138;

import java.util.HashMap;
import java.util.Map;

class User {
    private String username;
    private String password;
    private String[] privileges;

    //invalid code, getPassword was not defined
    public String getPassword() {
        return password;
    }

    public User(String username, String password, String[] privileges) {
        this.username = username;
        this.password = password;
        this.privileges = privileges;
    }

    public boolean hasPrivilege(String privilege) {
        for (String p : privileges) {
            if (p.equals(privilege)) {
                return true;
            }
        }
        return false;
    }
}

public class Task138_PERPLEXITY_llama_3_sonar_large_32k_chat {
    private Map<String, User> users;

    public Task138_PERPLEXITY_llama_3_sonar_large_32k_chat() {
        this.users = new HashMap<>();
    }

    public void addUser(String username, String password, String[] privileges) {
        users.put(username, new User(username, password, privileges));
    }

    public User authenticate(String username, String password) {
        //invalid code, getPassword was not defined
//        if (users.containsKey(username) && users.get(username).password.equals(password)) {
        if (users.containsKey(username) && users.get(username).getPassword().equals(password)) {
            return users.get(username);
        } else {
            return null;
        }
    }

    public boolean checkPrivilege(String username, String password, String privilege) {
        User user = authenticate(username, password);
        if (user != null && user.hasPrivilege(privilege)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Task138_PERPLEXITY_llama_3_sonar_large_32k_chat manager = new Task138_PERPLEXITY_llama_3_sonar_large_32k_chat();
        manager.addUser("admin", "password", new String[] {"read", "write", "execute"});
        manager.addUser("user", "password", new String[] {"read"});

        System.out.println(manager.checkPrivilege("admin", "password", "write"));  // true
        System.out.println(manager.checkPrivilege("user", "password", "write"));  // false
    }
}