<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav>
    <div class="container">
        <ul class="list-inline">
            <c:choose>
                <c:when test="${ not empty sessionScope.user}">
                   <ul class="breadcrumb">
                       <li > Hello <c:out value="${sessionScope.user.name}"/></li>
                       <li ><a href="<c:url value="/datalex/flight/reservation.do" />"><bean:message key="datalex.jsp.list"/> </a></li>
                       <li class="text-right col-sm-offset-9">
                           <a href="<c:url value="/logout.do" />"><bean:message key="login.jsp.logout"/> </a>
                       </li>
                   </ul>
                </c:when>
                <c:otherwise>
                    <ul class="breadcrumb">
                        <li><a href="<c:url value="/login.jsp" />"><bean:message key="login.jsp.login"/> </a></li>
                        <li><a href="<c:url value=""/> "><bean:message key="login.jsp.registrate"/> </a></li>
                    </ul>
                </c:otherwise>
            </c:choose>
        </ul>
    </div>
</nav>


