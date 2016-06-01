
<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles" %>
<%@ taglib prefix="title" uri="http://struts.apache.org/tags-tiles" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>


<html:html>
<head>
    <%--<title><tiles:getAsString name="title"/></title>--%>
    <tiles:insert attribute="head"/>
</head>
<body>
<tiles:insert attribute="logo"/>
<tiles:insert attribute="navigation"/>
<tiles:insert attribute="body" />
<tiles:insert attribute="footer"/>
</body>
</html:html>
