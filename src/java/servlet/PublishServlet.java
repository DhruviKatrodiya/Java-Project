/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import ejb.PublishBeanLocal;
import ejb.UserBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author meetk
 */
@WebServlet(name = "PublishServlet", urlPatterns = {"/PublishServlet"})
public class PublishServlet extends HttpServlet {
    
    @EJB PublishBeanLocal pbl;
    @EJB UserBeanLocal ubl;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PublishServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            //pbl.updateBooking(2, 3, 3, "12-02-2013");
            //pbl.addBooking(55, 3, 1, "16-02-2022");
            //pbl.updateBooking(2, 47, 3, 1, "15-02-2022");
            //pbl.removeBooking(2);
            //pbl.removeUserMaster("Dhruvi");
            //pbl.addUserMaster("Krinal", "krinal", "katrodiya", "pasodara", "7584964589", "02-10-1999", "female", "blank", "krinal01@gmail.com", "krinal0210", "vijaybhai", "dairy", "9458697458", "vijayd01@gmail.com", "ashaben", "housewife", "indian", 3, 3, 395006, "Admin");
            //pbl.updateUserMaster(47,"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 3, 2, 395006);
            //pbl.updateUserMaster(55, "gvj", "gvj", "hgfjh", "4582156", "22-04-2022", "mnk", "sgvaj", "sgfaj@gmail.com", "gjygk", "gkjhk", "kjdhfk", "dhg", "dshgk@gmail.com", "sahgj", "sahgsja", "shaj", 2, 3, 395006);
            //pbl.removeUserMaster(47);
            //pbl.addHostel("vnsgu", 3, 2, "7654678909", 2);
            //pbl.updateHostel(4, "jpdawar", 2, 3, "7865748675", 3);
            //pbl.removeHostel(4);
            //pbl.addRoom("single", 4,3, 17000, true, 3);
            //pbl.updateRoom(3, "double", 3, 3, 10000, true, 3);
            //pbl.removeRoom(5);
            //pbl.updatePaymentDetail(2, 1, 233, "baroda", "hagka123");
            //pbl.addPaymentDetail(1, 555, "hdfc", "hsks012102");
            //pbl.addUserMaster("Admin", "shilpa", "maniya", "hirabaug", "7485964785", "16-12-2000", "female", "admin.jpg", "shilu.maniya@gmail.com", "Admin", "premjibhai", "diamond", "8596741236", "premjibhai@gmail.com", "savitaben", "housewife", "indian", 4, 4, 395006, "Admin");
            //pbl.addUserMaster("dhruvi", "dhruvii", "katrodiya", "hirabaug", "7485126385", "22-01-2001", "female", "blank.jpg", "dhruvikatrodiya01@gmail.com", "dhruvi", "pareshbhai", "ambroidary", "8545259674", "pareshkatrodiya@gmail.com", "geetaben", "housewife", "indian", 4, 4, 395006, "Admin");
            //pbl.addFacilities(5, "wi-fi,cctv,lobby,restaurant only...");
            //pbl.addFacilities(7, "wifi,cctv,loobby,restaurant,swimming pool only...");
            //pbl.addFacilities(5, "no facilities");
            //pbl.updateFacilities(1, 5, "wi-fi,cctv,lobby,restaurant,garden only...");
            pbl.removeFacilities(3);
            
            out.println("<h1>Servlet PublishServlet at " + request.getContextPath() + "</h1>");
            
            
            out.println("</body>");
            out.println("</html>");
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
