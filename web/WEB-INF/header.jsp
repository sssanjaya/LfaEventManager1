<%-- 
    Document   : header
    Created on : May 18, 2016, 11:03:07 AM
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="SITE_URL" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>LFA Events</title>
        <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <!-- Bootstrap 3.3.6 -->
        <link rel="stylesheet" href="${SITE_URL}/assets/bootstrap/css/bootstrap.min.css">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
        <!-- Ionicons -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="${SITE_URL}/assets/dist/css/AdminLTE.min.css">
        <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
              page. However, you can choose any other skin. Make sure you
              apply the skin class to the body tag so the changes take effect.
        -->
        <link rel="stylesheet" href="${SITE_URL}/assets/dist/css/_all-skins.min.css">
        <link rel="stylesheet" href="${SITE_URL}/assets/dist/css/skins/skin-blue.min.css">
        <link rel="stylesheet" href="${SITE_URL}/assets/dist/css/dataTables.bootstrap.css">
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body class="hold-transition skin-blue sidebar-mini">
        <div class="wrapper">

            <!-- Main Header -->
            <header class="main-header">

                <!-- Logo -->
                <a href="#" class="logo">
                    <!-- mini logo for sidebar mini 50x50 pixels -->
                    <span class="logo-mini"><b>LFA</b></span>
                    <!-- logo for regular state and mobile devices -->
                    <span class="logo-lg"><b>LFA</b>events</span>
                </a>

                <!-- Header Navbar -->
                <nav class="navbar navbar-static-top" role="navigation">
                    <!-- Sidebar toggle button-->
                    <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                        <span class="sr-only">Toggle navigation</span>
                    </a>

                </nav>
            </header>
            <!-- Left side column. contains the logo and sidebar -->
            <aside class="main-sidebar">

                <!-- sidebar: style can be found in sidebar.less -->
                <section class="sidebar">

                    <!-- Sidebar user panel (optional) -->
                    <div class="user-panel">
                        <div class="pull-left image">
                            <img src="${SITE_URL}/assets/dist/img/user8-128x128.jpg" class="img-circle" alt="User Image">
                        </div>
                        <div class="pull-left info">
                            <p>username</p>
                            <!-- Status -->
                            <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
                        </div>
                    </div>

                    <!-- search form (Optional) -->
                    <form action="#" method="get" class="sidebar-form">
                        <div class="input-group">
                            <input type="text" name="q" class="form-control" placeholder="Search...">
                            <span class="input-group-btn">
                                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                                </button>
                            </span>
                        </div>
                    </form>
                    <!-- /.search form -->

                    <!-- Sidebar Menu -->
                    <ul class="sidebar-menu">
                        <li class="header">HEADER</li>
                        <!-- Optionally, you can add icons to the links -->
                        <li class="active"><a href="#"><i class="fa fa-eye"></i> <span>Meetup</span></a></li>
                        <li><a href="#"><i class="fa fa-eye"></i> <span>Leaptalks</span></a></li>
                        <li><a href="#"><i class="fa fa-eye"></i> <span>Workshop</span></a></li>
                        <li><a href="#"><i class="fa fa-eye"></i> <span>Career Counselling</span></a></li>
                        <li><a href="#"><i class="fa fa-eye"></i> <span>Campus Connection</span></a></li>

                    </ul>
                    <!-- /.sidebar-menu -->
                </section>
                <!-- /.sidebar -->
            </aside>

            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                        <img src="${SITE_URL}/assets/img/logo_main.png" height="35px">
                        <small>Events</small>
                    </h1>

                </section>

                <!-- Main content -->
                <section class="content">

                    <!-- Your Page Content Here -->











                    <!--    <body>
                            <div class="container">
                                <nav class="navbar navbar-default">
                                    <div class="container-fluid">
                                         Brand and toggle get grouped for better mobile display 
                                        <div class="navbar-header">
                                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-
                                                    example-navbar-collapse-1" aria-expanded="false">
                                                <span class="sr-only">Toggle navigation</span>
                                                <span class="icon-bar"></span>
                                                <span class="icon-bar"></span>
                                                <span class="icon-bar"></span>
                                            </button>
                    
                    
                    
                                            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                                                <ul class="nav navbar-nav">
                                                    <a class="navbar-brand" href="${SITE_URL}">
                                                        <img alt="Brand" src="${SITE_URL}/assets/img/logo_main.png" height="27px">
                                                    </a>
                                                    <li class="active"><a href="#">Meetup <span class="sr-only">(current)</span></a></li>
                                                    <li><a href="#">Workshop</a></li>
                                                    <li><a href="#">Leaptalks</a></li>
                                                    <li><a href="#">Career Counselling</a></li>
                                                    <li><a href="#">Campus Connection</a></li>
                                                </ul>
                                            </div> /.navbar-collapse 
                                        </div> /.container-fluid 
                                </nav>-->
