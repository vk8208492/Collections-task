package app;

import app.OutPutUser.OutPutUser;
import app.UserProvider.UserProvider;

public class Collections {

    public static void main(String[] args){

        new OutPutUser().getOutPut(new UserProvider().getData());
    }
}
