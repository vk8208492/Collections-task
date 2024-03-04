package app.OutPutUser;

import app.ContactUser.ContactUser;

import java.util.List;

public class OutPutUser {

    public void getOutPut(List<ContactUser> list){
        int count = 0;
        for (ContactUser contactUser: list){
            count++;
            System.out.println(count + ")" + contactUser);
        }
    }

}
