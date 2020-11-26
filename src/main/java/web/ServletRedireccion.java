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
        String accion = req.getParameter("accion");
        if(accion != null){
            switch(accion){

                default:
                    this.accionDefault(req, res);
            }
        }else{
            this.accionDefault(req, res);
        }
    }
    @Override
    protected void doGet(
        HttpServletRequest req,
        HttpServletResponse res
    )throws ServletException,IOException{
        String accion = req.getParameter("accion");
        if(accion != null){
            switch(accion){

                default:
                    this.accionDefault(req, res);
            }
        }else{
            this.accionDefault(req, res);
        }
    }
    private void accionDefault(
        HttpServletRequest req,
        HttpServletResponse res
    )throws ServletException,IOException{
        res.sendRedirect("Vista/Principal/PageMain.jsp");
    }
}
