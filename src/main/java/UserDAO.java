public interface UserDAO {
    User find(String email);
    String getPassword(String email);

}
