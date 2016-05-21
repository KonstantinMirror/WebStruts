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
        <h2><bean:message key=""/></h2>
        <html:form styleClass="form-horizontal" action="/login">
            <bean:message key="login.jsp.promt.userName"/>
            <html:text property="userName" size="20"/>
            <html:errors property="userName"/>
            <bean:message key="login.jsp.promt.password"/>
            <html:password property="password" size="20"/>
            <html:errors property="password"/>
            <html:submit>
                <bean:message key="login.jsp.prompt.submit"/>
            </html:submit>
        </html:form>
    </div>
    </body>
</html:html>
