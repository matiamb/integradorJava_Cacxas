
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import logica.Controladora;
import logica.Orador;

@WebServlet(name = "SvOrador", urlPatterns = {"/SvOrador"})
public class SvOrador extends HttpServlet {

    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String mail = request.getParameter("mail");
        String tema = request.getParameter("tema");
        
        Orador ora = new Orador(0 ,nombre, apellido, mail, tema, java.time.LocalDate.now());
        control.crearOrador(ora);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
