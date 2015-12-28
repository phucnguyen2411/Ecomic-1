<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>


<head>

<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>eElectronics - HTML eCommerce Template</title>
    
    <!-- Google Fonts -->
    
    
    <link
	href="<c:url value="http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600" />"
	rel="stylesheet" type='text/css'>
    <link
	href="<c:url value="http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300" />"
	rel="stylesheet" type='text/css'>
    <link
	href="<c:url value="http://fonts.googleapis.com/css?family=Raleway:400,100" />"
	rel="stylesheet" type='text/css'>
    
    <!-- Bootstrap -->
    
    <link
	href="<c:url value="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" />"
	rel="stylesheet">
    
    <!-- Font Awesome -->
    <link
	href="<c:url value="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" />"
	rel="stylesheet">
    
    
    <!-- Custom CSS -->
    <link href="<c:url value="/css/owl.carousel.css" />"
	rel="stylesheet">
    <link href="<c:url value="/views/style.css" />" rel="stylesheet">
    <link href="<c:url value="/css/responsive.css" />" rel="stylesheet">
    
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head></head>
  
<body>

<div class="header-area">
        <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <div class="user-menu">
                        <ul>
                            <li><a href="#"><i
									class="fa fa-user"></i> 
                            
                             
                             <c:choose>
                             	<c:when test="${sttLog =='1'}">
                             		<c:out value=" Hello: ${fullname }"></c:out>
                             	</c:when>
                             	<c:when test="${sttLog == '0' }">
                             		My Account
                             	</c:when>
                             
                             </c:choose>
                                
                                </a></li>
                            <li><a href="#"><i
									class="fa fa-heart"></i> Wishlist</a></li>
                            <li><a href="cart.html"><i
									class="fa fa-user"></i> My Cart</a></li>
                            <li><a href="checkout.html"><i
									class="fa fa-user"></i> Checkout</a></li>
                            <li><a href="#"><i
									class="fa fa-user"></i> Login</a></li>
                        </ul>
                    </div>
                </div>
                
                <div class="col-md-4">
                    <div class="header-right">
                        <ul class="list-unstyled list-inline">
                            <li class="dropdown dropdown-small">
                                <a data-toggle="dropdown"
								data-hover="dropdown" class="dropdown-toggle" href="#"><span
									class="key">currency :</span><span class="value">USD </span><b
									class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">USD</a></li>
                                    <li><a href="#">INR</a></li>
                                    <li><a href="#">GBP</a></li>
                                </ul>
                            </li>

                            <li class="dropdown dropdown-small">
                                <a data-toggle="dropdown"
								data-hover="dropdown" class="dropdown-toggle" href="#"><span
									class="key">language :</span><span class="value">English </span><b
									class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">English</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End header area -->

</body>
</html>