<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mes Pays | Un Pays : ${pays.nomPays}</title>

<link rel="stylesheet" href="css/bootstrap.min.css">
<link href="css/starter-template.css" rel="stylesheet">
</head>
<body>

    <nav class="navbar navbar-toggleable-md navbar-inverse bg-inverse fixed-top">
      <a class="navbar-brand" href="/AppelPaysWebService">Mes Pays</a>
    </nav>

    <div class="container">
		<div class="row">
	      <div class="col-md-4">
	        <h1>Mon pays</h1>
			<p>
				Nom Pays : ${pays.nomPays}</br>
				Nom Capitale : ${pays.nomCapitale}</br>
				Nom Continent : ${pays.nomContinent}</br>
				Nombre Habitants : <fmt:formatNumber value="${pays.nbhabitants}" minFractionDigits="0" maxFractionDigits="0"/></br>
			</p>    
		  </div>
		  <div class="col-md-8">
	        <iframe
			  width="100%"
			  height="450"
			  frameborder="0" style="border:0"
			  src="https://www.google.com/maps/embed/v1/place?key=AIzaSyDydxXEa5buTAVgzuaL-pTeBQFgJZNE12M&q=${pays.nomCapitale}+${pays.nomPays}" allowfullscreen>
			</iframe> 
		  </div>
	  </div>
    </div><!-- /.container -->
    
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="js/popper.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>