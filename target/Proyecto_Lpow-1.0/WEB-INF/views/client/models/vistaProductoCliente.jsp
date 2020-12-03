<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="/WEB-INF/views/comunes/navbar.jsp"/>
<br><br><div style="height: 10px; background-color: #141414"><br></div>
    <jsp:include page="/WEB-INF/views/client/models/components/heroSliderProduct.jsp"/>
<br>

<section class="container mx-auto mt-6">
    <h2 align="center" class="text-3xl mb-6">Nuestros Productos</h2>

        <c:forEach var="producto" items="${productos}" varStatus="status">
            <c:set var = "cod" value="${producto.codigoProducto}"/>
            <c:if test="${cod==1 || cod%4==0 }"><div class="flex mb-4"></c:if>

            <jsp:include page="/WEB-INF/views/comunes/cardHover.jsp">
                <jsp:param name="nombre" value="${producto.nombreProducto}"/>
                <jsp:param name="img" value="${producto.imagen}"/>
            </jsp:include>
            <c:if test="${cod%3==0}"></div></c:if>
        </c:forEach>

</section>
