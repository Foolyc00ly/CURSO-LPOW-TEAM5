<header class="full-width NavBarP">
    <div class="full-width NavBarP-Logo">
<jsp:include page="/WEB-INF/paginas/comunes/sidebar.jsp"/>    
    </div>
    <nav class="full-width NavBarP-Nav">
        <ul class="full-width list-unstyled">
            <li><a href="index.html">Inicio</a></li>
            <li><a href="#!">Productos</a></li>
            <li><a href="#!">Acerca de</a></li>
            <li>
                <a href="#!" class="btn-login"><i class="fa fa-user" aria-hidden="true"></i> Log In</a>
                <div class="full-width Login">
                    <p class="text-center">
                    <form action="">
                        <div class="form-group">
                            <label for="email"><i class="fa fa-envelope" aria-hidden="true"></i> E-mail</label>
                            <input type="text" class="form-control" name="email" id="email">
                        </div>
                        <div class="form-group">
                            <label for="password"><i class="fa fa-lock" aria-hidden="true"></i> Contraseña</label>
                            <input type="text" class="form-control" name="password" id="password">
                        </div>
                        <a href="#!">No recuerdo mi contraseña</a>
                        <br>
                        <p class="text-center">
                            <a href="#!" class="btn btn-danger btn-login" style="display:inline-block !important;">CANCELAR</a>
                            <button type="submit" class="btn btn-primary">INICIAR SESIÓN</button>
                        </p>
                    </form>
                    <hr>
                    <p class="text-center">¿Aún no tienes cuenta?</p>
                    <a href="#!">CRÉATE UNA GRATIS</a>
                    </p>
                </div>
            </li>
        </ul>
    </nav>
    <i class="fa fa-bars visible-xs btn-menuMobile ShowMenuMobile" aria-hidden="true"></i>
</header>
