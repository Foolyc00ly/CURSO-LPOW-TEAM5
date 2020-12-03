package web;
import datos.ProductoDAO;
import domain.ProductoDTO;
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
    *================================================
    *================ACCIÓN POST======================
    *================================================
    */

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
                case "productos":
                    this.productoCliente(req,res);
                    break;
                case "nosotros":
                    this.nosotrosCliente(req,res);
                    break;
                case "registro":
                    this.registroCliente(req,res);
                    break;
                case "contact":
                    this.contactCliente(req,res);
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
    *================ACCIÓN GET======================
    *================================================
    */
    private void reservaCliente(
        HttpServletRequest req,
        HttpServletResponse res
    )throws ServletException, IOException{
        String idClienteString = req.getParameter("idCliente");
        int idCliente;
        if(idClienteString!=null && !"".equals(idClienteString)){
            idCliente=Integer.parseInt(idClienteString);
        }else{
            idCliente=0;
        }
        //ClienteDTO cliente=new ClienteDAOJDBC().encontrar(new ClienteDTO(idCliente));
        if(idCliente>0){
            req.setAttribute("cliente",idCliente);
            String jspReservar = "/WEB-INF/views/client/reservaCliente.jsp";
            req.getRequestDispatcher(jspReservar).forward(req,res);
        }else if(idCliente==0){this.accionDefault(req, res);}
/*         req.setAttribute("cliente",idCliente);
        String jspReservar = "/WEB-INF/views/client/reservaCliente.jsp";
        req.getRequestDispatcher(jspReservar).forward(req,res); */
    }
//***********************************************************************
//***********************************************************************
    private void productoCliente(
        HttpServletRequest req,
        HttpServletResponse res
    )throws ServletException,IOException{
        String idClienteString = req.getParameter("idCliente");
        int idCliente=0;
        if(idClienteString!=null && !"".equals(idClienteString)){
            idCliente=Integer.parseInt(idClienteString);
        }
        //ClienteDTO cliente=new ClienteDAOJDBC().encontrar(new ClienteDTO(idCliente));

        List<ProductoDTO> productos=new ProductoDAO().seleccionar();
        System.out.println("productos="+productos);
        HttpSession sesion=req.getSession();
        sesion.setAttribute("productos",productos);
        
        req.setAttribute("cliente",idCliente);
        String jspReservar = "/WEB-INF/views/client/productoCliente.jsp";
        req.getRequestDispatcher(jspReservar).forward(req,res);


    }
//***********************************************************************
//***********************************************************************
    private void nosotrosCliente(
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
        String jspReservar = "/WEB-INF/views/client/aboutCliente.jsp";
        req.getRequestDispatcher(jspReservar).forward(req,res);
    }
//***********************************************************************
//***********************************************************************
    private void registroCliente(
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
        String jspReservar = "/WEB-INF/views/client/registroCliente.jsp";
        req.getRequestDispatcher(jspReservar).forward(req,res);
    }
//***********************************************************************
//***********************************************************************
    private void contactCliente(
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
        String jspReservar = "/WEB-INF/views/client/contactCliente.jsp";
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
