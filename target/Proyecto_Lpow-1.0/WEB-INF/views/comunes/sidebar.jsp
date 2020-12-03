<input type="checkbox" id="abrir-cerrar" name="abrir-cerrar" value="">
<label for="abrir-cerrar">&#9776; <span class="abrir">Abrir</span><span class="cerrar">Cerrar</span></label>
<div class="sidebar " id="sidebar">
    <div class="sidebar-logo">
        <div class="sidebar-logo_img">
            <img src="<%=request.getContextPath()%>/img/NEWLOGO.PNG" />
        </div>
    </div>
    <a href="#!" class="active btn-login"><i class="fa fa-user" aria-hidden="true"></i>Iniciar Sesion</a>
    <a href="${pageContext.request.contextPath}/ServletRedireccion?opts=reserva&idCliente=${idCliente}">Reservar</a>
    <a href="${pageContext.request.contextPath}/ServletRedireccion?opts=registro&idCliente=${idCliente}">Registrate</a>
</div>