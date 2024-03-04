package app.ContactUser;

public class ContactUser {

    private final String name;
    private final String email;

    public ContactUser(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactUser{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
