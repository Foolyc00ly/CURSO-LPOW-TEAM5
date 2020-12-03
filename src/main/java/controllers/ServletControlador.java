package controllers;
import datos.ConsultaDAO;
import domain.ConsultaDTO;
import javax.servlet.annotation.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    @Override
    protected void doPost(
        HttpServletRequest req,
        HttpServletResponse res
    )throws ServletException,IOException{
        String opts = req.getParameter("opts");
        if(opts != null){
            switch(opts){
                case "enviar":
                    this.enviarComentario(req,res);
                    break;
                default:
                    this.accionDefault(req, res);
            }
        }else{
            this.accionDefault(req, res);
        }
    }
    //!================================================
    //!================================================
    /*
    *================================================
    *================ACCIÓN POST======================
    *================================================
    */
    private void enviarComentario(
        HttpServletRequest req,
        HttpServletResponse res
    )throws ServletException,IOException{
        String idClienteString = req.getParameter("idCliente");
        int idCliente;
        if(idClienteString!=null && !"".equals(idClienteString)){
            idCliente=Integer.parseInt(idClienteString);
        }else{idCliente=0;}


        String nombre=req.getParameter("nombre");
        String email=req.getParameter("email");
        String asunto=req.getParameter("asunto");
        String sugerencia=req.getParameter("sugerencia");

        ConsultaDTO consulta=new ConsultaDTO(nombre,email,asunto,sugerencia);
        int registrosModificados=new ConsultaDAO().insertar(consulta);
        HttpSession sesion=req.getSession();
        sesion.setAttribute("idCliente",idCliente);
        res.sendRedirect("PageMain.jsp");
    }
    //!================================================
    //!================================================
    /*
    *================================================
    *================ACCIÓN GLOBAL===================
    *================================================
    */
    private void accionDefault(
        HttpServletRequest req,
        HttpServletResponse res
    )throws ServletException,IOException{
        String idClienteString = req.getParameter("idCliente");
        int idCliente;
        if(idClienteString!=null && !"".equals(idClienteString)){
            idCliente=Integer.parseInt(idClienteString);
        }else{idCliente=0;}
        HttpSession sesion=req.getSession();
        sesion.setAttribute("idCliente",idCliente);
        res.sendRedirect("PageMain.jsp");
    }
    /* 
    *================================================
    *================================================
    *================================================
    */
}
