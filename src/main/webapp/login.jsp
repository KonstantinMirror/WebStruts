<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<!DOCTYPE html>
<html:html>
    <head>
        <%@include file="WEB-INF/jsp/head.jsp" %>
        <title><bean:message key="login.jsp.title"/></title>
    </head>
    <body>
    <div class="container">
        <h2><bean:message key="login.jsp.title.form"/></h2>
        <html:form styleClass="form-horizontal" action="/login">

            <div class="form-group">
                <label class="control-label col-sm-4">
                    <bean:message key="login.jsp.promt.userName"/>
                    <html:text property="userName" size="20"/>
                </label>
                <span class="text-warning">
                  <html:errors property="userName"/>
                </span>
            </div>

            <div class="form-group">
                <label class="control-label col-sm-4">
                    <bean:message key="login.jsp.promt.password"/>
                    <html:password property="password" size="20"/>
                </label>
                <span class="text-warning">
                  <html:errors property="password"/>
                </span>
            </div>

            <div class="form-group">
                <div class=" col-sm-offset-2 col-sm-10">
                    <html:submit styleClass="btn btn-success">
                        <bean:message key="login.jsp.prompt.submit"/>
                    </html:submit>
                    <a href="/datalex.jsp">
                        <button type="button" class="btn btn-warning">
                            <bean:message key="login.jsp.prompt.cancel"/>
                        </button>
                    </a>
                </div>
            </div>

        </html:form>
    </div>
    </body>
</html:html>
