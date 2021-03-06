package Control;

import Modelo.ModelArticulo;
import Modelo.ModelUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class devolverImagenServicio extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String nickU = request.getParameter("nickP");
            //System.out.println(nickU);
            String nomA = request.getParameter("nomA");
            //System.out.println(nomA);
            String campo = "imagen";
            campo += request.getParameter("campo");
            //System.out.println(campo);
            
            response.setContentType("image/jpg");
            try{
                ModelArticulo modArt = new ModelArticulo();
                byte[] img = modArt.getImagen(nickU, nomA, campo);
                ServletOutputStream oStream = response.getOutputStream();
                if (img != null)
                    oStream.write(img);
                oStream.flush();
                oStream.close();
            }catch(Exception e){   
            }
            
        } finally {

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
