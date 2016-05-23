<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="datlexTag" uri="http://datalex.academi.customer.com" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>



<div class="table-responsive">
    <table class="table">
        <thead>
        <tr>
            <th>#</th>
            <th><bean:message key="customer.jsp.firstName"/></th>
            <th><bean:message key="customer.jsp.lastName"/></th>
            <th><bean:message key="customer.jsp.email"/></th>
            <th><bean:message key="customer.jsp.phone"/></th>
            <th><bean:message key="customer.jsp.amountPaid"/></th>
            <th><bean:message key="customer.jsp.formOfPaymentTypeCode"/></th>
            <th><bean:message key="customer.jsp.currencyCode"/></th>
        </tr>
        </thead>
        <tbody>
        <datlexTag:customer/>
        <c:forEach items="${customer.payments}" var="payment" varStatus="iterator">
            <tr>
                <td><c:out value="${iterator.index + 1}"/></td>
                <td><c:out value="${customer.firstName}"/></td>
                <td><c:out value="${customer.lastName}"/></td>
                <td><c:out value="${customer.email}"/></td>
                <td><c:out value="${customer.phone}"/></td>
                <td><c:out value="${payment.amountPaid}"/></td>
                <td><c:out value="${payment.formOfPaymentTypeCode}"/></td>
                <td><c:out value="${payment.currencyCode}"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
