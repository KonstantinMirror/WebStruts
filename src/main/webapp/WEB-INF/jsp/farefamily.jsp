<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="datlexTag" uri="http://datalex.academi.customer.com" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
        <datlexTag:fareFamily/>
        <c:forEach items="${fareFamily.ancillaryAirComponentCode}" var="compCode" varStatus="iterator">
            <tr>
                <td><c:out value="${iterator.index + 1}"/></td>
                <td><c:out value="${fareFamily.fareFamilyCode}"/></td>
                <td><c:out value="${compCode}"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
