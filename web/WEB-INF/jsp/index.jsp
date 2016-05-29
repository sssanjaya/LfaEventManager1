
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../header.jsp" %>
<%--<jsp:include page="../header.jsp"></jsp:include>--%>
<h3>Student List</h3>


<div class="table-responsive">
    <table id="tableDemo" class="table table-bordered table-striped table-bordered">
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
                    <td>
                        <c:choose>
                            <c:when test="${s.status}">
                                <span class="label label-success">Active</span>
                            </c:when>
                            <c:otherwise>
                                <span class="label label-danger">Inactive</span>
                            </c:otherwise>
                        </c:choose>
                    </td>
                    <td>
                        <a href="${pageContext.request.contextPath}/edit?id=${s.id}" class="btn btn-info">
                            <span class="glyphicon glyphicon-pencil"/>
                        </a>
                        <a href="${pageContext.request.contextPath}/delete?id=${s.id}" class="btn btn-danger" onclick="return confirm('DELETE! Are You sure?')">
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