package app.Contact_User;

public class Contact_User {

    private final String name;
    private final String email;

    public Contact_User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact_User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
