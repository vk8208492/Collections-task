package app.UserProvider;

import app.ContactUser.ContactUser;

import java.util.Arrays;
import java.util.List;

public class UserProvider {

    public List<ContactUser> getData() {

        return Arrays.asList(
                new ContactUser("Sergei", "ksv18061972@gmail.com"),
                new ContactUser("Natalia", "kne10091973@gmail.com"),
                new ContactUser("Vladyslav", "kvs280398@gmail.com"),
                new ContactUser("Anastasia", "aburlachka7@gmail.com"),
                new ContactUser("Artem", "kac25122012@gmail.com")
        );
    }
}

