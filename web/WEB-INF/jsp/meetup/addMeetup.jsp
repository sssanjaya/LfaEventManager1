<%@include  file="../../header.jsp"%>

<h1>Add Student</h1>

<form:form method="post" action="${pageContext.request.contextPath}/meetup/save"  modelAttribute="meetup">
    <table class="table table-bordered table-striped table-bordered">
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="description">Description</form:label></td>
            <td><form:input path="description"/></td>
        </tr>
        <tr>
            <td><form:label path="presenter">Presenter</form:label></td>
            <td><form:input path="presenter"/></td>
        </tr>
        <tr>
            <td><form:label path="location">Location</form:label></td>
            <td><form:input path="location"/></td>
        </tr>
        <tr>
            <td><form:label path="status">Status</form:label></td>
            <td><form:input path="status"/></td>
        </tr>
        <input type="hidden" name="id">
        <a href="${pageContext.request.contextPath}/" class="btn btn-danger">Back</a>
        <button type="submit" class="btn btn-success">Save</button>
    </table>

</form:form>

<%@include  file="../../footer.jsp"%>