<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/styles.css' />">
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/bootstrap.min.css' />">
</head>
<body class= "container-sm w-half">

    <ul>
         <li><a href = "/bank_app/signup" class="btn btn-info"> Registration </a></li>
              <li><a href = "/bank_app/signOut" class="btn btn-primary"> SignOut</a></li>
        <li><a href = "/bank_app/signIn" class="btn btn-primary"> SignIn</a></li>
         <li><a href = "/bank_app/users" class="btn btn-Success">Users</a></li>
          <li><a href = "/bank_app/transaction" class="btn btn-danger">Transaction Form</a></li>
    </ul>
    <h1>  Hello ${user} <h1>
<script defer src="<c:url value='/resources/bootstrap.bundle.min.js' />"/>
</body>