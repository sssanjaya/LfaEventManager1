
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../header.jsp" %>
<%--<jsp:include page="../header.jsp"></jsp:include>--%>
<h1>Student List</h1>


<div class="table-responsive">
    <table class="table table-bordered table-striped table-hover">
        <div class="pull-right">
            <a href="${SITE_URL}/add" class="btn btn-success">
                <span class="glyphicon glyphicon-plus"/>
            </a> 
        </div>
        <thead>
            <tr>
                <th>Name</th>
                <th>Address</th>
                <th>Email</th>
                <th>College</th>
                <th>Status</th>
                <th>Action</th>
            </tr>
        </thead>
        <c:forEach var="s" items="${students}">
            <tbody>
                <tr>
                    <td>${s.name}</td>
                    <td>${s.address}</td>
                    <td>${s.email}</td>
                    <td>${s.college}</td>
                    <td>${s.status}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/edit?id=${s.id}" class="btn btn-info">
                            <span class="glyphicon glyphicon-pencil"/>
                        </a>
                        <a href="${pageContext.request.contextPath}/delete?id=${s.id}" class="btn btn-danger" onclick="return confirm('DELETE! Are You sure???')">
                            <span class="glyphicon glyphicon-trash"/>
                        </a>
                    </td>
                </tr>
            </tbody>
        </c:forEach>
    </table>
</div>

<%@include file="../footer.jsp" %>
<%--<jsp:include page="../footer.jsp"></jsp:include>--%>