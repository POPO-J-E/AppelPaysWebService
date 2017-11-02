<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mes Pays</title>

<link rel="stylesheet" href="css/bootstrap.min.css">
<link href="css/starter-template.css" rel="stylesheet">
</head>
<body>

    <nav class="navbar navbar-toggleable-md navbar-inverse bg-inverse fixed-top">
      <a class="navbar-brand" href="/AppelPaysWebService">Mes Pays</a>
    </nav>

    <div class="container">

      <div class="starter-template">
        <h1>Chercher un pays</h1>
		<form method="post" action="pays"> 
			<div class="form-group">
			    <label for="pays">Choix d'un pays</label>
			    <select class="form-control" id="pays" name="name" size="1">
			      	<c:forEach var="p"  items="${pays}" >
		          		<option value="${p.nomPays}"> ${p.nomPays} </option>
					</c:forEach>
			    </select>
			  </div>    
		  	  <input type="submit" class="btn btn-primary" value="Envoyer"><br/>
		  </form>      
		</div>
    </div><!-- /.container -->
    
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="js/popper.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
<body>
 
</body>
</html>