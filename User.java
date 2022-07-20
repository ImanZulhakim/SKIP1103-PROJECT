package projectskipv2;

public class User {

    private String userName;

    public User(String uN) {
        this.userName = uN;

    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "\nName =" + userName;
    }

}
