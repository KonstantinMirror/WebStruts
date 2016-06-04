package epam.task.datalex.academi.controller;


import com.datalex.logging.Logging;
import com.datalex.logging.LoggingHome;
import epam.task.datalex.academi.forms.LoginForm;
import org.apache.struts.action.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.datalex.logging.bean.User;

import java.util.Properties;

public class LoginAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LoginForm loginForm = (LoginForm) form;
        String login = loginForm.getUserName();
        String pswd = loginForm.getPassword();
        Properties properties = new Properties();
        properties.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
        properties.put(Context.PROVIDER_URL, "localhost:1099");
        Logging logging = null;
        try {
            InitialContext jndiContext = new InitialContext(properties);
            Object ref = jndiContext.lookup("User");
            LoggingHome home = (LoggingHome) PortableRemoteObject.narrow(ref,
                    LoggingHome.class);
            logging = home.create();
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalStateException("opps some wrong",e);
        }

        if (logging.isExecistUser(login,pswd)) {
            User user = new User(login,"");
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
