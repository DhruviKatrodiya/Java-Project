/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejb;

import Entity.Booking;
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
import java.sql.Time;
import java.util.Collection;
import java.util.Date;
import javax.ejb.Local;

/**
 *
 * @author meetk
 */
@Local
public interface UserBeanLocal {
    
    void addUserMaster(String username,String first_name,String last_name,String address,String phone_no,String dob,String gender,String photo,String user_email,String password,String father_name,String f_occupation,String f_phone_no,String f_email,String mother_name,String m_occupation,String nationality,Integer city_id,Integer state_id,Integer pincode,String user);
    void updateUserMaster(Integer user_id,String first_name,String last_name,String address,String phone_no,String dob,String gender,String photo,String user_email,String password,String father_name,String f_occupation,String f_phone_no,String f_email,String mother_name,String m_occupation,String nationality,Integer city_id,Integer state_id,Integer pincode);
    Collection<UserMaster> getAllUserMasters();
    Collection<UserMaster> getUserMastersOfCityId(Integer city_id);
    Collection<UserMaster> getUserMastersOfStateId(Integer state_id);
    UserMaster getUserMasterByUserName(String username);
    Collection<UserMaster> getUserMastersByFirstName(String first_name);
    Collection<UserMaster> getUserMastersByLastName(String last_name);
    Collection<UserMaster> getUserMastersByAddress(String address);
    Collection<UserMaster> getUserMastersByPhoneNo(String phone_no);
    Collection<UserMaster> getUserMastersByDob(String dob);
    Collection<UserMaster> getUserMastersByGender(String gender);
    Collection<UserMaster> getUserMastersByPhoto(String photo);
    Collection<UserMaster> getUserMastersByUserEmail(String user_email);
    Collection<UserMaster> getUserMastersByPassword(String password);
    Collection<UserMaster> getUserMastersByFatherName(String father_name);
    Collection<UserMaster> getUserMastersByFOccupation(String f_occupation);
    Collection<UserMaster> getUserMastersByFPhoneNo(String f_phone_no);
    Collection<UserMaster> getUserMastersByFEmail(String f_email);
    Collection<UserMaster> getUserMastersByMotherName(String mother_name);
    Collection<UserMaster> getUserMastersByMOccupation(String m_occupation);
    Collection<UserMaster> getUserMastersByNationality(String nationality);
    Collection<UserMaster> getUserMastersByPincode(Integer pincode);
    UserMaster findUserMasterById(Integer user_id);
    
    void addCityMasterToStateMaster(String city_name,Integer state_id);
    Collection<CityMaster> getAllCityMasters();
    Collection<CityMaster> getCityMasterOfStateId(Integer state_id);
    Collection<CityMaster> getCityMastersByCityName(String city_name);
    CityMaster findCityMasterById(Integer city_id);
    
     void addStateMaster(String state_name);
    Collection<StateMaster> getAllStateMasters();
    Collection<StateMaster> getStateMastersByStateName(String state_name);
    StateMaster findStateMasterById(Integer state_id);
    
    void addBooking(Integer user_id, Integer room_id,Integer payment_id,String booking_date);
    void updateBooking(Integer booking_id,Integer user_id,Integer room_id,Integer payment_id, String booking_date);
    Collection<Booking> getAllBookings();
    Collection<Booking> getBookingsOfUserMaster(Integer user_id);
    Collection<Booking> getBookingsOfRoom(Integer room_id);
    Collection<Booking> getBookingsOfPaymentId(Integer payment_id);
    Collection<Booking> getBookingsByBookingDate(String booking_date);
    Booking findBookingById(Integer booking_id);
    
    Collection<Hostel> getAllHostels();
    Hostel findHostelById(Integer hostel_id);
    
    void addPaymentMaster(String payment_mode);
    Collection<PaymentMaster> getAllPaymentMasters();
    Collection<PaymentMaster> getPaymentMastersByPaymentMode(String payment_mode);
    PaymentMaster findPaymentMasterById(Integer payment_id);
    
    void addPaymentDetail(Integer payment_id,Integer cvv,String bank_name,String ifsc_code);
    Collection<PaymentDetail> getAllPaymentDetails();
    Collection<PaymentDetail> getPaymentDetailOfPaymentId(Integer payment_id);
    Collection<PaymentDetail> getPaymentDetailsByCvv(Integer cvv);
    Collection<PaymentDetail> getPaymentDetailsByBankName(String bank_name);
     Collection<PaymentDetail> getPaymentDetailsByIfscCode(String ifsc_code);
     PaymentDetail findPaymentDetailById(Integer payment_detail_id);
    
    
    Collection<Room> getAllRooms();
    Room findRoomById(Integer room_id);
    
    
    Collection<Events> getAllEvents();
    Events findEventsById(Integer event_id);
    
   
    Collection<Notice> getAllNotice();
    Notice findNoticeById(Integer notice_id);
    
    Collection<Rules> getAllRules();
    Rules findRulesById(Integer rules_id);
    
    
    Collection<Timelist> getAllTimelist();
    Timelist findTimelistById(Integer timelist_id);
    
    void addFeedback(String comments);  
    Collection<Feedback> getAllFeedback();
    Collection<Feedback> getFeedbackByComments(String comments);
    Feedback findFeedbackById(Integer feedback_id);
    
    
    
    
}
