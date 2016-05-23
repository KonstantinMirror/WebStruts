<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav>
    <div class="container">
        <ul class="list-inline">
            <c:choose>
                <c:when test="${ not empty sessionScope.user}">
                   <ul class="breadcrumb">
                       <li > Hello <c:out value="${sessionScope.user.name}"/></li>
                       <li ><a href="<c:url value="" />">Reservation</a></li>
                       <li class="text-right col-sm-offset-9">
                           <a href="<c:url value="/logout.do" />">Logout</a>
                       </li>
                   </ul>
                </c:when>
                <c:otherwise>
                    <ul class="breadcrumb">
                        <li><a href="<c:url value="/login.jsp" />">Login</a></li>
                        <li><a href="<c:url value=""/> ">Registrate</a></li>
                    </ul>
                </c:otherwise>
            </c:choose>
        </ul>
    </div>
</nav>


