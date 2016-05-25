<%@include file="../header.jsp" %>
<h2>Edit Student</h2>
<form action="${pageContext.request.contextPath}/update?id=${students.id}" method="post">
    <div class="form-group">
        <label>Name:</label>
        <input type="text" name="student_name" required="required" placeholder="Enter your name" class="form-control" value="${students.name}"/>
    </div>
    <div class="form-group">
        <label>Address:</label>
        <input type="text" name="address" required="required" placeholder="Enter the address" class="form-control" value="${students.address}"/>
    </div>
    <div class="form-group">
        <label>Email:</label>
        <input type="text" name="email" required="required" placeholder="Enter the email" class="form-control" value="${students.email}"/>
    </div>
    <div class="form-group">
        <label>College:</label>
        <input type="text" name="college" required="required" placeholder="Enter the college name" class="form-control" value="${students.college}"/>
    </div>
    <div class="checkbox">
        <label><input type="checkbox" name="status" <c:if test="${students.status}">checked="checked"</c:if>/>Active</label>
    </div>
    <a href="${pageContext.request.contextPath}/" class="btn btn-danger">Back</a>
    <button type="submit" class="btn btn-success">Save</button>
</form>
<%@include file="../footer.jsp" %>