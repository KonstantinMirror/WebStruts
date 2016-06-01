<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles" %>
<%@ taglib prefix="title" uri="http://struts.apache.org/tags-tiles" %>

<tiles:insert page="/WEB-INF/jsp/layout.jsp">
    <title:put name="head" value="/WEB-INF/jsp/head.jsp"/>
    <title:put name="logo" value="/WEB-INF/jsp/logo.jsp"/>
    <title:put name="navigation" value="/WEB-INF/jsp/nav.jsp"/>
    <title:put name="body" value="/WEB-INF/jsp/login.jsp"/>
    <title:put name="footer" value="/WEB-INF/jsp/footer.jsp"/>
</tiles:insert>
