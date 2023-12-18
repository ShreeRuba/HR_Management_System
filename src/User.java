public interface User {
    String getUsername();
    String getPassword();
    String login(String username, String password);
}