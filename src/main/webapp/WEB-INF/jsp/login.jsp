
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>

<div class="container">
    <h2 class="col-sm-offset-3"><bean:message key="login.jsp.title.form"/></h2>
    <html:form styleClass="form-horizontal" action="/login">

        <div class="form-group">
            <label for="login" class="control-label col-sm-4">
                <bean:message key="login.jsp.promt.userName"/>
            </label>

            <div class="col-sm-4">
                <html:text styleId="login" styleClass="form-control col-sm-3" property="userName" size="20"/>
            </div>
            <div class="text-warning col-sm-3">
                <html:errors property="userName"/>
            </div>
        </div>

        <div class="form-group">
            <label for="password" class="control-label col-sm-4">
                <bean:message key="login.jsp.promt.password"/>
            </label>

            <div class="col-sm-4">
                <html:password styleId="password" styleClass="form-control col-sm-3" property="password" size="20"/>
            </div>
            <div class="text-warning col-sm-3">
                <html:errors property="password"/>
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-5 col-sm-offset-6">
                <html:submit styleClass="btn btn-success">
                    <bean:message key="login.jsp.prompt.submit"/>
                </html:submit>
                <a href="/startPage.jsp">
                    <button type="button" class="btn btn-warning">
                        <bean:message key="login.jsp.prompt.cancel"/>
                    </button>
                </a>
            </div>
        </div>

    </html:form>
</div>

