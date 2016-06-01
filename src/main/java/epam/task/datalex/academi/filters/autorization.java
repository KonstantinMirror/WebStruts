package epam.task.datalex.academi.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class autorization implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpSession session = ((HttpServletRequest) req).getSession(false);
        if (session == null || session.getAttribute("user") == null){
            ((HttpServletResponse)resp).sendRedirect("/startPage.jsp");
        }else {
            HttpServletResponse response = (HttpServletResponse)resp;
            chain.doFilter(req, resp);
        }
    }
    public void init(FilterConfig config) throws ServletException {

    }

}
