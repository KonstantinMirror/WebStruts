package epam.task.datalex.academi.controller;

import epam.task.datalex.academi.forms.LoginForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
       LoginForm loginForm = (LoginForm)form;
        System.out.println(loginForm.getUserName());
        System.out.println(loginForm.getPassword());
        return mapping.findForward("success");
    }
}
