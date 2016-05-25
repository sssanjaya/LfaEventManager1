<%@include  file="../header.jsp"%>

<h1>Add Student</h1>
<c:set value="add" var="addStudent"/>
<form action="${SITE_URL}/save" method="post" commandName="Student">
    <div class="form-group">
        <label>Name:</label>
        <input type="text" name="student_name" required="required" placeholder="Enter your name" class="form-control"/>
    </div>
    <div class="form-group">
        <label>Address:</label>
        <input type="text" name="address" required="required" placeholder="Enter the address" class="form-control"/>
    </div>
    <div class="form-group">
        <label>Email:</label>
        <input type="text" name="email" required="required" placeholder="Enter the email" class="form-control"/>
    </div>
    <div class="form-group">
        <label>College:</label>
        <input type="text" name="college" required="required" placeholder="Enter the college name" class="form-control"/>
    </div>
    <div class="checkbox">
        <label><input type="checkbox" name="status"/>Active</label>
    </div>
    <input type="hidden" name="id">
    <a href="${pageContext.request.contextPath}/" class="btn btn-danger">Back</a>
    <button type="submit" class="btn btn-success">Save</button>
</form>

<%@include  file="../footer.jsp"%>