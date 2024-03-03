package app.OutPutUser;

import app.Contact_User.Contact_User;

import java.util.List;

public class OutPutUser {

    public void getOutPut(List<Contact_User> list){
        int count = 0;
        for (Contact_User contact_user: list){
            count++;
            System.out.println(count + ")" + contact_user);
        }
    }

}
