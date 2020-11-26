<div id="contenido">
    <center>
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
            </ol>
                 
            <!-- Wrapper for slides -->
            <div class="carousel-inner">
                <div class="item active">
                    <img src="<%=request.getContextPath()%>/img/carrusel_1.jpg" height="500" width="70%">
                </div>
                <div class="item">
                    <img src="<%=request.getContextPath()%>/img/carrusel_2.jpg" height="500" width="70%">
                </div>
                <div class="item">
                    <img src="<%=request.getContextPath()%>/img/carrusel_3.jpg" height="500" width="70%">
                </div>
            </div>
                 
            <!-- Controls -->
            <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
                 
        <br/>
        <div id="contenido_principal">
            <center>
                <div id="bienvenida">
                    <h1>BIENVENIDO A CRIOGAS</h1>
                </div>
                 
                <br/>
                <div id="texto_principal">
                    <tx1>Dentro del Ambito industrial, de la salud, de alimentos y bebidas, y todos aquellos en
                        los que participamos y colaboramos, la necesidad de obtener un producto que sea confiable, 
                        eficiente y tenga disponibilidad inmediata es indispensable. 
                    </tx1>
                </div>

                <div>
                    <br/>
                    <table id="contenido_bajo">
                        <tr>
                            <td><img src="<%=request.getContextPath()%>/img/calidad.png" height="90" width="90"/> </td>
                            <td><img src="<%=request.getContextPath()%>/img/separador.png" height="20" width="20"/> </td>
                            <td><img src="<%=request.getContextPath()%>/img/puntualidad.png" height="90" width="90"/> </td>
                            <td><img src="<%=request.getContextPath()%>/img/separador.png" height="20" width="20"/> </td>
                            <td><img src="<%=request.getContextPath()%>/img/equipo.png" height="90" width="90"/> </td>
                            <td><img src="<@tailwind components;%=request.getContextPath()%>/img/separador.png" height="20" width="20"/> </td>
                            <td><img src="<%=request.getContextPath()%>/img/suministros.png" height="90" width="90"/> </td>
                            <td><img src="<%=request.getContextPath()%>/img/separador.png" height="20" width="20"/> </td>
                            <td><img src="<%=request.getContextPath()%>/img/maquinaria.png" height="90" width="90"/> </td>
                        </tr>
                        <tr align="center">
                            <td>Calidad</td>
                            <td>     </td>
                            <td>Puntualidad</td>
                            <td>     </td>
                            <td>Equipo</td>
                            <td>     </td>
                            <td>Suministros</td>
                            <td>     </td>
                            <td>M�quinas</td>
                        </tr>
                    </table>
                </div>
            </center>
        </div>
    </center>
</div>