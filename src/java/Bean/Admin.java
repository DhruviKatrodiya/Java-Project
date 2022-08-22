/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package beans;

import Entity.Booking;
import Entity.CategoryMaster;
import Entity.CityMaster;
import Entity.Events;
import Entity.Facilities;
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
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Admin
 */
@Named(value = "Admin")
@RequestScoped
public class Admin {
    
    //CategoryMaster
    private int category_id;
    private String category_type;
    private Collection<CategoryMaster> category;
    
    //StateMaster
    private int state_id;
    private String state_name;
    private Collection<StateMaster> state;
    
    //PaymentMaster
    private int payment_id;
    private String payment_mode;
    private Collection<PaymentMaster> payment;
    
    //Events
    
    private int event_id;
    private String event_name;
    private String description;
    private Collection<Events> event;
    
    //Rules
    
    private int rules_id;
    private String descriptions;
    private Collection<Rules> rule; 
    
    //Notice
    
    private int notice_id;
    private String ndescriptions;
    private Collection<Notice> notice;
    
    //Feedback
    
    private int feedback_id;
    private String comments;
    private Collection<Feedback> feedback;
    
    //Timelist
    
    private int timelist_id;
    private String time;
    private String day;
    private Collection<Timelist> timelist;
    
    //CityMaster
    
   private int city_id;
   private String city_name;
   private Collection<CityMaster> citymaster;
    
    //PaymentDetail
    
    private int payment_detail_id;
    private int cvv;
    private String bank_name;
    private String ifsc_code;
    private Collection<PaymentDetail> paymentdetail;
    
    //Hostel
    
    private int hostel_id;
    private String hostel_name;
    private String phone_no;
    private Collection<Hostel> hostel;
    
    //Room
    
    private int room_id;
    private String room_type;
    private int room_price;
    private Boolean room_status;
    private int no_of_student;
    private Collection<Room> room;
    
    //UserMaster
                    
    private int user_id;
    private String username;
    private String first_name;
    private String last_name;
    private String address;
    //private String phone_no;
    private String dob;
    private String gender;
    private String photo;
    private String user_email;
    private String password;
    private String father_name;
    private String f_occupation;
    private String f_phone_no;
    private String f_email;
    private String mother_name;
    private String m_occupation;
    private String nationality;
    private int pincode;
    private Collection<UserMaster> usermaster;
    
    //Booking 
    
    private int booking_id;
    private String booking_date;
    private Collection<Booking> booking;
    
    //Facilities
    
    private int facilities_id;
    private String facilities_detail;
    private Collection<Facilities> facilities;
    
    @EJB PublishBeanLocal pbl;
    
    //Facilities

    public int getFacilities_id() {
        return facilities_id;
    }

    public void setFacilities_id(int facilities_id) {
        this.facilities_id = facilities_id;
    }

    public String getFacilities_detail() {
        return facilities_detail;
    }

    public void setFacilities_detail(String facilities_detail) {
        this.facilities_detail = facilities_detail;
    }

    public Collection<Facilities> getFacilities() {
        this.facilities = pbl.getAllFacilities();
        return facilities;
    }

    public void setFacilities(Collection<Facilities> facilities) {
        this.facilities = facilities;
    }
    
    
    
    //Booking

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public String getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(String booking_date) {
        this.booking_date = booking_date;
    }

    public Collection<Booking> getBooking() {
        this.booking = pbl.getAllBookings();
        return booking;
    }

    public void setBooking(Collection<Booking> booking) {
        this.booking = booking;
    }
    
    
    
    //UserMaster

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public String getF_occupation() {
        return f_occupation;
    }

    public void setF_occupation(String f_occupation) {
        this.f_occupation = f_occupation;
    }

    public String getF_phone_no() {
        return f_phone_no;
    }

    public void setF_phone_no(String f_phone_no) {
        this.f_phone_no = f_phone_no;
    }

    public String getF_email() {
        return f_email;
    }

    public void setF_email(String f_email) {
        this.f_email = f_email;
    }

    public String getMother_name() {
        return mother_name;
    }

    public void setMother_name(String mother_name) {
        this.mother_name = mother_name;
    }

    public String getM_occupation() {
        return m_occupation;
    }

    public void setM_occupation(String m_occupation) {
        this.m_occupation = m_occupation;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public Collection<UserMaster> getUsermaster() {
        this.usermaster = pbl.getAllUserMasters();
        return usermaster;
    }

    public void setUsermaster(Collection<UserMaster> usermaster) {
        this.usermaster = usermaster;
    }
    
    
    
    //Room

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public int getRoom_price() {
        return room_price;
    }

    public void setRoom_price(int room_price) {
        this.room_price = room_price;
    }

    public Boolean getRoom_status() {
        return room_status;
    }

    public void setRoom_status(Boolean room_status) {
        this.room_status = room_status;
    }

    public int getNo_of_student() {
        return no_of_student;
    }

    public void setNo_of_student(int no_of_student) {
        this.no_of_student = no_of_student;
    }

    public Collection<Room> getRoom() {
        this.room = pbl.getAllRooms();
        return room;
    }

    public void setRoom(Collection<Room> room) {
        this.room = room;
    }
    
    
    
    //Hostel

    public int getHostel_id() {
        return hostel_id;
    }

    public void setHostel_id(int hostel_id) {
        this.hostel_id = hostel_id;
    }

    public String getHostel_name() {
        return hostel_name;
    }

    public void setHostel_name(String hostel_name) {
        this.hostel_name = hostel_name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public Collection<Hostel> getHostel() {
        this.hostel = pbl.getAllHostels();
        return hostel;
    }

    public void setHostel(Collection<Hostel> hostel) {
        this.hostel = hostel;
    }
    
    
    
    //PaymentDetail

    public int getPayment_detail_id() {
        return payment_detail_id;
    }

    public void setPayment_detail_id(int payment_detail_id) {
        this.payment_detail_id = payment_detail_id;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getIfsc_code() {
        return ifsc_code;
    }

    public void setIfsc_code(String ifsc_code) {
        this.ifsc_code = ifsc_code;
    }

    public Collection<PaymentDetail> getPaymentdetail() {
        this.paymentdetail = pbl.getAllPaymentDetails();
        return paymentdetail;
    }

    public void setPaymentdetail(Collection<PaymentDetail> paymentdetail) {
        this.paymentdetail = paymentdetail;
    }
    
    //CityMaster

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public Collection<CityMaster> getCitymaster() {
        this.citymaster = pbl.getAllCityMasters();
        return citymaster;
    }

    public void setCitymaster(Collection<CityMaster> citymaster) {
        this.citymaster = citymaster;
    }

    

    //CategoryMaster

    public Collection<CategoryMaster> getCategory() {
        return pbl.getAllCategoryMasters();
    }

    public void setCategory(Collection<CategoryMaster> category) {
        this.category = category;
    }
    
    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_type() {
        return category_type;
    }

    public void setCategory_type(String category_type) {
        this.category_type = category_type;
    }
    
    //StateMaster

    public Collection<StateMaster> getState() {
        return pbl.getAllStateMasters();
    }

    public void setState(Collection<StateMaster> state) {
        this.state = state;
    }

    public int getState_id() {
        return state_id;
    }

    public void setState_id(int state_id) {
        this.state_id = state_id;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    //PaymentMaster
    
    public Collection<PaymentMaster> getPayment() {
        return pbl.getAllPaymentMasters();
    }

    public void setPayment(Collection<PaymentMaster> payment) {
        this.payment = payment;
    }
    
    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public String getPayment_mode() {
        return payment_mode;
    }

    public void setPayment_mode(String payment_mode) {
        this.payment_mode = payment_mode;
    }
    
    //Event

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Events> getEvent() {
        return pbl.getAllEvents();
    }

    public void setEvent(Collection<Events> event) {
        this.event = event;
    }
    
    //Rules

    public int getRules_id() {
        return rules_id;
    }

    public void setRules_id(int rules_id) {
        this.rules_id = rules_id;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Collection<Rules> getRule() {
        return pbl.getAllRules();
    }

    public void setRule(Collection<Rules> rule) {
        this.rule = rule;
    }

    //Notice
    
    public int getNotice_id() {
        return notice_id;
    }

    public void setNotice_id(int notice_id) {
        this.notice_id = notice_id;
    }

    public String getNdescriptions() {
        return ndescriptions;
    }

    public void setNdescriptions(String ndescriptions) {
        this.ndescriptions = ndescriptions;
    }

    public Collection<Notice> getNotice() {
        return pbl.getAllNotice();
    }

    public void setNotice(Collection<Notice> notice) {
        this.notice = notice;
    }

    //Feedback
    
    public int getFeedback_id() {
        return feedback_id;
    }

    public void setFeedback_id(int feedback_id) {
        this.feedback_id = feedback_id;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Collection<Feedback> getFeedback() {
        return pbl.getAllFeedback();
    }

    public void setFeedback(Collection<Feedback> feedback) {
        this.feedback = feedback;
    }
    
    //Timelist

    public int getTimelist_id() {
        return timelist_id;
    }

    public void setTimelist_id(int timelist_id) {
        this.timelist_id = timelist_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Collection<Timelist> getTimelist() {
        return pbl.getAllTimelist();
    }

    public void setTimelist(Collection<Timelist> timelist) {
        this.timelist = timelist;
    }

    
    //EJB
    
    public PublishBeanLocal getPbl() {
        return pbl;
    }
    
     public void setPbl(PublishBeanLocal pbl) {    
        this.pbl = pbl;
    }

    /**
     * Creates a new instance of admin
     */
   

    public Admin() {
    }
    
    //CategoryMaster
    
    public String addCategoryMaster(){
        try{
            
            if(category_id==0){
                pbl.addCategoryMaster(category_type);
                category_type= null;
                System.out.println("Data Inserted !!!");
            }
            else{
                pbl.updateCategoryMaster(category_id, category_type);
                category_id = 0;
                category_type= null;
                System.out.println("Data updated !!! ");
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        return "";
    }
    public String updateCategoryMaster(int id){
        try{
            
            category_type = pbl.CategoryTypeById(id);
            category_id = id;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }
    
    public String removeCategoryMaster(int category_id){
        try{
            
            pbl.removeCategoryMaster(category_id);
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }
    
    //StateMaster
    
    public String addStateMaster(){
        try{
            
            if(state_id==0){
                pbl.addStateMaster(state_name);
                state_name= null;
                System.out.println("Data Inserted !!!");
            }
            else{
                pbl.updateStateMaster(state_id, state_name);
                state_id = 0;
                state_name= null;
                System.out.println("Data updated !!! ");
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        return "";
    }
    
    public String updateStateMaster(int id){
        try{
            
            state_name = pbl.StateNameById(id);
            state_id = id;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }
    
    public String removeStateMaster(int state_id){
        try{
            
            pbl.removeStateMaster(state_id);
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }
    
    //PaymentMaster
    
    public String addPaymentMaster(){
        try{
            
            if(payment_id==0){
                pbl.addPaymentMaster(payment_mode);
                payment_mode= null;
                System.out.println("Data Inserted !!!");
            }
            else{
                pbl.updatePaymentMaster(payment_id, payment_mode);
                payment_id = 0;
                payment_mode= null;
                System.out.println("Data updated !!! ");
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        return "";
    }
    public String updatePaymentMaster(int id){
        try{
            
            payment_mode = pbl.PaymentModeById(id);
            payment_id = id;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }
    
    public String removePaymentMaster(int payment_id){
        try{
            
            pbl.removePaymentMaster(payment_id);
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }
    
    //Events
    
    public String addEvents(){
        try{
            
            if(event_id==0){
                pbl.addEvents(event_name, description);
                event_name=null;
                description=null;
                System.out.println("Data Inserted !!!");
            }
            else{
                pbl.updateEvents(event_id, event_name, description);
                event_id = 0;
                event_name=null;
                description=null;
                System.out.println("Data updated !!! ");
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        return "";
    }
 public String updateEvents(int id){
        try{
           event_name = pbl.EventNameById(id);
           description = pbl.DesriptionById(id);
           event_id = id; 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }
    
 public String removeEvents(Integer event_id){
        try{
            pbl.removeEvents(event_id);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }
 
 //Rules
 
 public String addRules(){
        try{
            
            if(rules_id==0){
                pbl.addRules(description);
                description= null;
                System.out.println("Data Inserted !!!");
            }
            else{
                pbl.updateRules(rules_id, description);
                rules_id = 0;
                description= null;
                System.out.println("Data updated !!! ");
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        return "";
    }
 
    public String updateRules(int id){
        try{
           description = pbl.DesriptionsById(id);
           rules_id = id; 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }
    
 public String removeRules(Integer rules_id){
        try{
            pbl.removeRules(rules_id);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }
 
 //Notice
 
 public String addNotice(){
        try{
            
            if(notice_id==0){
                pbl.addNotice(description);
                description= null;
                System.out.println("Data Inserted !!!");
            }
            else{
                pbl.updateNotice(notice_id, description);
                notice_id = 0;
                description= null;
                System.out.println("Data updated !!! ");
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        return "";
    }
 
    public String updateNotice(int id){
        try{
           description = pbl.NDesriptionsById(id);
           notice_id = id; 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }
    
 public String removeNotice(Integer notice_id){
        try{
            pbl.removeNotice(notice_id);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }
 
 //Feedback
 
    public String removeFeedback(Integer feedback_id){
        try{
            pbl.removeFeedback(feedback_id);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }
    
    //Timelist
    
     public String addTimelist(){
        try{
            
            if(timelist_id==0){
                pbl.addTimelist(time, day);
                time = null;
                day = null;
                System.out.println("Data Inserted !!!");
            }
            else{
                pbl.updateTimelist(timelist_id, time, day);
                timelist_id = 0;
                time = null;
                day = null;
                System.out.println("Data updated !!! ");
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        return "";
    }
 
    public String updateTimelist(int id){
        try{
           time = pbl.TimeById(id);
           day = pbl.DayById(id);
           timelist_id = id; 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }
    
 public String removeTimelist(Integer timelist_id){
        try{
            pbl.removeTimelist(timelist_id);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }
 
    //CityMaster
 
     public String addCityMaster(){
        try{
            
            if(this.city_id==0)
                pbl.addCityMaster(city_name, state_id);
            else
                pbl.updateCityMaster(city_id, city_name, state_id);
            this.city_id = 0;
            this.city_name = null;
            this.state_id = 0;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        return "";
    }

     public String updateCityMaster(int city_id){
        
        CityMaster cityMaster = pbl.findCityMasterById(city_id);
        this.city_id = cityMaster.getCityId();
        this.city_name = cityMaster.getCityName();
        this.state_id = cityMaster.getStateId().getStateId();
        
        return "";
    }
    
    
    public String removeCityMaster(Integer city_id){
        try{
            pbl.removeCityMaster(city_id);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }
    
    //PaymentDetail
    
     public String addPaymentDetail(){
        try{
            
            if(this.payment_detail_id==0)
                pbl.addPaymentDetail(payment_id, cvv, bank_name, ifsc_code);
            else
                pbl.updatePaymentDetail(payment_detail_id, payment_id, cvv, bank_name, ifsc_code);
            this.payment_detail_id = 0;
            this.payment_id = 0;
            this.cvv = 0;
            this.bank_name = null;
            this.ifsc_code = null;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        return "";
    }

     public String updatePaymentDetail(int payment_detail_id){
        
        PaymentDetail paymentDetail = pbl.findPaymentDetailById(payment_detail_id);
        this.payment_detail_id = paymentDetail.getPaymentDetailId();
        this.payment_id = paymentDetail.getPaymentId().getPaymentId();
        this.cvv = paymentDetail.getCvv();
        this.bank_name = paymentDetail.getBankName();
        this.ifsc_code = paymentDetail.getIfscCode();
        
        return "";
    }
     
     public String removePaymentDetail(Integer payment_detail_id){
        try{
            pbl.removePaymentDetail(payment_detail_id);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }
     
     
     public String addHostel(){
        try{
            
            if(this.hostel_id==0)
                pbl.addHostel(hostel_name, city_id, state_id, phone_no, category_id);
            else
                pbl.updateHostel(hostel_id, hostel_name, city_id, state_id, phone_no, category_id);
            
            this.hostel_id = 0;
            this.hostel_name = null;
            this.city_id = 0;
            this.state_id = 0;
            this.phone_no = null;
            this.category_id = 0;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        return "";
    }

     public String updateHostel(int hostel_id){
         
         Hostel hostel = pbl.findHostelById(hostel_id);
         this.hostel_id = hostel.getHostelId();
         this.hostel_name = hostel.getHostelName();
         this.city_id = hostel.getCityId().getCityId();
         this.state_id = hostel.getStateId().getStateId();
         this.phone_no = hostel.getPhoneNo();
         this.category_id = hostel.getCategoryId().getCategoryId();
        
        return "";
    }
     
     public String removeHostel(Integer hostel_id){
        try{
            pbl.removeHostel(hostel_id);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }
     
     public String addRoom(){
        try{
            
            if(this.room_id==0)
                pbl.addRoom(room_type, category_id, hostel_id, room_price, room_status, no_of_student);
            else
                pbl.updateRoom(room_id, room_type, category_id, hostel_id, room_price, room_status, no_of_student);
            
            this.room_id = 0;
            this.room_type = null;
            this.category_id = 0;
            this.hostel_id = 0;
            this.room_price = 0;
            this.room_status = null;
            this.no_of_student = 0;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        return "";
    }

     public String updateRoom(int room_id){
         
         Room room = pbl.findRoomById(room_id);
         this.room_id = room.getRoomId();
         this.room_type = room.getRoomType();
         this.category_id = room.getCategoryId().getCategoryId();
         this.hostel_id = room.getHostelId().getHostelId();
         this.room_price = room.getRoomPrice();
         this.room_status = room.getRoomStatus();
         this.no_of_student = room.getNoOfStudent();
         
        
        return "";
    }
     
     public String removeRoom(Integer room_id){
        try{
            pbl.removeRoom(room_id);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }
     
     public String addBooking(){
        try{
            
            if(this.booking_id==0)
                pbl.addBooking(user_id, room_id, payment_id, booking_date);
            else
                pbl.updateBooking(booking_id, user_id, room_id, payment_id, booking_date);
            
            this.booking_id = 0;
            this.user_id = 0;
            this.room_id = 0;
            this.payment_id = 0;
            this.booking_date = null;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        return "";
    }

     public String updateBooking(int booking_id){
         
         Booking booking = pbl.findBookingById(booking_id);
         this.booking_id = booking.getBookingId();
         this.user_id = booking.getUserId().getUserId();
         this.room_id = booking.getRoomId().getRoomId();
         this.payment_id = booking.getPaymentId().getPaymentId();
         this.booking_date = booking.getBookingDate();
        
        
        return "";
    }
     
     public String removeBooking(Integer booking_id){
        try{
            pbl.removeBooking(booking_id);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }
     
   //Facilities
     
   public String addFacilities(){
       
       try{
            
            if(this.facilities_id==0)
                pbl.addFacilities(hostel_id, facilities_detail);
            else
                pbl.updateFacilities(facilities_id, hostel_id, facilities_detail);
            
            this.facilities_id = 0;
            this.hostel_id = 0;
            this.facilities_detail = null;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        return "";
    }

   public String updateFacilities(int facilities_id){
         
         Facilities facilities = pbl.findFacilitiesById(facilities_id);
         this.facilities_id = facilities.getFacilitiesId();
         this.hostel_id = facilities.getHostelId().getHostelId();
         this.facilities_detail = facilities.getFacilitiesDetail();
        
        
        return "";
    }
   
    public String removeFacilities(Integer facilities_id){
        try{
            pbl.removeFacilities(facilities_id);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }
       
       
   }  
 

    

