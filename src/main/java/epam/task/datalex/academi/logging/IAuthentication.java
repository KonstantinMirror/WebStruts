package epam.task.datalex.academi.logging;


import epam.task.datalex.academi.bean.User;

public interface IAuthentication {
    boolean isUserExist(User user, String password);
}
