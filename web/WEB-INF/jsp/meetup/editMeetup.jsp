<%@include file="../../header.jsp" %>
<h2>Edit Student</h2>
<form:form action="${pageContext.request.contextPath}/update?id=${meetups.id}" method="post" modelAttribute="meetup">
    <div class="form-group">
        <form:label path="name">Name:</form:label>
        <form:input type="text" path="name" required="required" placeholder="Enter meetup name" class="form-control" value="${meetups.name}"/>
    </div>
    <div class="form-group">
        <form:label path="description">Description:</form:label>
        <form:input type="text" path="description" required="required" placeholder="Enter the description" class="form-control" value="${meetups.description}"/>
    </div>
    <div class="form-group">
        <form:label path="presenter">Presenter:</form:label>
        <form:input type="text" path="presenter" required="required" placeholder="Enter the presenter" class="form-control" value="${meetups.presenter}"/>
    </div>
    <div class="form-group">
        <form:label path="presenter">location:</form:label>
        <form:input type="text" path="location" required="required" placeholder="Enter the location" class="form-control" value="${meetups.location}"/>
    </div>
        <a href="${pageContext.request.contextPath}/" class="btn btn-danger">Back</a>
    <button type="submit" class="btn btn-success">Save</button>
</form:form>
<%@include file="../../footer.jsp" %>