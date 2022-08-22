/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejb;



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
import java.util.Collection;
import javax.ejb.Local;

/**
 *
 * @author meetk
 */
@Local
public interface PublishBeanLocal {
    
    void addBooking(Integer user_id, Integer room_id,Integer payment_id,String booking_date);
    void updateBooking(Integer booking_id,Integer user_id,Integer room_id,Integer payment_id, String booking_date);
    void removeBooking(Integer booking_id);
    Collection<Booking> getAllBookings();
    Collection<Booking> getBookingsOfUserMaster(Integer user_id);
    Collection<Booking> getBookingsOfRoom(Integer room_id);
    Collection<Booking> getBookingsOfPaymentId(Integer payment_id);
    Collection<Booking> getBookingsByBookingDate(String booking_date);
    Booking findBookingById(Integer booking_id);
    
    void addCategoryMaster(String category_type);
    void updateCategoryMaster(Integer category_id,String category_type);
    void removeCategoryMaster(Integer category_id);
    public String CategoryTypeById(Integer category_id);
    Collection<CategoryMaster> getAllCategoryMasters();
    Collection<CategoryMaster> getCategoryMastersByCategoryType(String category_type);
    CategoryMaster findCategoryMasterById(Integer category_id);
        
    void addCityMaster(String city_name,Integer state_id);
    void updateCityMaster(Integer city_id,String city_name,Integer state_id);
    void removeCityMaster(Integer city_id);
    public String CityNameById(Integer city_id);
    Collection<CityMaster> getAllCityMasters();
    Collection<CityMaster> getCityMasterOfStateId(Integer state_id);
    Collection<CityMaster> getCityMastersByCityName(String city_name);
    CityMaster findCityMasterById(Integer city_id);
    
    void addHostel(String hostel_name,Integer city_id,Integer state_id,String phone_no,Integer category_id);
    void updateHostel(Integer hostel_id,String hostel_name,Integer city_id,Integer state_id,String phone_no,Integer category_id);
    void removeHostel(Integer hostel_id);
    Collection<Hostel> getAllHostels();
    Collection<Hostel> getHostelsOfCityId(Integer city_id);
    Collection<Hostel> getHostelsOfStateId(Integer state_id);
    Collection<Hostel> getHostelsOfCategoryId(Integer category_id);
    Collection<Hostel> getHostelsByHostelName(String hostel_name);
    Collection<Hostel> getHostelsByPhoneNo(String phone_no);
    Hostel findHostelById(Integer hostel_id);
    
    
    void addPaymentMaster(String payment_mode);
    void updatePaymentMaster(Integer payment_id,String payment_mode);
    void removePaymentMaster(Integer payment_id);
    public String PaymentModeById(Integer payment_id);
    Collection<PaymentMaster> getAllPaymentMasters();
    Collection<PaymentMaster> getPaymentMastersByPaymentMode(String payment_mode);
    PaymentMaster findPaymentMasterById(Integer payment_id);
    
    void addPaymentDetail(Integer payment_id,Integer cvv,String bank_name,String ifsc_code);
    void updatePaymentDetail(Integer payment_detail_id,Integer payment_id,Integer cvv,String bank_name,String ifsc_code);
    void removePaymentDetail(Integer payment_detail_id);
    Collection<PaymentDetail> getAllPaymentDetails();
    Collection<PaymentDetail> getPaymentDetailOfPaymentId(Integer payment_id);
    Collection<PaymentDetail> getPaymentDetailsByCvv(Integer cvv);
    Collection<PaymentDetail> getPaymentDetailsByBankName(String bank_name);
    Collection<PaymentDetail> getPaymentDetailsByIfscCode(String ifsc_code);
    PaymentDetail findPaymentDetailById(Integer payment_detail_id);
    
    void addRoom(String room_type,Integer category_id,Integer hostel_id,Integer room_price,Boolean room_status,Integer no_of_student);
    void updateRoom(Integer room_id,String room_type,Integer category_id,Integer hostel_id,Integer room_price,Boolean room_status,Integer no_of_student);
    void removeRoom(Integer room_id);
    Collection<Room> getAllRooms();
    Collection<Room> getRoomsOfCategoryId(Integer category_id);
    Collection<Room> getRoomsOfHostelId(Integer hostel_id);
    Collection<Room> getRoomsByRoomType(String room_type);
    Collection<Room> getRoomsByRoomPrice(Integer room_price);
    Collection<Room> getRoomsByRoomtStatus(Boolean room_status);
    Collection<Room> getRoomsByNoOfStudent(Integer no_of_student);
    Room findRoomById(Integer room_id);
    
    void addStateMaster(String state_name);
    void updateStateMaster(Integer state_id,String state_name);
    void removeStateMaster(Integer state_id);
    public String StateNameById(Integer state_id);
    Collection<StateMaster> getAllStateMasters();
    Collection<StateMaster> getStateMastersByStateName(String state_name);
    StateMaster findStateMasterById(Integer state_id);
    
    void addUserMaster(String username,String first_name,String last_name,String address,String phone_no,String dob,String gender,String photo,String user_email,String password,String father_name,String f_occupation,String f_phone_no,String f_email,String mother_name,String m_occupation,String nationality,Integer city_id,Integer state_id,Integer pincode,String admin);
    void updateUserMaster(Integer user_id,String first_name,String last_name,String address,String phone_no,String dob,String gender,String photo,String user_email,String password,String father_name,String f_occupation,String f_phone_no,String f_email,String mother_name,String m_occupation,String nationality,Integer city_id,Integer state_id,Integer pincode);
    void removeUserMaster(Integer user_id);
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
    
    void addEvents(String event_name,String description);
    void updateEvents(Integer event_id,String event_name,String description);
    void removeEvents(Integer event_id);
    public String EventNameById(Integer event_id);
    public String DesriptionById(Integer event_id);
    Collection<Events> getAllEvents();
    Collection<Events> getEventsByEventName(String event_name);
    Collection<Events> getEventsByDescription(String description);
    Events findEventsById(Integer event_id);
    
    void addNotice(String description);
    void updateNotice(Integer notice_id,String description);
    void removeNotice(Integer notice_id);
    public String NDesriptionsById(Integer notice_id);
    Collection<Notice> getAllNotice();
    Collection<Notice> getNoticeByDescription(String description);
    Notice findNoticeById(Integer notice_id);
    
    void addRules(String description);
    void updateRules(Integer rules_id,String description);
    void removeRules(Integer rules_id);
    public String DesriptionsById(Integer rules_id);
    Collection<Rules> getAllRules();
    Collection<Rules> getRulesByDescription(String description);
    Rules findRulesById(Integer rules_id);
    
    void addTimelist(String time,String day);
    void updateTimelist(Integer timelist_id,String time,String day);
    void removeTimelist(Integer timelist_id);
    public String TimeById(Integer timelist_id);
    public String DayById(Integer timelist_id);
    Collection<Timelist> getAllTimelist();
    Collection<Timelist> getTimelistByTime(String time);
    Collection<Timelist> getTimelistByDay(String day);
    Timelist findTimelistById(Integer timelist_id);
    
    
    void removeFeedback(Integer feedback_id);
    Collection<Feedback> getAllFeedback();
    Feedback findFeedbackById(Integer feedback_id);

    void addFacilities(Integer hostel_id, String facilities_detail);
    void updateFacilities(Integer facilities_id,Integer hostel_id, String facilities_detail);
    void removeFacilities(Integer facilities_id);
    Collection<Facilities> getAllFacilities();
    Collection<Facilities> getFacilitiesOfHostelId(Integer hostel_id);
    Collection<Facilities> getFacilitiesByFacilitiesDetail(String facilities_detail);
    Facilities findFacilitiesById(Integer facilities_id);

    
}
