<%@ page contentType="text/html; charset=UTF-8" %>
<%-- <%@taglib uri="mtg-mason.tld" prefix="m" %> --%>
<!DOCTYPE html>
<html lang="es">
    <html>
        <head>
            <!--Tailwind-->
            <link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">
            <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.13.0/css/all.css">
            <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:500,600,400&display=swap">
            <!--Bootstrap-->
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
            <!--Styles-->
            <link rel="stylesheet" href="css/contact.css">
            <style><%@include file="/WEB-INF/css/sidebar.css"%></style>
            <link rel="stylesheet" href="css/style2.css">
            <link rel="stylesheet" href="css/heroslider.css">
            <style><%@include file="/WEB-INF/css/tailwind.css"%></style>


            <!--Scripts-->

        </head>
        <body class="flex flex-col h-full">
            <jsp:include page="/WEB-INF/views/client/models/vistaContactCliente.jsp"/>
            <jsp:include page="/WEB-INF/views/comunes/footer.jsp"/>
            <!--Bootstrap-->
            <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
            <!--Scripts-->
            <script src="js/main.js"></script>
        </body>
    </html>