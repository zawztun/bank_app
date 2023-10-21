    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

    <head>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/styles.css' />">
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/bootstrap.min.css' />">
    </head>
<body class= "container-sm w-half">

<div >
    <h2>Sign Up </h2>
    <form:form action="users" method="POST" modelAttribute="user">
     <div class="row mb-3">
    <label for="name">Name</label>
    <form:input path="name" id="name"/></br>
</div>

    <div class="row mb-3">
    <label for="email">Email</label>
    <form:input path="email" id="email" /></br>
    </div>
    <div class="row mb-3">
    <label for="password">Password</label>
    <form:input path="password" id="password"/></br>
</div>
<div class="row mb-3">
    <label for="account_number">Account Number</label>
    <form:input path="account_number" id="account_number"/></br>
</div>
<div class="row mb-3">
    <label for="account_balance">Account Balance</label>
    <form:input path="account_balance" id="account_balance"/></br>
</div>
    <input type="submit" value="save"/>

    </form:form>
</div>
<script defer src="<c:url value='/resources/bootstrap.bundle.min.js' />"/>
</body>