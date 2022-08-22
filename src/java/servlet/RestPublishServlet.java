/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import Client.PublishClient;
import Entity.Booking;
import Entity.CategoryMaster;
import Entity.CityMaster;
import Entity.Events;
import Entity.Feedback;
import Entity.Hostel;
import Entity.Notice;
import Entity.PaymentDetail;
import Entity.PaymentMaster;
import Entity.Room;
import Entity.Rules;
import Entity.StateMaster;
import Entity.Timelist;
import Entity.UserMaster;
import ejb.PublishBeanLocal;
import ejb.UserBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

/**
 *
 * @author meetk
 */
@WebServlet(name = "RestPublishServlet", urlPatterns = {"/RestPublishServlet"})
public class RestPublishServlet extends HttpServlet {
    
    @EJB PublishBeanLocal pb;
    @EJB UserBeanLocal ubl;

    PublishClient pbl;
    Response res;
    Collection<CategoryMaster> category;
    GenericType<Collection<CategoryMaster>> gcategory;
    Collection<CityMaster> city;
    GenericType<Collection<CityMaster>> gcity;
    Collection<Events> event;
    GenericType<Collection<Events>> gevent;
    Collection<Feedback> feedback;
    GenericType<Collection<Feedback>> gfeedback;
    Collection<Hostel> hostel;
    GenericType<Collection<Hostel>> ghostel;
    Collection<Notice> notice;
    GenericType<Collection<Notice>> gnotice;
    Collection<PaymentDetail> paymentdetail;
    GenericType<Collection<PaymentDetail>> gpaymentdetail;
    Collection<PaymentMaster> paymentmaster;
    GenericType<Collection<PaymentMaster>> gpaymentmaster;
    Collection<Rules> rules;
    GenericType<Collection<Rules>> grules;
    Collection<StateMaster> statemaster;
    GenericType<Collection<StateMaster>> gstatemaster;
    Collection<Timelist> timelist;
    GenericType<Collection<Timelist>> gtimelist;
    Collection<Room> room;
    GenericType<Collection<Room>> groom;
    Collection<UserMaster> user;
    GenericType<Collection<UserMaster>> guser;
    Collection<Booking> booking;
    GenericType<Collection<Booking>> gbooking;
    
    
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
            out.println("<title>Servlet RestPublishServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            pbl = new PublishClient();
            category = new ArrayList<CategoryMaster>();
            city = new ArrayList<CityMaster>();
            event = new ArrayList<Events>();
            feedback = new ArrayList<Feedback>();
            hostel = new ArrayList<Hostel>();
            notice = new ArrayList<Notice>();
            paymentdetail = new ArrayList<PaymentDetail>();
            paymentmaster = new ArrayList<PaymentMaster>();
            rules = new ArrayList<Rules>();
            statemaster = new ArrayList<StateMaster>();
            timelist = new ArrayList<Timelist>();
            room = new ArrayList<Room>();
            user = new ArrayList<UserMaster>();
            booking = new ArrayList<Booking>();
            
            gcategory = new GenericType<Collection<CategoryMaster>>(){};
            gcity = new GenericType<Collection<CityMaster>>(){};
            gevent = new GenericType<Collection<Events>>(){};
            gfeedback = new GenericType<Collection<Feedback>>(){};
            ghostel = new GenericType<Collection<Hostel>>(){};
            gnotice = new GenericType<Collection<Notice>>(){};
            gpaymentdetail = new GenericType<Collection<PaymentDetail>>(){};
            gpaymentmaster = new GenericType<Collection<PaymentMaster>>(){};
            grules = new GenericType<Collection<Rules>>(){};
            gstatemaster = new GenericType<Collection<StateMaster>>(){};
            gtimelist = new GenericType<Collection<Timelist>>(){};
            groom = new GenericType<Collection<Room>>(){};
            guser = new GenericType<Collection<UserMaster>>(){};
            gbooking = new GenericType<Collection<Booking>>(){};
            
            out.println("<h3>");
            
//            res = pbl.getAllCategoryMasters(Response.class);
//            category = res.readEntity(gcategory);
//            
//            for(CategoryMaster c : category)
//            {
//                out.println("<br/>Category Id : "+c.getCategoryId()+"<br/>Category Type : "+c.getCategoryType());
//             
//                res = pbl.getHostelsOfCategoryId(Response.class, c.getCategoryId().toString());
//           
//                hostel = res.readEntity(ghostel);
//                for(Hostel h : hostel)
//                {
//                    out.println("<br/><br/>Hostel Id : "+h.getHostelId()+"<br/>Hostel Name : "+h.getHostelName()+"<br/>Mobile No : "+h.getPhoneNo());   
//                   
//                }
//                
//                res = pbl.getRoomsOfCategoryId(Response.class, c.getCategoryId().toString());
//                room = res.readEntity(groom);
//                for(Room r : room)
//                {
//                out.println("<br/><br/>Room Id : "+r.getRoomId()+"<br/>Room Type : "+r.getRoomType()+"<br/>Room Price : "+r.getRoomPrice()+"<br/>Room Status : "+r.getRoomStatus()+"<br/>No Of Student : "+r.getNoOfStudent());
//                }
//
//            }
//             
//            res = pbl.getAllStateMasters(Response.class);
//            statemaster = res.readEntity(gstatemaster);
//            for(StateMaster s : statemaster)
//            {
//                out.println("<br/><br/>State Id : "+s.getStateId()+"<br/>State Name : "+s.getStateName());
//                
//                res = pbl.getCityMasterOfStateId(Response.class, s.getStateId().toString());
//                city = res.readEntity(gcity);
//                for(CityMaster c : city)
//                {
//                    out.println("<br/><br/>City Id : "+c.getCityId()+"<br/>City Name : "+c.getCityName());
//                    
//                }
//                
//            }
//            
//            res = pbl.getAllEvents(Response.class);
//            event = res.readEntity(gevent);
//            for(Events e : event)
//            {
//                out.println("<br/><br/>Event Id : "+e.getEventId()+"<br/>Event Name : "+e.getEventName()+"<br/>Description : "+e.getDescription());
//            }
//            
//            res = pbl.getAllFeedback(Response.class);
//            feedback = res.readEntity(gfeedback);
//            for(Feedback f : feedback)
//            {
//                out.println("<br/><br/>Feedback Id : "+f.getFeedbackId()+"<br/>Comments : "+f.getComments());
//            } 
//            
//            res = pbl.getAllNotice(Response.class);
//            notice = res.readEntity(gnotice);
//            for(Notice n : notice)
//            {
//                out.println("<br/><br/>Notice Id : "+n.getNoticeId()+"<br/>Description : "+n.getDescription());
//            }
//            
//            res = pbl.getAllRules(Response.class);
//            rules = res.readEntity(grules);
//            for(Rules r : rules)
//            {
//                out.println("<br/><br/>Rules Id : "+r.getRulesId()+"<br/>Description : "+r.getDescription());
//            }
//            
//            res = pbl.getAllTimelist(Response.class);
//            timelist = res.readEntity(gtimelist);
//            for(Timelist t : timelist)
//            {
//                out.println("<br/><br/>Timelist Id : "+t.getTimelistId()+"<br/>Time : "+t.getTime()+"<br/>Day : "+t.getDay());
//            }
//            
            out.println("</h3>");
            
            //pb.addBooking(55, 3, 1, "17-02-2022");
            
            out.println("<h1>Servlet RestPublishServlet at " + request.getContextPath() + "</h1>");
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
