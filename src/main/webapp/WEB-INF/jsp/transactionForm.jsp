
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <head>
      <link rel="stylesheet" type="text/css" href="<c:url value='/resources/styles.css' />">
        <link rel="stylesheet" type="text/css" href="<c:url value='/resources/bootstrap.min.css' />">
    </head>

<body class= "container-sm w-half">
    <h2>Transaction : </h2>

    <form:form action="transaction" method="POST" modelAttribute="transaction">
       <div class="row mb-3">
        <label for="email">Email</label>
        <form:input path="email" id="email"/>
        </div>
        </br>
         <div class="row mb-3">
        <label for="password">Password</label>
        <form:input path="password" id="password"/>
        </div>
        </br>
        <div class="row mb-3">
        <label for="amount">Amount</label>
        <form:input path="amount" id="amount"/>
        </div>
        </br>
        </br>
        <p>Transaction Type</p>
        <label for="credit">Credit</label>
        <form:radiobutton path = "type" value="credit" id="credit"/>
        <label for = "debit">Debit</label>
        <form:radiobutton path ="type" value="debit" id="debit"/></br>

        <input type="submit" value="save"/>
    </body>
<script defer src="<c:url value='/resources/bootstrap.bundle.min.js' />"/>
    </form:form>