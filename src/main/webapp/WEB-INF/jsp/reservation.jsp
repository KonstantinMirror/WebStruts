<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="datlexTag" uri="http://datalex.academi.customer.com" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<div class="table-responsive">
    <table class="table">
        <thead>
        <tr>
            <th>#</th>
            <th><bean:message key="reservation.jsp.code"/></th>
            <th><bean:message key="reservation.jsp.description"/></th>
            <th><bean:message key="reservation.jsp.componentTypeCode"/></th>
            <th><bean:message key="reservation.jsp.createDateTime"/></th>
            <th><bean:message key="reservation.jsp.internalStatus"/></th>
        </tr>
        </thead>
        <tbody>
        <datlexTag:reservation/>
        <c:forEach items="${reservation.reservationComponents}" var="resComp" varStatus="iterator">
            <tr>
                <td><c:out value="${iterator.index + 1}"/></td>
                <td><c:out value="${reservation.code}"/></td>
                <td><c:out value="${reservation.description}"/></td>
                <td><c:out value="${resComp.componentTypeCode}"/></td>
                <td><c:out value="${resComp.createDateTime}"/></td>
                <td><c:out value="${resComp.internalStatus}"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
