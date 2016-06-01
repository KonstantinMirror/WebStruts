<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="datlexTag" uri="http://datalex.academi.customer.com" %>


<div class="container">
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="<c:url value="/startPage.jsp"/>"><bean:message key="data.jsp.home"/> </a>
            </div>
            <ul class="nav navbar-nav ">
                <li><a href="<c:url value="/datalex/flight/reservation.do"/>"><bean:message
                        key="data.jsp.reservation"/></a></li>
                <li><a href="<c:url value="/datalex/flight/customer.do"/>"><bean:message key="data.jsp.customer"/></a>
                </li>
                <li><a href="<c:url value="/datalex/flight/farefamily.do"/>"><bean:message
                        key="data.jsp.farefamily"/> </a></li>
            </ul>
        </div>
    </nav>
    <c:choose>
        <c:when test="${requestScope.location eq 'CUSTOMER'}">
            <jsp:include page="customer.jsp"/>
        </c:when>
        <c:when test="${requestScope.location eq 'RESERVATION'}">
            <jsp:include page="reservation.jsp"/>
        </c:when>
        <c:when test="${requestScope.location eq 'FAREFAMILY'}">
            <jsp:include page="farefamily.jsp"/>
        </c:when>
    </c:choose>
</div>

