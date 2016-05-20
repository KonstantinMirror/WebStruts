package epam.task.datalex.academi.controller;

import epam.task.datalex.academi.forms.LoginForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class LoginAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 ServletRequest request, ServletResponse response) throws Exception {
        LoginForm loginForm = (LoginForm)form;

        return mapping.findForward("failure");
    }
}
