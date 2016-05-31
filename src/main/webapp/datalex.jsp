<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html:html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <h1><bean:message key="customer.jsp.amountPaid"/> </h1>
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
</html:html>
