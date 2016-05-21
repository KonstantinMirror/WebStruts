package epam.task.datalex.academi.forms;


import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.http.HttpServletRequest;

import static epam.task.datalex.academi.constants.Constants.*;

public class LoginForm extends ActionForm {
    private String userName = null;
    private String password = null;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

        ActionErrors errors = new ActionErrors();

        if ((userName == null) || (!userName.matches("\\w{" + MIN_LENGTH_LOGIN + "," + MAX_LENGTH_LOGIN + "}"))) {
            errors.add("userName", new ActionMessage("login.error.username.missing"));
            System.out.println("error userName  " + userName);
        }
        if ((password == null) || (!password.matches("\\w{" + MIN_LENGTH_PASSWORD + "," + MAX_LENGTH_PASSWORD + "}"))) {
            errors.add("password", new ActionMessage("login.error.password.missing"));
            System.out.println("error password  " + password);
        }
        System.out.println("exit from form");
        return errors;
    }
}
