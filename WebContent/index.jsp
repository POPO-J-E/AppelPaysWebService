<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mes Pays</title>
</head>
<body>
<h1>Mes Pays</h1>
  <form method="post" action="pays">
     <p> Choix d'un pays </p>
      <SELECT name="name" size="1">
	      <c:forEach var = "p" items = "${pays}">
	         <OPTION><c:out value = "${p.nomPays}"/></OPTION>
	      </c:forEach>
      </SELECT>  
      <BR></BR>      
    <input type='submit'   value="Choisir"><br/>
  </form>
</body>
</html>