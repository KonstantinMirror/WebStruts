package epam.task.datalex.academi.tags;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;


public class CustomTag extends SimpleTagSupport {
    private String var;

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    protected String getRealPath(){
        PageContext pageContext = (PageContext) getJspContext();
        HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
        ServletContext context = request.getSession().getServletContext();
        return context.getRealPath("/");
    }
}
