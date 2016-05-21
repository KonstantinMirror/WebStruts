<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>

<html:html>
    <head>
        <title><bean:message key="login.jsp.title"/></title>
    </head>
    <body>
    <h1>LOGIN PAGE</h1>

    <html:form action="/login">
        <p>
            <bean:message key="login.jsp.promt.userName"/>
            <html:text property="userName" size="20"/>
            <html:errors property="userName"/>
        </p>

        <p>
            <bean:message key="login.jsp.promt.password"/>
            <html:password property="password" size="20"/>
            <html:errors property="password"/>
        </p>

        <html:submit>
            <bean:message key="login.jsp.prompt.submit"/>
        </html:submit>

    </html:form>
    </body>
</html:html>
