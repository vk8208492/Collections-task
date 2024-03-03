package app.UserProvider;

import app.Contact_User.Contact_User;

import java.util.Arrays;
import java.util.List;

public class UserProvider {

    public List<Contact_User> getData() {

        return Arrays.asList(
                new Contact_User("Sergei", "ksv18061972@gmail.com"),
                new Contact_User("Natalia", "kne10091973@gmail.com"),
                new Contact_User("Vladyslav", "kvs280398@gmail.com"),
                new Contact_User("Anastasia", "aburlachka7@gmail.com"),
                new Contact_User("Artem", "kac25122012@gmail.com")
        );
    }
}

