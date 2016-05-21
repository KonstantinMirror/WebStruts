<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html:html>
    <head>
        <%@include file="WEB-INF/jsp/head.jsp" %>
        <title><bean:message key="farefamily.jsp.title"/></title>
    </head>
    <body>
    <div class="table-responsive">
        <table class="table">
            <thead>
            <tr>
                <th>#</th>
                <th><bean:message key="farefamily.jsp.farefamilycode"/></th>
                <th><bean:message key="farefamily.jsp.AncillaryAirComponentCode"/></th>
            </tr>
            </thead>
            <tbody>

            </tbody>
        </table>
    </div>

    </body>
</html:html>
