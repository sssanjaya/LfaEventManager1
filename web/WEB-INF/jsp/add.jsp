<%@include  file="../header.jsp"%>

<h1>Add Student</h1>

<form:form method="post" action="${pageContext.request.contextPath}/save"  modelAttribute="std">
    <table class="table table-bordered table-striped table-bordered">
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="address">Address</form:label></td>
            <td><form:input path="address"/></td>
        </tr>
        <tr>
            <td><form:label path="email">Email</form:label></td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td><form:label path="college">College</form:label></td>
            <td><form:input path="college"/></td>
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

<%@include  file="../footer.jsp"%>