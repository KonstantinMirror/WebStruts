<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/WEB-INF/jsp/head.jsp" %>
    <title><bean:message key="datalex.jsp.title"/></title>
</head>
<body>
<div class="jumbotron text-center">
  <h1><bean:message key="datalex.jsp.title"/> </h1>
</div>
<div class="container">
    <%@include file="/WEB-INF/jsp/nav.jsp"%>
    <%@include file="/WEB-INF/jsp/footer.jsp"%>
</div>

</body>
</html>
