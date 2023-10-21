
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/styles.css' />">
        <link rel="stylesheet" type="text/css" href="<c:url value='/resources/bootstrap.min.css' />">

<body class= "container-sm w-half">
<div class = "">
    <h2>Sign In </h2>
    <form:form action="signIn" method="POST" modelAttribute="auth">
     <div class="row mb-3">
    <label for="email" class="row mb-3" >Email</label>
    <form:input path="email" id="email"/></br>
    </div>
     <div class="row mb-3">
    <label for="password" >Password</label>
    <form:input path="password" id="password"/></br>
   </div>
    <input type="submit" value="save"/>
    </form:form>
<div
<script defer src="<c:url value='/resources/bootstrap.bundle.min.js' />"/>
</body>