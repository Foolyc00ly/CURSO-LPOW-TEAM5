package web;
import javax.servlet.annotation.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
@WebServlet("/ServletRedireccion")
public class ServletRedireccion extends HttpServlet{
    @Override
    protected void doPost(
        HttpServletRequest req,
        HttpServletResponse res
    )throws ServletException,IOException{
        String opts = req.getParameter("opts");
        if(opts != null){
            switch(opts){
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
    *=====####====#####==#########======================
    *====##=======##========###=========================
    *===##==###===#####=====###=========================
    *====##===#===##========###=========================
    *=====####====#####=====###=========================
    */
    @Override
    protected void doGet(
        HttpServletRequest req,
        HttpServletResponse res
    )throws ServletException,IOException{
        String opts = req.getParameter("opts");
        if(opts != null){
            switch(opts){
                case "reserva":
                    this.reservaCliente(req, res);
                    break;
                default:
                    this.accionDefault(req, res);
            }
        }else{
            this.accionDefault(req, res);
        }
    }
    /*
    *================================================
    *================ACCIÓN GET======================
    *================================================
    */
    private void reservaCliente(
        HttpServletRequest req,
        HttpServletResponse res
    )throws ServletException, IOException{
        String idClienteString = req.getParameter("idCliente");
        int idCliente=0;
        if(idClienteString!=null && !"".equals(idClienteString)){
            idCliente=Integer.parseInt(idClienteString);
        }
        //ClienteDTO cliente=new ClienteDAOJDBC().encontrar(new ClienteDTO(idCliente));
        req.setAttribute("cliente",idCliente);
        String jspReservar = "/WEB-INF/views/client/reservaCliente.jsp";
        req.getRequestDispatcher(jspReservar).forward(req,res);
    }
    /* 
    *================================================
    *================================================
    *================================================
    */
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
        int idCliente=0;
        if(idClienteString!=null && !"".equals(idClienteString)){
            idCliente=Integer.parseInt(idClienteString);
        }
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
