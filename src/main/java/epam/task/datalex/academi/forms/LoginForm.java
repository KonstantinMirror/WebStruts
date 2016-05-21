package epam.task.datalex.academi.forms;


import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import javax.servlet.ServletRequest;
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
    public ActionErrors validate(ActionMapping mapping, ServletRequest request) {
        System.out.println("Inner  validate");
        ActionErrors errors = new ActionErrors();
        errors.add("userName", new ActionMessage("login.error.username.missing"));

        if ((userName == null) || (!userName.matches("\\w{" + MIN_LENGTH_LOGIN + "," + MAX_LENGTH_LOGIN + "}"))) {
            errors.add("userName", new ActionMessage("login.error.username.missing"));

        }
        if ((password == null) || (!password.matches("\\w{" + MIN_LENGTH_PASSWORD + "," + MAX_LENGTH_PASSWORD + "}"))) {
            errors.add("password", new ActionMessage("login.error.password.missing"));
        }
        return errors;
    }

    @Override
    public void reset(ActionMapping mapping, ServletRequest request) {
        password = null;
    }
}
