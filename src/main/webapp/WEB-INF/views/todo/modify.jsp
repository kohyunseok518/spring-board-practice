<%--
  Created by IntelliJ IDEA.
  User: kohyunseok
  Date: 2026. 6. 21.
  Time: 오전 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="card-body">
    <form action="/todo/modify" method="post">
        <div class="input-group mb-3">
            <span class="input-group-text">TNO</span>
            <input type="text" name="tno" class="form-control"
                   value=<c:out value="${dto.tno}"></c:out> readonly>
        </div>
        <div class="input-group mb-3">
            <span class="input-group-text">Title</span>
            <input type="text" name="title" class="form-control"
                   value='<c:out value="${dto.title}"></c:out>' readonly>
        </div>
        <div class="input-group mb-3">
            <span class="input-group-text">DueDate</span>
            <input type="date" name="dueDate" class="form-control"
                   value=<c:out value="${dto.dueDate}"></c:out> >
        </div>
        <div class="input-group mb-3">
            <span class="input-group-text">Writer</span>
            <input type="text" name="writer" class="form-control"
                   value=<c:out value="${dto.writer}"></c:out> readonly>
        </div>
        <div class="form-check">
            <label class="form-check-label" >
                Finished &nbsp;
            </label>
            <input class="form-check-input" type="checkbox" name="finished"
            ${dto.finished?"checked":""} >
        </div>
        <div class="my-4">
            <div class="float-end">
                <button type="button" class="btn btn-danger">Remove</button>
                <button type="button" class="btn btn-primary">Modify</button>
                <button type="button" class="btn btn-secondary">List</button>
            </div>
        </div>
    </form>
</div>
<script>
    const formObj = document.querySelector("form")
    document.querySelector(".btn-danger").addEventListener("click",function(e)
    {
        e.preventDefault()
        e.stopPropagation()
        formObj.action ="/todo/remove"
        formObj.method ="post"
        formObj.submit()
    },false);
</script>
</body>
</html>
