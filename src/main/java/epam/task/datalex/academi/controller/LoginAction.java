package epam.task.datalex.academi.controller;

import epam.task.datalex.academi.bean.User;
import epam.task.datalex.academi.forms.LoginForm;
import epam.task.datalex.academi.logging.AuthenticationHardCode;
import epam.task.datalex.academi.logging.IAuthentication;
import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LoginForm loginForm = (LoginForm) form;
        User user = new User(loginForm.getUserName());
        IAuthentication authentication = new AuthenticationHardCode();
        if (authentication.isUserExist(user, loginForm.getPassword())) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            return mapping.findForward("success");
        } else {
            ActionMessages error = new ActionMessages();
            error.add("userName", new ActionMessage("login.error.username.exist"));
            saveErrors(request, error);
            return mapping.getInputForward();
        }
    }
}
