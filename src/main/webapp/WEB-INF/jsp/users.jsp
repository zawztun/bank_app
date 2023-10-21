
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <head>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/styles.css' />">
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/bootstrap.min.css' />">
    </head>

   <body class= "container-sm w-half">
    <h1> ${title}</h1>
    <table class="table">
    <thead>
        <tr>
          <th scope="col">ID</th>
          <th scope="col">Name</th>
          <th scope="col">Email</th>
          <th scope="col">Account Number</th>
           <th scope="col">Account Balance</th>
        </tr>
      </thead>
      <tbody>
       <c:forEach items="${users}" var="user">
              <tr>
                <td scope="row">
                  <c:out value = "${user.getId()}" />
                </td>
                <td>
                    <c:out value = "${user.getName()}" />
                </td>
                <td>
                    <c:out value = "${user.getEmail()}" />
                </td>
                <td>
                    <c:out value = "${user.getAccount_number()}" />
                </td>
                 <td>
                    <c:out value = "${user.getAccount_balance()}" />
                 </td>
              </tr>
          </c:forEach>
        </tbody>
    </table>
    <script defer src="<c:url value='/resources/bootstrap.bundle.min.js' />"/>
</body>