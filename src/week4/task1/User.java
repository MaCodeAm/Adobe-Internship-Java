package week4.task1;

public class User {

    private final String firstName;
    private final String lastName;
    private final String userName;
    private final String email;

    public User(String firstName, String lastName, String userName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
    }

    public User(User user) {
        this(user.firstName, user.lastName, user.userName, user.email);
    }

    public User copyUser(User user) {
        return new User(user);
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        String firstName = new String(this.firstName);
        String lastName = new String(this.lastName);
        String userName = new String(this.userName);
        String email = new String(this.email);
        return new User(firstName, lastName, userName, email);
    }

    @Override
    public String toString() {
        return "User: firstname is " + this.firstName +
                ", lastname is " + this.lastName + ", username is "
                + this.userName + ", email is " + this.email;
    }
}
