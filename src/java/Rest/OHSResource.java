/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package Rest;

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
import java.util.Collection;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author meetk
 */
@Path("OHS")
public class OHSResource {
    
    @EJB PublishBeanLocal pbl;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of OHSResource
     */
    public OHSResource() {
    }
    
    //CategoryMaster
    
    @POST
    @Path("addCategoryMaster/{CategoryType}")
    public void addCategoryMaster(@PathParam("CategoryType")String category_type) {
   
        pbl.addCategoryMaster(category_type);
    }
    
    @PUT
    @Path("updateCategoryMaster/{CategoryId}/{CategoryType}")
    public void updateCategoryMaster(@PathParam("CategoryId")Integer category_id,@PathParam("CategoryType") String category_type) {
   
      pbl.updateCategoryMaster(category_id, category_type);
    }
    
     @DELETE
    @Path("delCategoryMaster/{CategoryId}")
    public void removeCategoryMaster(@PathParam("CategoryId") Integer category_id) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
        pbl.removeCategoryMaster(category_id);
    }
    
    @GET
    @Path("getAllCategoryMasters")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<CategoryMaster> getAllCategoryMasters() {
        
        return pbl.getAllCategoryMasters();
         }
    
     @GET
    @Path("getCategoryMastersByCategoryType/{CategoryType}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<CategoryMaster> getCategoryMastersByCategoryType(@PathParam("CategoryType")String category_type) {
    
        return pbl.getCategoryMastersByCategoryType(category_type);
    }
    
    @GET
    @Path("findCategoryMasterById/{CategoryId}")
    @Produces(MediaType.APPLICATION_XML)
    public CategoryMaster findCategoryMasterById(@PathParam("CategoryId")Integer category_id) {
     
        return pbl.findCategoryMasterById(category_id);
    }
    
    //CityMaster
    
    @POST
    @Path("addCityMasterToStateMaster/{CityName}/{StateId}")
    public void addCityMaster(@PathParam("CityName")String city_name,@PathParam("StateId") Integer state_id) {
   
        pbl.addCityMaster(city_name, state_id);
    
    }
    
    @PUT
    @Path("updateCityMaster/{CityId}/{CityName}/{StateId}")
    public void updateCityMaster(@PathParam("CityId")Integer city_id,@PathParam("CityName") String city_name, @PathParam("StateId")Integer state_id) {
   
      pbl.updateCityMaster(city_id, city_name, state_id);
    }
    
     @DELETE
    @Path("removeCityMasterToStateMaster/{CityId}")
   public void removeCityMaster(@PathParam("CityId")Integer city_id) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
        pbl.removeCityMaster(city_id);
    }
    
    @GET
    @Path("getAllCityMasters")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<CityMaster> getAllCityMasters() {
        
        return pbl.getAllCityMasters();
         }
    
     @GET
    @Path("getCityMasterOfStateId/{StateId}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<CityMaster> getCityMasterOfStateId(@PathParam("StateId")Integer state_id){
    
        return pbl.getCityMasterOfStateId(state_id);
    }
    
    @GET
    @Path("getCityMastersByCityName/{CityName}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<CityMaster> getCityMastersByCityName(@PathParam("CityName")String city_name) {
     
        return pbl.getCityMastersByCityName(city_name);
    }
    
    @GET
    @Path("findCityMasterById/{CityId}")
    @Produces(MediaType.APPLICATION_XML)
    public CityMaster findCityMasterById(@PathParam("CityId")Integer city_id) {
     
        return pbl.findCityMasterById(city_id);
    }
    
    //Events
    
    @POST
    @Path("addEvents/{EventName}/{Description}")
    public void addEvents(@PathParam("EventName")String event_name,@PathParam("Description") String description) {
   
        pbl.addEvents(event_name, description);
    }
    
    @PUT
    @Path("updateEvents/{EventId}/{EventName}/{Description}")
    public void updateEvents(@PathParam("EventId")Integer event_id, @PathParam("EventName")String event_name,@PathParam("Description") String description) {
   
      pbl.updateEvents(event_id, event_name, description);
    }
    
     @DELETE
    @Path("removeEvents/{EventId}")
    public void removeEvents(@PathParam("EventId")Integer event_id) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
        pbl.removeEvents(event_id);
    }
    
    @GET
    @Path("getAllEvents")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Events> getAllEvents() {
        
        return pbl.getAllEvents();
         }
    
     @GET
    @Path("getEventsByEventName/{EventName}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Events> getEventsByEventName(@PathParam("EventName")String event_name) {
    
        return pbl.getEventsByEventName(event_name);
    }
    
    @GET
    @Path("getEventsByDescription/{Description}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Events> getEventsByDescription(@PathParam("Description")String description) {
    
        return pbl.getEventsByDescription(description);
    }
    
    @GET
    @Path("findEventsById/{EventId}")
    @Produces(MediaType.APPLICATION_XML)
    public Events findEventsById(@PathParam("EventId")Integer event_id) {
     
        return pbl.findEventsById(event_id);
    }
    
    //Feedback
    
    @DELETE
    @Path("removeFeedback/{FeedbackId}")
    public void removeFeedback(@PathParam("FeedbackId")Integer feedback_id) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
        pbl.removeFeedback(feedback_id);
    }
    
    @GET
    @Path("getAllFeedback")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Feedback> getAllFeedback() {
        
        return pbl.getAllFeedback();
         }
    
    @GET
    @Path("findFeedbackById/{FeedbackId}")
    @Produces(MediaType.APPLICATION_XML)
    public Feedback findFeedbackById(@PathParam("FeedbackId")Integer feedback_id) {
     
        return pbl.findFeedbackById(feedback_id);
    }
    
    //Hostel
    
    @POST
    @Path("addHostel/{HostelName}/{CityId}/{StateId}/{PhoneNo}/{CategoryId}")
    public void addHostel(@PathParam("HostelName")String hostel_name, @PathParam("CityId")Integer city_id,@PathParam("StateId")Integer state_id, @PathParam("PhoneNo")String phone_no,@PathParam("CategoryId")Integer category_id) {
   
        pbl.addHostel(hostel_name, city_id, state_id, phone_no, category_id);
    
    }
    
    @PUT
    @Path("updateHostel/{HostelId}/{HostelName}/{CityId}/{StateId}/{PhoneNo}/{CategoryId}")
    public void updateHostel(@PathParam("HostelId")Integer hostel_id,@PathParam("HostelName")String hostel_name, @PathParam("CityId")Integer city_id,@PathParam("StateId")Integer state_id, @PathParam("PhoneNo")String phone_no,@PathParam("CategoryId")Integer category_id) {
   
      pbl.updateHostel(hostel_id, hostel_name, city_id, state_id, phone_no, category_id);
    }
    
     @DELETE
    @Path("removeHostel/{HostelId}")
   public void removeHostel(@PathParam("HostelId") Integer hostel_id) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
        pbl.removeHostel(hostel_id);
    }
    
    @GET
    @Path("getAllHostels")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Hostel> getAllHostels() {
        
        return pbl.getAllHostels();
         }
    
     @GET
    @Path("getHostelsOfCityId/{CityId}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Hostel> getHostelsOfCityId(@PathParam("CityId") Integer city_id){
    
        return pbl.getHostelsOfCityId(city_id);
    }
    
    @GET
    @Path("getHostelsOfStateId/{StateId}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Hostel> getHostelsOfStateId(@PathParam("StateId") Integer state_id){
    
        return pbl.getHostelsOfStateId(state_id);
    }
    
    @GET
    @Path("getHostelsOfCategoryId/{CategoryId}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Hostel> getHostelsOfCategoryId(@PathParam("CategoryId") Integer category_id){
    
        return pbl.getHostelsOfCategoryId(category_id);
    }
    
    
    @GET
    @Path("getHostelsByHostelName/{HostelName}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Hostel> getHostelsByHostelName(@PathParam("HostelName")String hostel_name) {
     
        return pbl.getHostelsByHostelName(hostel_name);
    }
    
    @GET
    @Path("getHostelsByPhoneNo/{PhoneNo}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Hostel> getHostelsByPhoneNo(@PathParam("PhoneNo") String phone_no) {
     
        return pbl.getHostelsByPhoneNo(phone_no);
    }
    
    @GET
    @Path("findHostelById/{HostelId}")
    @Produces(MediaType.APPLICATION_XML)
    public Hostel findHostelById(@PathParam("HostelId") Integer hostel_id) {
     
        return pbl.findHostelById(hostel_id);
    }
    
    //Notice
    
    @POST
    @Path("addNotice/{Description}")
    public void addNotice(@PathParam("Description")String description) {
   
        pbl.addNotice(description);
    }
    
    @PUT
    @Path("updateNotice/{NoticeId}/{Description}")
    public void updateNotice(@PathParam("NoticeId")Integer notice_id,@PathParam("Description") String description) {
   
      pbl.updateNotice(notice_id, description);
    }
    
     @DELETE
    @Path("removeNotice/{NoticeId}")
    public void removeNotice(@PathParam("NoticeId") Integer notice_id) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
        pbl.removeNotice(notice_id);
    }
    
    @GET
    @Path("getAllNotice")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Notice> getAllNotice() {
        
        return pbl.getAllNotice();
         }
    
    
    @GET
    @Path("getNoticeByDescription/{Description}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Notice> getNoticeByDescription(@PathParam("Description") String description) {
    
        return pbl.getNoticeByDescription(description);
    }
    
    @GET
    @Path("findNoticeById/{NoticeId}")
    @Produces(MediaType.APPLICATION_XML)
    public Notice findNoticeById(@PathParam("NoticeId") Integer notice_id) {
     
        return pbl.findNoticeById(notice_id);
    }
    
    //PaymentDetail
    
    @POST
    @Path("addPaymentDetailToPaymentMaster/{PaymentId}/{Cvv}/{BankName}/{IfscCode}")
    public void addPaymentDetail(@PathParam("PaymentId") Integer payment_id,@PathParam("Cvv") Integer cvv,@PathParam("BankName") String bank_name,@PathParam("IfscCode") String ifsc_code) {
   
        pbl.addPaymentDetail(payment_id, cvv, bank_name, ifsc_code);
    }
    
    @PUT
    @Path("updatePaymentDetail/{PaymentDetailId}/{PaymentId}/{Cvv}/{BankName}/{IfscCode}")
    public void updatePaymentDetail(@PathParam("PaymentDetailId") Integer payment_detail_id,@PathParam("PaymentId") Integer payment_id,@PathParam("Cvv") Integer cvv,@PathParam("BankName") String bank_name,@PathParam("IfscCode") String ifsc_code) {
   
        pbl.updatePaymentDetail(payment_detail_id, payment_id, cvv, bank_name, ifsc_code);
    }
    
    @PUT
    @Path("removePaymentDetailToPaymentMaster/{PaymentDetailId}/{PaymentId}")
    public void removePaymentDetail(@PathParam("PaymentDetailId") Integer payment_detail_id,@PathParam("PaymentId") Integer payment_id) {
   
        pbl.removePaymentDetail(payment_detail_id);
    }
    
     @GET
     @Path("getAllPaymentDetails")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<PaymentDetail> getAllPaymentDetails() {
        
        return pbl.getAllPaymentDetails();
         }
    
    @GET
    @Path("getPaymentDetailOfPaymentId/{PaymentId}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<PaymentDetail> getPaymentDetailOfPaymentId(@PathParam("PaymentId") Integer payment_id){
    
        return pbl.getPaymentDetailOfPaymentId(payment_id);
    }
    
    @GET
    @Path("getPaymentDetailsByCvv/{Cvv}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<PaymentDetail> getPaymentDetailsByCvv(@PathParam("Cvv") Integer cvv) {
    
        return pbl.getPaymentDetailsByCvv(cvv);
    }
    
    @GET
    @Path("getPaymentDetailsByBankName/{BankName}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<PaymentDetail> getPaymentDetailsByBankName(@PathParam("BankName") String bank_name) {
    
        return pbl.getPaymentDetailsByBankName(bank_name);
    }
    
    @GET
    @Path("getPaymentDetailsByIfscCode/{IfscCode}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<PaymentDetail> getPaymentDetailsByIfscCode(@PathParam("IfscCode") String ifsc_code) {
    
        return pbl.getPaymentDetailsByIfscCode(ifsc_code);
    }
    
    @GET
    @Path("findPaymentDetailById/{PaymentDetailId}")
    @Produces(MediaType.APPLICATION_XML)
    public PaymentDetail findPaymentDetailById(@PathParam("PaymentDetailId") Integer payment_detail_id) {
     
        return pbl.findPaymentDetailById(payment_detail_id);
    }
    
    //PaymentMaster
    
    @POST
    @Path("addPaymentMaster/{PaymentMode}")
    public void addPaymentMaster(@PathParam("PaymentMode") String payment_mode) {
   
        pbl.addPaymentMaster(payment_mode);
    }
    
    @PUT
    @Path("updatePaymentMaster/{PaymentId}/{PaymentMode}")
    public void updatePaymentMaster(@PathParam("PaymentId") Integer payment_id,@PathParam("PaymentMode") String payment_mode) {
   
      pbl.updatePaymentMaster(payment_id, payment_mode);
    }
    
     @DELETE
    @Path("removePaymentMaster/{PaymentId}")
    public void removePaymentMaster(@PathParam("PaymentId") Integer payment_id) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
        pbl.removePaymentMaster(payment_id);
    }
    
    @GET
    @Path("getAllPaymentMasters")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<PaymentMaster> getAllPaymentMasters() {
        
        return pbl.getAllPaymentMasters();
         }
    
    
    @GET
    @Path("getPaymentMastersByPaymentMode/{PaymentMode}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<PaymentMaster> getPaymentMastersByPaymentMode(@PathParam("PaymentMode") String payment_mode) {
    
        return pbl.getPaymentMastersByPaymentMode(payment_mode);
    }
    
    @GET
    @Path("findPaymentMasterById/{PaymentId}")
    @Produces(MediaType.APPLICATION_XML)
    public PaymentMaster findPaymentMasterById(@PathParam("PaymentId") Integer payment_id) {
     
        return pbl.findPaymentMasterById(payment_id);
    }
    
    //Rules
    
        @POST
    @Path("addRules/{Description}")
    public void addRules(@PathParam("Description")String description) {
   
        pbl.addRules(description);
    }
    
    @PUT
    @Path("updateRules/{RulesId}/{Description}")
    public void updateRules(@PathParam("RulesId") Integer rules_id,@PathParam("Description") String description) {
   
      pbl.updateRules(rules_id, description);
    }
    
     @DELETE
    @Path("removeRules/{RulesId}")
    public void removeRules(@PathParam("RulesId")Integer rules_id) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
        pbl.removeRules(rules_id);
    }
    
    @GET
    @Path("getAllRules")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Rules> getAllRules() {
        
        return pbl.getAllRules();
         }
    
    
    @GET
    @Path("getRulesByDescription/{Description}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Rules> getRulesByDescription(@PathParam("Description")String description) {
    
        return pbl.getRulesByDescription(description);
    }
    
    @GET
    @Path("findRulesById/{RulesId}")
    @Produces(MediaType.APPLICATION_XML)
    public Rules findRulesById(@PathParam("RulesId") Integer rules_id) {
     
        return pbl.findRulesById(rules_id);
    }
    
    //StateMaster
    
    @POST
    @Path("addStateMaster/{StateName}")
    public void addStateMaster(@PathParam("StateName") String state_name) {
   
        pbl.addStateMaster(state_name);
    }
    
    @PUT
    @Path("updateStateMaster/{StateId}/{StateName}")
    public void updateStateMaster(@PathParam("StateId") Integer state_id,@PathParam("StateName") String state_name) {
   
      pbl.updateStateMaster(state_id, state_name);
    }
    
     @DELETE
    @Path("removeStateMaster/{StateId}")
    public void removeStateMaster(@PathParam("StateId") Integer state_id) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
        pbl.removeStateMaster(state_id);
    }
    
    @GET
    @Path("getAllStateMasters")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<StateMaster> getAllStateMasters() {
        
        return pbl.getAllStateMasters();
         }
    
    
    @GET
    @Path("getStateMastersByStateName/{StateName}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<StateMaster> getStateMastersByStateName(@PathParam("StateName")String state_name) {
    
        return pbl.getStateMastersByStateName(state_name);
    }
    
    @GET
    @Path("findStateMasterById/{StateId}")
    @Produces(MediaType.APPLICATION_XML)
    public StateMaster findStateMasterById(@PathParam("StateId")Integer state_id) {
     
        return pbl.findStateMasterById(state_id);
    }
    
    
    //Timelist
    
    @POST
    @Path("addTimelist/{Time}/{Day}")
    public void addTimelist(@PathParam("Time") String time,@PathParam("Day") String day) {
   
        pbl.addTimelist(time, day);
    }
    
    @PUT
    @Path("updateTimelist/{TimelistId}/{Time}/{Day}")
    public void updateTimelist(@PathParam("TimelistId")Integer timelist_id,@PathParam("Time") String time,@PathParam("Day") String day) {
   
      pbl.updateTimelist(timelist_id, time, day);
    }
    
     @DELETE
    @Path("removeTimelist/{TimelistId}")
    public void removeTimelist(@PathParam("TimelistId")Integer timelist_id) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
        pbl.removeTimelist(timelist_id);
    }
    
    @GET
     @Path("getAllTimelist")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Timelist> getAllTimelist() {
        
        return pbl.getAllTimelist();
         }
    
    
    @GET
    @Path("getTimelistByTime/{Time}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Timelist> getTimelistByTime(@PathParam("Time") String time) {
    
        return pbl.getTimelistByTime(time);
    }
    
    @GET
    @Path("getTimelistByDay/{Day}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Timelist> getTimelistByDay(@PathParam("Day")String day) {
    
        return pbl.getTimelistByDay(day);
    }
    
    @GET
    @Path("findTimelistById/{TimelistId}")
    @Produces(MediaType.APPLICATION_XML)
    public Timelist findTimelistById(@PathParam("TimelistId") Integer timelist_id) {
     
        return pbl.findTimelistById(timelist_id);
    }
    
    //Room
    
    @POST
    @Path("addRoom/{RoomType}/{CategoryId}/{HostelId}/{RoomPrice}/{RoomStatus}/{NoOfStudent}")
    public void addRoom(@PathParam("RoomType")String room_type,@PathParam("CategoryId") Integer category_id,@PathParam("HostelId")Integer hostel_id,@PathParam("RoomPrice") Integer room_price,@PathParam("RoomStatus") Boolean room_status,@PathParam("NoOfStudent") Integer no_of_student) {
   
        pbl.addRoom(room_type, category_id, hostel_id, room_price, room_status, no_of_student);
    
    }
    
    @PUT
    @Path("updateRoom/{RoomId}/{RoomType}/{CategoryId}/{HostelId}/{RoomPrice}/{RoomStatus}/{NoOfStudent}")
    public void updateRoom(@PathParam("RoomId")Integer room_id,@PathParam("RoomType")String room_type,@PathParam("CategoryId") Integer category_id,@PathParam("HostelId")Integer hostel_id,@PathParam("RoomPrice") Integer room_price,@PathParam("RoomStatus") Boolean room_status,@PathParam("NoOfStudent") Integer no_of_student) {
   
      pbl.updateRoom(room_id, room_type, category_id, hostel_id, room_price, room_status, no_of_student);
    }
    
     @DELETE
    @Path("removeRoom/{RoomId}")
   public void removeRoom(@PathParam("RoomId") Integer room_id) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
        pbl.removeRoom(room_id);
    }
    
    @GET
    @Path("getAllRooms")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Room> getAllRooms() {
        
        return pbl.getAllRooms();
         }
    
     @GET
    @Path("getRoomsOfCategoryId/{CategoryId}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Room> getRoomsOfCategoryId(@PathParam("CategoryId")Integer category_id){
    
        return pbl.getRoomsOfCategoryId(category_id);
    }
    
    @GET
    @Path("getRoomsOfHostelId/{HostelId}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Room> getRoomsOfHostelId(@PathParam("HostelId")Integer hostel_id){
    
        return pbl.getRoomsOfHostelId(hostel_id);
    }
    
    @GET
    @Path("getRoomsByRoomType/{RoomType}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Room> getRoomsByRoomType(@PathParam("RoomType")String room_type){
    
        return pbl.getRoomsByRoomType(room_type);
    }
    
    
    @GET
    @Path("getRoomsByRoomPrice/{RoomPrice}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Room> getRoomsByRoomPrice(@PathParam("RoomPrice")Integer room_price) {
     
        return pbl.getRoomsByRoomPrice(room_price);
    }
    
    @GET
    @Path("getRoomsByRoomtStatus/{RoomStatus}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Room> getRoomsByRoomtStatus(@PathParam("RoomStatus")Boolean room_status) {
     
        return pbl.getRoomsByRoomtStatus(room_status);
    }
    
    @GET
    @Path("getRoomsByNoOfStudent/{NoOfStudent}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Room> getRoomsByNoOfStudent(@PathParam("NoOfStudent")Integer no_of_student) {
     
        return pbl.getRoomsByNoOfStudent(no_of_student);
    }
    
    @GET
    @Path("findRoomById/{RoomId}")
    @Produces(MediaType.APPLICATION_XML)
    public Room findRoomById(@PathParam("RoomId")Integer room_id) {
     
        return pbl.findRoomById(room_id);
    }
    
    //UserMaster
    
    @POST
    @Path("addUserMaster/{Username}/{FirstName}/{LastName}/{Address}/{PhoneNo}/{Dob}/{Gender}/{Photo}/{UserEmail}/{Password}/{FatherName}/{FOccupation}/{FPhoneNo}/{FEmail}/{MotherName}/{MOccupation}/{Nationality}/{CityId}/{StateId}/{Pincode}/{Admin}")
    public void addUserMaster(@PathParam("Username")String username,@PathParam("FirstName")String first_name,@PathParam("LastName") String last_name,@PathParam("Address") String address,@PathParam("PhoneNo") String phone_no,@PathParam("Dob") String dob,@PathParam("Gender") String gender,@PathParam("Photo") String photo,@PathParam("UserEmail") String user_email,@PathParam("Password") String password,@PathParam("FatherName") String father_name,@PathParam("FOccupation") String f_occupation,@PathParam("FPhoneNo") String f_phone_no,@PathParam("FEmail") String f_email,@PathParam("MotherName") String mother_name,@PathParam("MOccupation") String m_occupation,@PathParam("Nationality") String nationality,@PathParam("CityId") Integer city_id,@PathParam("StateId")Integer state_id,@PathParam("Pincode") Integer pincode ,@PathParam("Admin") String admin) {
   
        pbl.addUserMaster(username, first_name, last_name, address, phone_no, dob, gender, photo, user_email, password, father_name, f_occupation, f_phone_no, f_email, mother_name, m_occupation, nationality, city_id, state_id, pincode, admin);
    
    }
    
    @PUT
    @Path("updateUserMaster/{userId}/{FirstName}/{LastName}/{Address}/{PhoneNo}/{Dob}/{Gender}/{Photo}/{UserEmail}/{Password}/{FatherName}/{FOccupation}/{FPhoneNo}/{FEmail}/{MotherName}/{MOccupation}/{Nationality}/{CityId}/{StateId}/{Pincode}")
    public void updateUserMaster(@PathParam("userId")Integer user_id,@PathParam("FirstName")String first_name,@PathParam("LastName") String last_name,@PathParam("Address") String address,@PathParam("PhoneNo") String phone_no,@PathParam("Dob") String dob,@PathParam("Gender") String gender,@PathParam("Photo") String photo,@PathParam("UserEmail") String user_email,@PathParam("Password") String password,@PathParam("FatherName") String father_name,@PathParam("FOccupation") String f_occupation,@PathParam("FPhoneNo") String f_phone_no,@PathParam("FEmail") String f_email,@PathParam("MotherName") String mother_name,@PathParam("MOccupation") String m_occupation,@PathParam("Nationality") String nationality,@PathParam("CityId") Integer city_id,@PathParam("StateId")Integer state_id,@PathParam("Pincode") Integer pincode ) {
   
      pbl.updateUserMaster(user_id, first_name, last_name, address, phone_no, dob, gender, photo, user_email, password, father_name, f_occupation, f_phone_no, f_email, mother_name, m_occupation, nationality, city_id, state_id, pincode);
    }
    
     @DELETE
    @Path("removeUserMaster/{userId}")
   public void removeUserMaster(@PathParam("userId")Integer user_id) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
        pbl.removeUserMaster(user_id);
    }
   
    @GET
    @Path("getAllUserMasters")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<UserMaster> getAllUserMasters() {
        
        return pbl.getAllUserMasters();
         }
    
    @GET
    @Path("getUserMastersOfCityId/{CityId}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<UserMaster> getUserMastersOfCityId(@PathParam("CityId")Integer city_id){
    
        return pbl.getUserMastersOfCityId(city_id);
    }
    
    @GET
    @Path("getUserMastersOfStateId/{StateId}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<UserMaster> getUserMastersOfStateId(@PathParam("StateId")Integer state_id){
    
        return pbl.getUserMastersOfStateId(state_id);
    }
    
    @GET
    @Path("getUserMasterByUserName/{Username}")
    @Produces(MediaType.APPLICATION_XML)
    public UserMaster getUserMasterByUserName(@PathParam("Username")String username){
    
        return pbl.getUserMasterByUserName(username);
    }
    
    @GET
    @Path("getUserMastersByFirstName/{FirstName}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<UserMaster> getUserMastersByFirstName(@PathParam("FirstName")String first_name){
    
        return pbl.getUserMastersByFirstName(first_name);
    }
    
    @GET
    @Path("getUserMastersByLastName/{LastName}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<UserMaster> getUserMastersByLastName(@PathParam("LastName")String last_name){
    
        return pbl.getUserMastersByLastName(last_name);
    }
    
    @GET
    @Path("getUserMastersByAddress/{Address}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<UserMaster> getUserMastersByAddress(@PathParam("Address")String address){
    
        return pbl.getUserMastersByAddress(address);
    }
    
    @GET
    @Path("getUserMastersByPhoneNo/{PhoneNo}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<UserMaster> getUserMastersByPhoneNo(@PathParam("PhoneNo")String phone_no){
    
        return pbl.getUserMastersByPhoneNo(phone_no);
    }
    
    @GET
    @Path("getUserMastersByDob/{dob}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<UserMaster> getUserMastersByDob(@PathParam("Dob")String dob){
    
        return pbl.getUserMastersByDob(dob);
    }
    
    @GET
    @Path("getUserMastersByGender/{Gender}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<UserMaster> getUserMastersByGender(@PathParam("Gender")String gender){
    
        return pbl.getUserMastersByGender(gender);
    }
    
    @GET
    @Path("getUserMastersByPhoto/{Photo}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<UserMaster> getUserMastersByPhoto(@PathParam("Photo")String photo){
    
        return pbl.getUserMastersByPhoto(photo);
    }
    
    @GET
    @Path("getUserMastersByUserEmail/{UserEmail}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<UserMaster> getUserMastersByUserEmail(@PathParam("UserEmail")String user_email){
    
        return pbl.getUserMastersByUserEmail(user_email);
    }
    
    @GET
    @Path("getUserMastersByPassword/{Password}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<UserMaster> getUserMastersByPassword(@PathParam("Password")String password){
    
        return pbl.getUserMastersByPassword(password);
    }
    
    @GET
    @Path("getUserMastersByFatherName/{FatherName}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<UserMaster> getUserMastersByFatherName(@PathParam("FatherName")String father_name){
    
        return pbl.getUserMastersByFatherName(father_name);
    }
    
    @GET
    @Path("getUserMastersByFOccupation/{FOccupation}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<UserMaster> getUserMastersByFOccupation(@PathParam("FOccupation")String f_occupation){
    
        return pbl.getUserMastersByFOccupation(f_occupation);
    }
    
    @GET
    @Path("getUserMastersByFPhoneNo/{FPhoneNo}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<UserMaster> getUserMastersByFPhoneNo(@PathParam("FPhoneNo")String f_phone_no){
    
        return pbl.getUserMastersByFPhoneNo(f_phone_no);
    }
    
    @GET
    @Path("getUserMastersByFEmail/{FEmail}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<UserMaster> getUserMastersByFEmail(@PathParam("FEmail")String f_email){
    
        return pbl.getUserMastersByFEmail(f_email);
    }
    
    @GET
    @Path("getUserMastersByMotherName/{MotherName}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<UserMaster> getUserMastersByMotherName(@PathParam("MotherName")String mother_name){
    
        return pbl.getUserMastersByMotherName(mother_name);
    }
    
    @GET
    @Path("getUserMastersByMOccupation/{MOccupation}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<UserMaster> getUserMastersByMOccupation(@PathParam("MOccupation")String m_occupation){
    
        return pbl.getUserMastersByMOccupation(m_occupation);
    }
    
    @GET
    @Path("getUserMastersByNationality/{Nationality}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<UserMaster> getUserMastersByNationality(@PathParam("Nationality")String nationality){
    
        return pbl.getUserMastersByNationality(nationality);
    }
    
    @GET
    @Path("getUserMastersByPincode/{Pincode}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<UserMaster> getUserMastersByPincode(@PathParam("Pincode")Integer pincode){
    
        return pbl.getUserMastersByPincode(pincode);
    }
    
    @GET
    @Path("findUserMasterById/{userId}")
    @Produces(MediaType.APPLICATION_XML)
    public UserMaster findUserMasterById(@PathParam("userId")Integer user_id) {
     
        return pbl.findUserMasterById(user_id);
    }
    
    //Booking
    
        @POST
    @Path("addBooking/{userId}/{RoomId}/{PaymentId}/{BookingDate}")
    public void addBooking(@PathParam("userId")Integer user_id,@PathParam("RoomId")Integer room_id,@PathParam("PaymentId")Integer payment_id,@PathParam("BookingDate") String booking_date) {
   
        pbl.addBooking(user_id, room_id, payment_id, booking_date);
    
    }
    
    @PUT
    @Path("updateBooking/{BookingId}/{userId}/{RoomId}/{PaymentId}/{BookingDate}")
    public void updateBooking(@PathParam("BookingId")Integer booking_id,@PathParam("userId")Integer user_id,@PathParam("RoomId")Integer room_id,@PathParam("PaymentId")Integer payment_id,@PathParam("BookingDate") String booking_date) {
   
      pbl.updateBooking(booking_id, user_id, room_id, payment_id, booking_date);
    }
    
     @DELETE
    @Path("removeBooking/{BookingId}")
   public void removeBooking(@PathParam("BookingId")Integer booking_id) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
        pbl.removeBooking(booking_id);
    }
    
    @GET
    @Path("getAllBookings")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Booking> getAllBookings() {
        
        return pbl.getAllBookings();
         }
    
     @GET
    @Path("getBookingsOfUserMaster/{userId}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Booking> getBookingsOfUserMaster(@PathParam("userId")Integer user_id){
    
        return pbl.getBookingsOfUserMaster(user_id);
    }
    
    @GET
    @Path("getBookingsOfRoom/{RoomId}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Booking> getBookingsOfRoom(@PathParam("RoomId")Integer room_id){
    
        return pbl.getBookingsOfRoom(room_id);
    }
    
    @GET
    @Path("getBookingsOfPaymentId/{PaymentId}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Booking> getBookingsOfPaymentId(@PathParam("PaymentId")Integer payment_id){
    
        return pbl.getBookingsOfPaymentId(payment_id);
    }
    
    
    @GET
    @Path("getBookingsByBookingDate/{BookingDate}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Booking> getBookingsByBookingDate(@PathParam("BookingDate")String booking_date) {
     
        return pbl.getBookingsByBookingDate(booking_date);
    }
    
    @GET
    @Path("findBookingById/{BookingId}")
    @Produces(MediaType.APPLICATION_XML)
    public Booking findBookingById(@PathParam("BookingId")Integer booking_id) {
     
        return pbl.findBookingById(booking_id);
    }
    
    /**
     * Retrieves representation of an instance of Rest.OHSResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of OHSResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
