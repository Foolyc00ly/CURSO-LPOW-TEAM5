<input type="checkbox" id="abrir-cerrar" name="abrir-cerrar" value="">
<label for="abrir-cerrar">&#9776; <span class="abrir">Abrir</span><span class="cerrar">Cerrar</span></label>
<div class="sidebar" id="sidebar">
        <div class="sidebar-logo">
		<div class="sidebar-logo_img">
				<img src="<%=request.getContextPath()%>/img/NEWLOGO.PNG" />
		</div>
	</div>
        <a class="active" href="<%=request.getContextPath()%>/Vista/Seguridad/Inicio_Usuarios.jsp">Iniciar Sesion</a>
        <a href="#reservar">Reservar</a>
        <a href="<%=request.getContextPath()%>/Vista/Registro/Registro_Nuevo.jsp">Registrate</a>
</div>