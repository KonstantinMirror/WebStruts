package epam.task.datalex.academi.logging;

import epam.task.datalex.academi.bean.User;

public class AuthenticationHardCode implements IAuthentication {
    private  final String HARDCODE_NAME = "Piter";
    private  final String HARDCODE_PASSWORD = "123456";

    public boolean isUserExist(User user, String password) {
        if (user.getName().equals(HARDCODE_NAME) && password.equals(HARDCODE_PASSWORD)){
            return true;
        }else {
            return false;
        }
    }
}
