<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html:html>
    <head>
        <%@include file="WEB-INF/jsp/head.jsp" %>
        <title><bean:message key="reservation.jsp.title"/></title>
    </head>
    <body>
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
           <%-- <c:forEach items="${requestScope.tasks}" var="task" varStatus="iterator">
                <tr>
                    <td><c:out value="${iterator.index + 1}"/></td>
                    <td><input name="task" value="${task.idTask}" type="checkbox"></td>
                    <td><c:out value="${task.creationDate}"/></td>
                    <td><c:out value="${task.executionDate}"/></td>
                    <td><c:out value="${task.status}"/></td>
                    <td><c:out value="${task.description}"/></td>
                    <td>
                        <div>
                            <c:choose>
                                <c:when test="${task.fileName eq 'NO FILE'}">
                                    ${task.fileName}
                                </c:when>
                                <c:otherwise>
                                    <a href="${'/tasks/file/'.concat(task.idTask)}">${task.fileName}</a>
                                </c:otherwise>
                            </c:choose>
                        </div>
                    </td>
                    <td><a href="${'/tasks/edit/'.concat(task.idTask)}">
                        <button type="button" name="edit" value="edit" class="btn btn-xs btn-info">Edit</button>
                    </a>
                    </td>
                </tr>
            </c:forEach>--%>
            </tbody>
        </table>
    </div>

    </body>
</html:html>
