package epam.task.datalex.academi.forms;


import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.ServletRequest;

public class LoginForm  extends ActionForm {
    private String userName = null;
    private String password =null;

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
        return super.validate(mapping, request);
    }

    @Override
    public void reset(ActionMapping mapping, ServletRequest request) {
       password = null;
    }
}
