<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>

<nav>
    <div class="container">
        <ul class="list-inline breadcrumb">
            <c:choose>
                <c:when test="${ not empty sessionScope.user}">
                    <li> Hello <c:out value="${sessionScope.user.name}"/></li>
                    <li><a href="<c:url value="/datalex/flight/reservation.do" />"><bean:message
                            key="datalex.jsp.list"/> </a></li>
                    <li class="text-right col-sm-offset-9">
                        <a href="<c:url value="/logout.do" />"><bean:message key="login.jsp.logout"/> </a>
                    </li>

                </c:when>
                <c:otherwise>

                    <li><a href="<c:url value="/login.jsp" />"><bean:message key="login.jsp.login"/> </a></li>
                    <li><a href="<c:url value=""/> "><bean:message key="login.jsp.registrate"/> </a></li>
                </c:otherwise>
            </c:choose>
        </ul>
        <ul class="list-inline breadcrumb">
            <li><a href="<c:url value="/ChangeLocale.do?language=ru" />">RUS</a></li>
            <li><a href="<c:url value="/ChangeLocale.do?language=en"/> ">EN</a></li>
        </ul>
    </div>
</nav>


